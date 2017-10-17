import main.java.music.BassGuitar;
import main.java.music.ElectricGuitar;
import main.java.music.Violin;

public class AppMusic {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        ElectricGuitar guitar2 = new ElectricGuitar(7);
        BassGuitar bassGuitar = new BassGuitar();
        BassGuitar bassGuitar2 = new BassGuitar(5);
        Violin violin = new Violin();

        guitar.play();
        guitar2.play();
        bassGuitar.play();
        bassGuitar2.play();
        violin.play();
    }
}
