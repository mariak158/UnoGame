


import java.util.ArrayList;
import java.util.Collections;



public class Deck {
  private ArrayList<Card> deck;
  public Deck() {
    deck= new ArrayList<Card>();
        createDeck();
        shuffle();
}

  public  void createDeck() {

     
  }
    public  void shuffle() {
      
  Collections.shuffle(deck);
    }    
    public Card draw () {
      if( deck.isEmpty()) return null;
      return deck.remove(0);
    }
        public boolean isEmpty() {
          return deck.isEmpty();
        }
        public int size() {
          return deck.size();
        }
}