import java.util.Scanner;

public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {
        System.out.println("What should the dimensions of the matrix be?");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[][] multiArray = new String[size][size];

        // Filling up the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (i == j) {
                    multiArray[i][j] = "1 ";
                } else {
                    multiArray[i][j] = "0 ";
                }
            }
        }

        // Printing it out
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}