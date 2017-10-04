public class Hero extends Character {

    public Hero() {
        super("assets/hero-down.png", 0, 0);
        this.maxHealth = 3 * d6 + 20;
        this.defPoint = 2 * d6;
        this.strikePoint = 5 + d6;
    }

    public void turnUp() {
        readFromFile("assets/hero-up.png");
    }

    public void turnDown() {
        readFromFile("assets/hero-down.png");
    }

    public void turnLeft() {
        readFromFile("assets/hero-left.png");
    }

    public void turnRight() {
        readFromFile("assets/hero-right.png");
    }
}
