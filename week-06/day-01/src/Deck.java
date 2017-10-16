import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck;
    static final int SIZE = 52;
    String[] types;
    String[] figures;


    public Deck() {
        deck = new ArrayList<>();
        types = new String[]{"D", "H", "C", "S"};
        figures = new String[]{"A", "J", "Q", "K"};

    }

    public void generate() {
        for (int i = 0; i < SIZE; i++) {
            int curr = i / 4 + 1;
            String actualValue;

            if (curr > 1 && (curr) < 11) {
                actualValue = String.valueOf(curr);
            } else if ((curr) == 1) {
                actualValue = figures[0];
            } else {
                actualValue = figures[(curr) - 10];
            }
            deck.add(new Card((actualValue), types[i % 4]));

        }


    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public String deal() {
        ArrayList<Card> black = new ArrayList<>();
        ArrayList<Card> white = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                black.add(deck.get(i));
            } else {
                white.add(deck.get(i));
            }
        }
        return black.toString() + white.toString();
    }


}
