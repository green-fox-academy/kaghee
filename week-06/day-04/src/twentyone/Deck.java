package twentyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<>();

    public Deck() {

    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card drawFirst() {
        return deck.get(0);
    }

    public Card drawLast() {
        return deck.get(deck.size());
    }

    public Card drawRandom() {
        return deck.get((int)(Math.random() * deck.size()));
    }
}
