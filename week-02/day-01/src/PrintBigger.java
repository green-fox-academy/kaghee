import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 2 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("The first number is bigger: " + a);
        } else if (b > a){
            System.out.println("The second number is bigger: " + b);
        } else {
            System.out.println("Neither number is bigger than the other.");
        }
    }
}