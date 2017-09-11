import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}