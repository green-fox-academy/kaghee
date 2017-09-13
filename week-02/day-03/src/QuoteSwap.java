import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code

        // Also, print the sentence to the output with spaces in between.

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        String s = list.get(2);
        list.set(2, list.get(5));
        list.set(5, s);

        String quote = "";
        for (int i = 0; i < list.size(); i++) {
            quote += list.get(i) + " ";
        }

        System.out.println(quote);
    }
}