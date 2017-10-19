package twentyone;

public class Card {
    int rank;
    String suit;

    public enum Colour {
        RED, BLACK
    }

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

        int value;

        private Rank(int value) {
            this.value = value;
        }
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank.value;
        this.suit = suit.toString();
    }

}
