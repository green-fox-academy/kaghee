import java.util.ArrayList;
import java.util.List;

public class Farm {
    int freeSlots = 7;
    List<Animal> farm = new ArrayList<>();

    Animal pig = new Animal();
    Animal duck = new Animal();
    Animal goat = new Animal();
    Animal bunny = new Animal();
    Animal cow = new Animal();

    public void add(Animal animal) {
        farm.add(pig);
        farm.add(duck);
        farm.add(goat);
        farm.add(bunny);
        farm.add(cow);
    }

    public void breed() {
        if (freeSlots > 0) {
            Animal someRandomAnimal = new Animal();
            farm.add(someRandomAnimal);
        }
    }

    public void slaughter() {
        Animal leastHungry = new Animal();
        for (int i = 0; i < farm.size() - 1; i++) {
            if (farm.get(i).hunger < farm.get(i + 1).hunger) {
                leastHungry = farm.get(i);
            }
        }
        farm.remove(leastHungry);
    }
}
