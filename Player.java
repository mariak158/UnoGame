

import java.util.ArrayList;

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
    public int getCardCount() {
        return hand.size();
    }
    public ArrayList<Card> getHand() {
        return hand;   //not done yet  possible cards li y9dro ytla3bo 
    }
    public void drawCard(Card deckTop) {
        hand.add(deckTop);
    }
    // yn7I UNEcart ml player hand
    public Card playCard(int index) {
        return hand.remove(index);
    }
    
    public boolean hasWon() {
        return hand.isEmpty();
    }
    
    public void sayUno() {
        if (hand.size() == 1) {
            System.out.println(name + "UNO");
        }
    }
    public void showCards() {
        System.out.println(name + "'s Cards:");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ") " + hand.get(i));
        }
    }
    
    public String toString() {
        return name;
    }
    
    // mayby add a method that abel the player the chose the color he want to insert in the wild card 
}