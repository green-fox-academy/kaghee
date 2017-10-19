package parkinglot;

public class Car {
    String colour;
    String type;

    public Car(Colour colour, CarType type) {
        this.colour = colour.toString();
        this.type = type.toString();
    }

    public enum Colour {
        RED, BLUE, YELLOW, GREEN, BLACK, WHITE
    }

    public enum CarType {
        MERCEDES, FERRARI, FORD, LAMBORGHINI
    }
}
