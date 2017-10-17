package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        super();
        numberOfStrings = 4;
        name = "Bass guitar";
    }

    @Override
    public void sound() {
        System.out.print("Duum-duum-duum\n");
    }
}
