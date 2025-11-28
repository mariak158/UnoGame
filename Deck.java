


import java.util.ArrayList;
import java.util.Collections;



public class Deck {
  private ArrayList<Card> deck;
  public Deck() {
    deck= new ArrayList<Card>();
        creatDeck();
        shuffle();
}

  private void creatDeck() {
    // TODO Auto-generated method stub
    for(Card.Color c : Card.Color.values()) {
      if(c== Card.Color.noColor)continue;// ya3ni rahi wild  sma matas7a9sh color
      //add card value 0 one time
       deck.add(new Card(c, Card.Value.zero));
      //add other the other cards ( 1to9,skip,reverse,draw2) 2 times for each
      for ( Card.Value v: new Card.Value[] {
          Card.Value.one,Card.Value.two,Card.Value.three,Card.Value.four,Card.Value.five,Card.Value.six,Card.Value.seven,Card.Value.eight,Value.skip,Card.Value.reverse,Card.Value.draw_two })
      {
             deck.add(new Card(c, v));
             deck.add(new Card(c, v));
      }
    }
      //add wild cards (nocolor)
      for(int i=0; i<4;i++) {
        deck.add(new Card(Card.Color.noColor,Card.Value.wild));
        deck.add(new Card(Card.Color.noColor,Card.Value.wild_draw_four));
      }
    }
    private void shuffle() {
      // TODO Auto-generated method stub
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