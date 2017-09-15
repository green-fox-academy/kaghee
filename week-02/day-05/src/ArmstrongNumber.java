import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number.");
        int input = scanner.nextInt();

        System.out.println(isArmstrong(input));
    }

    static boolean isArmstrong(int a) {
        String number = Integer.toString(a);

        double[] digits = new double[number.length()];

        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';         // if you subtract '0' from the char value, you don't have to bother with ASCII codes
        }

        double result = 0;
        for (int i = 0; i < digits.length; i++) {
            result += Math.pow(digits[i], digits.length);
        }

        if (result == a) {
            return true;
        } else {
            return false;
        }
    }
}