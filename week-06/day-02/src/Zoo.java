import main.java.animals.Bird;
import main.java.animals.Mammal;
import main.java.animals.Reptile;

public class Zoo {
    public static void main(String[] args) {
        Mammal mammal = new Mammal("Koala");
        Reptile reptile = new Reptile("Snake");
        Bird bird = new Bird("Parrot");

        System.out.println(mammal.getName() + "s are covered by " + mammal.coveredby + ", " + mammal.move() + " and eat " + mammal.eat());
        System.out.println(reptile.getName() + "s are covered by " + reptile.coveredby + ", " + reptile.move() + " and eat " + reptile.eat());
        System.out.println(bird.getName() + "s are covered by " + bird.coveredby + ", " + bird.move() + " and eat " + bird.eat());
    }
}
