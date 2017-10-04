public class Skeleton extends Character {

    public Skeleton() {
        super("assets/skeleton.png", 1, 1);
        this.posX = (int)(Math.random() * 10);
        this.posY = (int)(Math.random() * 10);
    }
}
