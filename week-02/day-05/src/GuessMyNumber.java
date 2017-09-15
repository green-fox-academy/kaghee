import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What should the range be?");
        int range = scanner.nextInt();
        int a = (int)(Math.random() * range);                       // The number to be guessed
        int lives = range / 100 + 4;                                // Number of lives is 5 if the range is 100,
                                                                    // then 1 life added for every +100
        System.out.println("I have the number between 1-" + range + ". You have " + lives + " lives. Take a guess.");
        int guess = scanner.nextInt();

        while (guess != a && lives > 1) {
            if (guess > a) {
                lives--;
                System.out.println("The stored number is lower. You have " + lives + " lives left.");
                System.out.println("Take a guess.");
                guess = scanner.nextInt();

            } else if (guess < a){
                lives--;
                System.out.println("The stored number is higher. You have " + lives + " lives left.");
                System.out.println("Take a guess.");
                guess = scanner.nextInt();
            }
        }
        if (guess == a) {
            System.out.println("You found the number: " + a);
        } else {
            System.out.println("Game over! The number was " + a + ".");
        }
    }
}