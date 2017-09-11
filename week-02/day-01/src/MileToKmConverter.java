import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner kmScanner = new Scanner(System.in);

        System.out.println("Give me a distance in kilometres");
        int kms = kmScanner.nextInt();

        System.out.println("The distance in miles is " + kms * 0.62 + ".");

    }
}