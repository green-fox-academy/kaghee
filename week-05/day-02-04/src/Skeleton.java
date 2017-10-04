public class Skeleton extends Character{

    public Skeleton() {
        super();
        this.posX = (int)Math.random() * 10;
        this.posY = (int)Math.random() * 10;
        this.image = "assets/skeleton.png";
    }
}
