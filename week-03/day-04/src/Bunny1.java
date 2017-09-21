public class Bunny1 {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

        System.out.println(bunnyEars(34));
    }

    public static int bunnyEars(int bunnies) {
        int ears = 2;
        if (bunnies == 1) {
            return ears;
        } else {
            ears += bunnyEars(bunnies - 1);
            return ears;
        }
    }
}
