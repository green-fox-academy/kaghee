public class Boss extends Character {

    public Boss() {
        super("assets/boss.png", 1, 1);
        this.maxHealth = 2 * this.level * d6 + d6;
        this.defPoint = this.level / 2 * d6 + d6 / 2;
        this.strikePoint = this.level * d6 + this.level;
    }
}
