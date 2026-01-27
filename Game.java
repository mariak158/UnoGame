import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private ArrayList<Player> players; 
    private Deck deck;          
    private Card currentCard;  
    private int currentPlayerIndex; 
    private int direction; 

    public Game(ArrayList<Player> players) {
        this.players = players;   
        this.deck = new Deck();         
        this.direction = 1;             
        this.currentPlayerIndex = 0;    
        distributeCards();
        this.currentCard = deck.draw();
    }
    //for each player we give them 7 cards
    public void distributeCards() {
        for (Player player : players) {
            for (int i = 0; i < 7; i++) {
                player.drawCard(deck.draw());
            }
        }
    }

    public int getdirection() {
        return this.direction;
    }

    public void setdirection(int direction) {
        this.direction = direction;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Player player = players.get(currentPlayerIndex);
            System.out.println("------round------");
            System.out.println("\nCurrent card: " + currentCard);
            System.out.println(player.getName() + "'s turn");

            displayPlayerHand(player);
            displayPlayableCards(player, currentCard);

            ArrayList<Card> hand = player.getHand();
            ArrayList<Card> playable = new ArrayList<>();
            // prcourire toute hand pour construire playable array array of playable cards
            for (Card c : hand) {
                if (c.canBePlayed(currentCard)) {
                    playable.add(c);
                }
            }

            if (playable.isEmpty()) {
                Card drawn = deck.draw();
                player.drawCard(drawn);
                System.out.println(player.getName() + " draws a card: " + drawn);
                nextTurn();
                continue;
            }
            //loop to treat the card selection
            System.out.println("Select a card to play (number):");
            int choice = -1;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= playable.size()) break; //on sort du 
                    System.out.println("Invalid choice, try again:");
                } catch (NumberFormatException e) {
                    System.out.println("Enter a number:");
                }
            }

            Card playedCard = playable.get(choice - 1);
            player.getHand().remove(playedCard);

            if (playedCard instanceof Wild || playedCard instanceof WildDrawFour) {
                Color chosenColor = player.chooseColor(scanner);
                playedCard.setColor(chosenColor);
            }

            currentCard = playedCard; // apdate th current card
                  
            player.sayUno(); 
            if (playedCard instanceof Actionable) {
                ((Actionable) playedCard).applyEffect(this, player);
            }

            if (player.hasWon()) {
                System.out.println(player.getName() + " wins!");
                break;//end of the game
            }

            nextTurn();
        }
    }

    public void nextTurn() {
        currentPlayerIndex = (currentPlayerIndex + direction + players.size()) % players.size();
    }

    public Deck getDeck() {
        return deck;
    }
         // mosta3mala fi card skib applay effect
    public void skipNextPlayer() {
        nextTurn();
    }
    //mosta3mala fi card
    public void reverseDirection() {
        direction = -direction;
    }

    public Player getNextPlayer() {
        int index = (currentPlayerIndex + direction + players.size()) % players.size();
        return players.get(index);
    }

    public void displayPlayerHand(Player player) {
        System.out.println("\n" + player.getName() + "'s hand:");
        ArrayList<Card> hand = player.getHand();
        for (int i = 0; i < hand.size(); i++) {
            System.out.println("  " + (i + 1) + ") " + hand.get(i));
        }
    }

   public void displayPlayableCards(Player player, Card currentCard) {
    System.out.println("\n" + player.getName() + "'s playable cards:");
    ArrayList<Card> hand = player.getHand();
    int playableCount = 0;

    // go through each card and only number the playable ones
    for (int i = 0; i < hand.size(); i++) {
        Card c = hand.get(i);
        if (c.canBePlayed(currentCard)) {
            playableCount++;
            System.out.println("  " + playableCount + ") " + c);
        }
    }

    if (playableCount == 0) {
        System.out.println("  No playable cards. You must draw a card.");
    }
}

}

