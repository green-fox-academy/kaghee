public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        System.out.println(adder(5));
    }

    public static int adder(int n){
        int result = n;
        if (n == 1) {
            return result;
        } else {
            result += adder(n - 1);
            return result;
        }
    }
}
