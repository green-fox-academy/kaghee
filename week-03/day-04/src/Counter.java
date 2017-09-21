public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
    }
    public static int counter(int n) {
        if (n == 1) {
            return 1;
        }
        return counter(n - 1);
    }
}
