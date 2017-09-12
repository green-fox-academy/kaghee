public class Printer {
    public static void main(String[] args) {
        System.out.println(printer("alma", "korte"));
    }

    public static String printer(String... input) {
        String result = "";
        for (int i = 0; i < input.length; i++ ) {
            result += input[i] + "\n";
        }
        return result;
    }
}