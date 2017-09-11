import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String fullLine = "";
        String board = "";

        for (int lines = 0; lines < size; lines++){
            fullLine += "%";
        }

        System.out.println(fullLine);

        for (int i = 0; i < size - 2; i++) {
            board = "";
            for (int j = 0; j < size + 1; j++) {
                if ( j == 0) {
                    board += "%";
                } else if (j == size) {
                    board += "%";
                } else if (j == i + 1) {
                    board += "%";
                } else {
                    board += " ";
                }
            }
            System.out.println(board);
        }

        System.out.println(fullLine);

    }
}