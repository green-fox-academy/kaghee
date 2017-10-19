import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Map<String, Integer> clrs = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            clrs.put(Car.Colour.values()[i].toString(), 0);
        }

        for (int i = 0; i < 256; i++) {
            int rType = (int)(Math.random() * 4);
            int rColour = (int)(Math.random() * 6);
            Car curr = new Car(Car.Colour.values()[rColour], Car.CarType.values()[rType]);
            cars.add(curr);

            clrs.put(curr.colour, clrs.get(curr.colour) + 1);

            System.out.println(cars.get(i).colour + " " + cars.get(i).type);
        }



        System.out.println(clrs);
    }
}
