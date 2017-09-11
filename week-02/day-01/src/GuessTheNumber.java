import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int a = 35;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Take a guess.");
        int guess = scanner.nextInt();

        while (guess != a) {
            if (guess > a)
        }

    }
}
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
