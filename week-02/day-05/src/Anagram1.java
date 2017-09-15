import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first word:");
        String firstWord = scanner.nextLine();

        System.out.println("Give me the second word:");
        String secondWord = scanner.nextLine();

        System.out.println(isAnagram(firstWord, secondWord));
    }

    public static boolean isAnagram(String a, String b) {
        boolean result = false;
        if (a.length() != b.length()) {
            result = false;
        } else {

            char[] lettersA = a.toCharArray();
            char[] lettersB = b.toCharArray();

            Arrays.sort(lettersA);
            Arrays.sort(lettersB);

            if (Arrays.equals(lettersA, lettersB)) {
                result = true;
            }
        }
        return result;
    }
}
