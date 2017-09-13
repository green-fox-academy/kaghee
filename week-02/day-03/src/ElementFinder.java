import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        // Solution #1
        boolean isThereSeven = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(7)) {
                isThereSeven = true;
            }
        }

        if (isThereSeven == true) {
            System.out.println("Hooray!");
        } else {
            System.out.println("Nooooo");
        }

        // Solution #2
        if (arrayList.contains(7)) {
            System.out.println("There's a 7 in there somewhere!");
        } else {
            System.out.println("Damn, no sevens could be found.");
        }
    }
}