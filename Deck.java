import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        createDeck();
        shuffle();
    }

    public void createDeck() {
        deck.clear(); // clear old cards if recreating

        for (Color color : Color.values()) {
            if (color == Color.noColor) continue; // skip noColor for normal cards

            // number cards
            deck.add(new NumberCard(color, 0));
            for (int i = 1; i <= 9; i++) {
                deck.add(new NumberCard(color, i));
                deck.add(new NumberCard(color, i));
            }

            // action cards
            deck.add(new SkipCard(color));
            deck.add(new SkipCard(color));
            deck.add(new ReverseCard(color));
            deck.add(new ReverseCard(color));
            deck.add(new DrawTwo(color));
            deck.add(new DrawTwo(color));
        }

        // wild cards
        for (int i = 0; i < 4; i++) {
            deck.add(new Wild());
            deck.add(new WildDrawFour());
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card draw() {
        if (deck.isEmpty()) {
            createDeck();
            shuffle();
        }
        return deck.remove(0);
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public int size() {
        return deck.size();
    }
}
