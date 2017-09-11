public class DrawChessTable {
    public static void main(String[] args) {
        int lines = 8;

        for (int i = 0; i < lines; i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 1; j < lines + 1; j++) {
                if (j % 2 != 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}