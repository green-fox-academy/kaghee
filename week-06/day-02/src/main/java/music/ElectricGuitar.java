package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super();
        numberOfStrings = 6;
        name = "Electric guitar";
    }

    @Override
    public void sound() {
        System.out.print("Twang\n");
    }
}
