import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + number + " = " + number * i);
        }
    }
}