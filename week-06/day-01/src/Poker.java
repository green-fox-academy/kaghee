import java.util.ArrayList;

public class Poker {
    ArrayList<Card> black;
    ArrayList<Card> white;
    Deck deck;

    public Poker() {
        black = new ArrayList<>();
        white = new ArrayList<>();
        deck = new Deck();
        deck.generate();
    }

    public void deal() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                black.add(deck.deck.get(i));
            } else {
                white.add(deck.deck.get(i));
            }
        }
    }

    public int findMax(ArrayList<Card> hand) {
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (hand.get(i).getValueInInt() > hand.get(i + 1).getValueInInt()) {
                max = hand.get(i).getValueInInt();
            } else {
                max = hand.get(i + 1).getValueInInt();
            }
        }
        return max;
    }




}
