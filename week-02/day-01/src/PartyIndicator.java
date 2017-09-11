import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("Give me two numbers");
        Scanner numScanner = new Scanner(System.in);
        int girls = numScanner.nextInt();
        int boys = numScanner.nextInt();

        if (girls == 0) {
            System.out.println("Sausage party");
        } else if (girls == boys && (girls + boys) > 20) {
            System.out.println("The party is excellent!");
        } else if (girls != boys && (girls + boys) > 20) {
            System.out.println("Quite a cool party!");
        } else if (girls + boys < 20){
            System.out.println("Average party...");
        }
    }
}
