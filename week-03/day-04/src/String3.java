public class String3 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".

        System.out.println(starAdder("kisroka"));
    }

    public static String starAdder(String input) {
        if (input.length() == 0) {
            return "";
        }

        return starAdder(input.substring(0, input.length() - 1)) + input.substring(input.length() - 1, input.length()) + "*";
    }
}
