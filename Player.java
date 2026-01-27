import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private ArrayList<Card> hand; 
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
// i think name gethandcount bettre
    public int getCardCount() { 
        return hand.size();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
 //card is the top of the deck
    public void drawCard(Card card) {
        hand.add(card);
    }

    public Card playCard(int index) { 
        return hand.remove(index); 
    }

    public boolean hasWon() {   
        return hand.isEmpty();
    }

    public void sayUno() {
        if (hand.size() == 1) {
            System.out.println(name + " says UNO!");
        }
    }

    public void showCards() {
        System.out.println(name + "'s Cards:");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ") " + hand.get(i));
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public Color chooseColor(Scanner scanner) {
        System.out.println("Choose a color: 1) RED 2) BLUE 3) GREEN 4) YELLOW");
        int choice = -1;
        while (true) {
            try {
            	String input = scanner.nextLine();   //scan a text  
            	choice = Integer.parseInt(input);    // n7awloh l integer bhad syntax
                if (choice >= 1 && choice <= 4) break;
            } catch (Exception e) {}
            System.out.println("Invalid choice. Try again:");
        }
        
             // i add a discreption,,
        switch (choice) {
            case 1: System.out.println(name + " chose the color: " + Color.red);
                    return Color.red;
            case 2: System.out.println(name + " chose the color: " + Color.blue);
            	    return Color.blue;
            case 3: System.out.println(name + " chose the color : " + Color.blue);
            	    return Color.green;
            	    
            default: System.out.println(name + " chose the color: " + Color.yellow);
            	    return Color.yellow;
            
        }
    }
}
