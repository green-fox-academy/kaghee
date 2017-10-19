import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            int rType = (int)(Math.random() * 4);
            int rColour = (int)(Math.random() * 6);
            cars.add(new Car(Car.Colour.values()[rColour], Car.CarType.values()[rType]));

            System.out.println(cars.get(i).colour + " " + cars.get(i).type);
        }
    }
}
