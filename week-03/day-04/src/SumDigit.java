public class SumDigit {
    public static void main(String[] args) {
        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        System.out.println(sumDigit(4134));
    }

    public static int sumDigit(int n) {
        int result = n % 10;
        if (n % 10 == n) {
            return result;
        } else {
            result += sumDigit(n / 10);
            return result;
        }
    }
}
