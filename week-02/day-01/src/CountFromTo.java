import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b <= a) {
            System.out.println("The second number should be bigger");
        } else if (b > a) {
            for (int i = a; i < b ; i++) {
                System.out.println(i);
            }
        }
    }
}