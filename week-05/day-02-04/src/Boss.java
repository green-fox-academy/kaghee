public class Boss extends Skeleton {

    public Boss() {
        readFromFile("assets/boss.png");
        this.maxHealth = super.maxHealth * d6;
        this.defPoint = super.defPoint + d6 / 2;
        this.strikePoint = super.strikePoint + this.level;
    }
}
