public class Skeleton extends Character {

    public Skeleton() {
        super("assets/skeleton.png", 1, 1);
        this.maxHealth = 2 * this.level * d6;
        this.defPoint = this.level / 2 * d6;
        this.strikePoint = this.level * d6;
    }
}
