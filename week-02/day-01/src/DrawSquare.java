import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the square please.");
        int size = scanner.nextInt();

        String square = "";
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {              // Top and bottom sides
                for (int j = 0; j < size; j++) {
                    square += "%";
                }
            } else {
                for (int j = 0; j < size; j++) {
                    if (j == 0 || j == size - 1) {      // Left and right sides
                        square += "%";
                    } else {
                        square += " ";                  // Filling it up with SPAAAAACE
                    }
                }
            }
            square += "\n";
        }
        System.out.println(square);
    }
}