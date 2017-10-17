import main.java.music.BassGuitar;
import main.java.music.ElectricGuitar;
import main.java.music.Violin;

public class AppMusic {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        BassGuitar bassGuitar = new BassGuitar();
        Violin violin = new Violin();
        guitar.play();
        bassGuitar.play();
        violin.play();
    }
}
