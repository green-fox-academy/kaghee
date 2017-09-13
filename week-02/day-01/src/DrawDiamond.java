import java.util.Scanner;

public class DrawDiamond {

    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the diamond please.");
        int dimension = scanner.nextInt();
        int size = dimension / 2;

        if (dimension == 2) {
            System.out.println("Sorry, but diamonds don't come in cubes. Here's something bigger instead. ");
        }

        String diamond = "";

        // Upper half
        for (int i = 0; i < size; i++) {
            diamond += " ";
            for (int j = 1; j < size * 2; j++) {
                if (j == size - i) {
                    while (j <= size + i) {
                        diamond += "*";
                        j++;
                    }
                } else {
                    diamond += " ";
                }
            }
            diamond += "\n";
        }

        // Middle line
        for (int i = 0; i < dimension; i++) {
            diamond += "*";
        }

        // If the given size is an even number, the longest horizontal line has to be duplicated
        if (dimension % 2 == 0) {
            diamond += "*\n";
            for (int i = 0; i < dimension + 1; i++) {
                diamond += "*";
            }
        }

        // Lower half
        for (int i = size; i >= 0; i--) {
            diamond += " ";
            for (int j = 1; j < size * 2; j++) {
                if (j == size - i) {
                    while (j <= size + i) {
                        diamond += "*";
                        j++;
                    }
                } else {
                    diamond += " ";
                }
            }
            diamond += "\n";
        }

        System.out.println(diamond);
    }
}