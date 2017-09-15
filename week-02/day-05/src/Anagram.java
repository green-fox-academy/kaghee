import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("blue", "ul eb");
    }

    static void isAnagram(String a, String b) {
        char[] lettersA = new char[a.length()];
        char[] lettersB = new char[b.length()];

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                lettersA[i] = a.charAt(i);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != ' ') {
                lettersB[i] = b.charAt(i);
            }
        }

        System.out.println(lettersA);
        System.out.println(lettersB);

        int count = 0;
        String list, text;
        if (lettersA.toString().length() > lettersB.toString().length()) {
            count = lettersA.toString().length();
            list = lettersA.toString();
            text = lettersB.toString();
        } else {
            count = lettersB.toString().length();
            list = lettersB.toString();
            text = lettersA.toString();
        }


        boolean ifAllCharsOkay = true;
        for (int i = 0; i < count; i++) {
            if (!list.contains(String.valueOf(text.charAt(i)))) {
                ifAllCharsOkay = false;
            }
        }
        System.out.println(ifAllCharsOkay);
    }
}
