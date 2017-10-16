import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Poker pokerGame = new Poker();

        pokerGame.deck.shuffle();
        pokerGame.deal();

        System.out.println(pokerGame.black);
        System.out.println(pokerGame.white);

        System.out.println(pokerGame.findMax(pokerGame.black));
        System.out.println(pokerGame.findMax(pokerGame.white));
    }
}
