import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants;

    public Garden() {
        plants = new ArrayList<Plant>();
    }

    public void water(int waterAmount) {
        System.out.println("Watering with " + waterAmount);
        for (Plant plant: plants) {
            if (plant.needsWater()) {
                plant.currentWater += waterAmount / plants.size() * plant.absorbPercent / 100;
            }
        }
        showGarden();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void showGarden() {
        for (Plant plant: plants) {
            if (plant.needsWater()) {
                System.out.println("The " + plant.name + " " + plant.getClass() + " needs water");
            } else {
                System.out.println("The " + plant.name + " " + plant.getClass() + " doesn't need water");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Garden garden = new Garden();

        Plant purple = new Flower("purple");
        Plant red = new Flower("red");
        Plant pine = new Tree("pine");
        Plant apple = new Tree("apple");

        garden.addPlant(purple);
        garden.addPlant(red);
        garden.addPlant(pine);
        garden.addPlant(apple);

        garden.showGarden();
        garden.water(40);
        garden.water(70);
    }
}
