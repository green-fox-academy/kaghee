import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers' sum and average would you like to know? Please give me a number.");
        int count = scanner.nextInt();

        int sum = 0, avg;
        for (int i = 0; i < count; i++) {
            System.out.println("Please give me number #" + (i + 1) + ".");
            sum += scanner.nextInt();
        }

        avg = sum / count;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}