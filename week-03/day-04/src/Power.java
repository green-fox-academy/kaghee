public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

        System.out.println(power(12, 4));
    }

    public static int power(int base, int n) {
        int result = base;
        if (n == 1) {
            return result;
        } else {
            result *= power(base, n - 1);
            return result;
        }
    }
}
