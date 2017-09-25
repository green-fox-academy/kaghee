import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> pens = new ArrayList<>();

    Sharpie piros = new Sharpie("red", 0.3f);
    Sharpie sarga = new Sharpie("yellow", 0.5f);
    Sharpie kek = new Sharpie("blue", 1.2f);
    Sharpie zold = new Sharpie("green", 3.8f);
    Sharpie lila = new Sharpie("purple", 2.0f);

    public void add(Sharpie sharpie) {
        pens.add(piros);
        pens.add(sarga);
        pens.add(kek);
        pens.add(zold);
        pens.add(lila);
    }

    public int countUsable() {
        int usable = 0;
        for (Sharpie sharpie: this.pens) {
            if (sharpie.inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }

    public void removeTrash() {
        for (Sharpie sharpie: this.pens) {
            if (sharpie.inkAmount == 0) {
                pens.remove(sharpie);
            }
        }
    }
}
