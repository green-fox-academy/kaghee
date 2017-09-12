public class Factorio {
    public static void main(String[] args) {
        System.out.println(factorio(5));
    }

    public static int factorio (int until) {
        int result = 1;
        for (int i = 1; i < until; i++) {
            result *= i;
        }
        return result;
    }
}