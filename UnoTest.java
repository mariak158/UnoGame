
public class UnoTest {		
	 public static void main(String[] args)
 {
		        // test for the deck
		    	
		        Deck deck = new Deck();// creat and ykhlet the deck 
		        System.out.println("the size of the deck is");
		        System.out.println(deck.size());
		        System.out.println("i will draw a card from the deck");
		        System.out.println( deck.draw());
		        System.out.println("the size of the deck is");
		        System.out.println(deck.size());
		        // test of the players
		        Player maria = new Player("Maria");
		        Player maroua= new Player("Maroua");

		        // Each player draws 7 cards
		        for (int i = 0; i < 7; i++) {
		           maria.drawCard( deck.draw());
		          maroua.drawCard(deck.draw());
		        }

		         
		        maria.showCards();
		        maroua.showCards();

		        // +4 L Maroua hhh
		      //  maroua.drawCard(deck);
		        //System.out.println("\nAfter drawing one more card:");
		    }
		}

