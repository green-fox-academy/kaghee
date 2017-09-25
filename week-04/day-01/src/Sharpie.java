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

    public static void main(String[] args) {
        Sharpie cerka = new Sharpie("red", 3.4f);
        cerka.use();
        System.out.println(cerka.inkAmount);
        System.out.println(cerka.color);
    }
}
