import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int a = 89;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Take a guess.");
        int guess = scanner.nextInt();

        while (guess != a) {
            if (guess > a) {
                System.out.println("The stored number is lower");
                System.out.println("Take a guess.");
                guess = scanner.nextInt();

            } else if (guess < a){
                System.out.println("The stored number is higher");
                System.out.println("Take a guess.");
                guess = scanner.nextInt();
            }
        }
        System.out.println("You found the number: " + a);
    }
}