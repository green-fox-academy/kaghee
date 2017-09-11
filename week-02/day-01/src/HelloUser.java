import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("What's your name?");

        String name = nameScanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}