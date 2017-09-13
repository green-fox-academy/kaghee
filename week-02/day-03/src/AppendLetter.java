import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        // Add "a" to every string in the far list.

        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

        ArrayList<String> farther = new ArrayList<>(far);

        for (int i = 0; i < far.size(); i++) {
            StringBuilder builder = new StringBuilder(far.get(i));
            builder.append("a");

            far.set(i, builder.toString());
        }
        System.out.println(far);
    }
}