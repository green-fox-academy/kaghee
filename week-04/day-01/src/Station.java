public class Station {
    int gasAmount = 4000;

    public void refill(Car car) {
        this.gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }
}
