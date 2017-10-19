package twentyone;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int oppScore = (int)(Math.random() * 21 + 15);
        int score = 0;
        Deck d = new Deck();
        d.shuffleDeck();

        Scanner sc = new Scanner(System.in);

        System.out.println("The opponent's score is " + oppScore + ". Do you want to draw a card? y/n");
        while (sc.nextLine().equals("y")) {
            System.out.println(d.drawFirst());

            System.out.println("The opponent's score is " + oppScore + ". Do you want to draw a card? y/n");
        }


    }
}
