import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chicks do you have?");
        int chix = scanner.nextInt();

        System.out.println("And what about the pigs?");
        int pigs = scanner.nextInt();

        int legs = chix * 2 + pigs * 4;
        System.out.println("The animals have " + legs + " legs altogether.");
    }
}