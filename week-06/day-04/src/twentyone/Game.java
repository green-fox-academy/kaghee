package twentyone;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts("l");
        parser.accepts("a").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("a")) {
            System.out.println("`-a` was given with the argument " + options.valueOf("a"));
        }

        if (options.has("l")) {
            System.out.println("`-l` was given with the no additional information.");
        }


        int oppScore = (int)(Math.random() * 6 + 15);
        int score = 0;
        Deck d = new Deck();
        d.shuffleDeck();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the game. Do you want to draw a card? y/n");
        while (score <= 21 && sc.nextLine().equals("y")) {
            score += d.drawFirst().rank;
            if (score > 21) break;
            System.out.println("Your score is " + score + ". Do you want to draw a card? y/n");
        }

        if (score > 21) {
            System.out.println("Your score is " + score + ". You lose!");
        } else if (score < oppScore) {
            System.out.println("Your score is " + score + " and mine is " + oppScore + ". You lose!");
        } else {
            System.out.println("My score was " + oppScore + ". Congrats, you win!");
        }

    }
}
