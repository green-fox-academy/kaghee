public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        System.out.println(xRemover("xjajxdxejxxxo"));
    }

    public static String xRemover(String input) {
        if (input.length() == 0) {
            return "";
        }

        String last = input.substring(input.length() - 1, input.length());
        String main = input.substring(0, input.length() - 1);

        if (last.equals("x")) {
            return xRemover(main);
        } else {
            return xRemover(main) + last;
        }
    }
}
