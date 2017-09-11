public class proba {
    public static void main(String[] args) {
        String[][] myArray = new String[10][10];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = i + " " + j;
                System.out.print("|" + myArray[i][j] + "|");
            }
            System.out.println();
        }
    }
}