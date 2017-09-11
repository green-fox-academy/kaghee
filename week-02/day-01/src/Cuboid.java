public class Cuboid {
    public static void main(String[] args) {
        double a, b, c;

        a = 3;
        b = 4;
        c = 5;

        double surface = 2 * (a * b + b * c + a * c);
        double volume = a * b * c;

        System.out.println("Surface Area: " + surface + "\nVolume: " + volume);
    }
}
