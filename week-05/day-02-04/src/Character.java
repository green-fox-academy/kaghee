public class Character {
    int maxHealth;
    int currHealth;
    int defPoint;
    int strikePoint;

    String image;

    int posX;
    int posY;

    public Character() {
        this.posX = (int)(Math.random() * 10);
        this.posY = (int)(Math.random() * 10);
    }

    public void reposition() {
        this.posX = (int)(Math.random() * 10);
        this.posY = (int)(Math.random() * 10);
    }

}
