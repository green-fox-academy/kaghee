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
        Card curr = deck.get(0);
        deck.remove(0);
        return curr;
    }

    public Card drawLast() {
        Card curr = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return curr;
    }

    public Card drawRandom() {
        int index = (int)(Math.random() * deck.size());
        Card curr = deck.get(index);
        deck.remove(index);
        return curr;
    }
}
