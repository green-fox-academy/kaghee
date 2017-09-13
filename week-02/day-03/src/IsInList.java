import java.util.*;

public class IsInList{
    public static void main(String... args){
        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        int[] nums = {4, 8, 12, 16};
        boolean areTheyThere = true;

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]) == false) {
                areTheyThere = false;
            }
        }
        System.out.println(areTheyThere);
    }
}