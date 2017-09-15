import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a word or phrase:");
        System.out.println(palindrome(scanner.nextLine()));
    }

    static String palindrome(String input) {
        String result = input;
        for (int i = input.length() - 1; i >= 0 ; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}