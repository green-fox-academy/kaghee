import java.util.Scanner;

public class PalindromeSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string pls");
        String input = scanner.nextLine();
        palindromeSearch(input);
    }

    static void palindromeSearch(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        System.out.println(reversed);

        for (int i = 0; i < text.length(); i++) {
            for (int j = i; j < text.length(); j++) {
                System.out.println(text.substring(i, j));
            }
        }
    }
}
