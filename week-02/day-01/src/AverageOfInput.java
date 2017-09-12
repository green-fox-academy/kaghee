import java.util.Scanner;

public class AverageOfInput {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me four numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int sum = a + b + c + d;
        int avg = sum / 4;

        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}