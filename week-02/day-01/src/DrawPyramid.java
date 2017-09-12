import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the pyramid");
        int size = scanner.nextInt();

        String pyramid = "";

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size * 2; j++) {
                if (j == size - i) {
                    while (j <= size + i) {
                        pyramid += "*";
                        j++;
                    }
                } else {
                    pyramid += " ";
                }
            }
            pyramid += "\n";
        }
        System.out.println(pyramid);
    }
}