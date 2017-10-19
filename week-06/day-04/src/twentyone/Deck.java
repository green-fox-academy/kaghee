package twentyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (Card.Rank r: Card.Rank.values()) {
            for (Card.Suit s: Card.Suit.values()) {
                deck.add(new Card(r, s));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card drawFirst() {
        return deck.get(0);
    }

    public Card drawLast() {
        return deck.get(deck.size() - 1);
    }

    public Card drawRandom() {
        return deck.get((int)(Math.random() * deck.size()));
    }
}
