package parkinglot;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Map<String, Integer> clrs = new HashMap<>();
        Map<String, Integer> models = new HashMap<>();
        Map<String, Integer> allCars = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            clrs.put(Car.Colour.values()[i].toString(), 0);
        }

        for (int i = 0; i < 4; i++) {
            models.put(Car.CarType.values()[i].toString(), 0);
        }

        for (int i = 0; i < 256; i++) {
            int rType = (int)(Math.random() * 4);
            int rColour = (int)(Math.random() * 6);
            Car curr = new Car(Car.Colour.values()[rColour], Car.CarType.values()[rType]);
            cars.add(curr);

            if (!allCars.containsKey(curr.colour + " " + curr.type)) {
                allCars.put(curr.colour + " " + curr.type, 1);
            } else {
                allCars.put(curr.colour + " " + curr.type, allCars.get(curr.colour + " " + curr.type) + 1);
            }

            clrs.put(curr.colour, clrs.get(curr.colour) + 1);
            models.put(curr.type, models.get(curr.type) + 1);
        }

        System.out.println(clrs);
        System.out.println(models);
        System.out.println(allCars);
        System.out.println(allCars.values());


        int max = 0;
        for (int i = 0; i < allCars.values().size(); i++) {
            max = Math.max(max, (int)allCars.values().toArray()[i]);
        }
        System.out.println("There are " + max + " of the most frequently occurring cars.");
    }
}
