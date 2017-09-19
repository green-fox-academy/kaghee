import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the divisor.");
        int divisor = scanner.nextInt();
        divideByZero(divisor);
    }

    public static void divideByZero(int input) {
        try {
            System.out.println(10 / input);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
