public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(9));
    }

    public static int sum (int until) {
        int result = 0;
        for (int i = 0; i < until; i++) {
            result += i;
        }
        return result;
    }
}