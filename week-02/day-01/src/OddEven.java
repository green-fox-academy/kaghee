import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Give me a number");

        Scanner numScanner = new Scanner(System.in);
        int number = numScanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
