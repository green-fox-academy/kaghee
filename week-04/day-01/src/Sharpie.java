public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;

    public void use() {
        this.inkAmount--;
    }

    public Sharpie(String clr, float wdth) {
        this.color = clr;
        this.width = wdth;
    }
}
