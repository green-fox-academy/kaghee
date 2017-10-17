package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        super();
        numberOfStrings = 6;
        name = "Electric guitar";
    }

    public ElectricGuitar(int strings) {
        super();
        numberOfStrings = strings;
        name = "Electric guitar";
    }

    @Override
    public void sound() {
        System.out.print("Twang\n");
    }
}
