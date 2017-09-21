public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        System.out.println(xConverter("xerxes xoxo"));
    }

    public static String xConverter(String input) {
        if (input.length() == 0) {
            return "";
        }

        String last = input.substring(input.length() - 1, input.length());
        String main = input.substring(0, input.length() - 1);

        if (last.equals("x")) {
            return xConverter(main) + "y";
        } else {
            return xConverter(main) + last;
        }
    }
}
