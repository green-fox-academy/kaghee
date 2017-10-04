public class Character extends PositionedImage{
//    int maxHealth;
//    int currHealth;
//    int defPoint;
//    int strikePoint;

    public Character(String image, int posX, int posY) {
        super(image, posX, posY);
        this.posX = (int)(Math.random() * 10);
        this.posY = (int)(Math.random() * 10);
    }

    public void reposition() {
        this.posX = (int)(Math.random() * 10);
        this.posY = (int)(Math.random() * 10);
    }

    public void moveUp(int[][] board) {
        if (posY != 0 && board[posY - 1][posX] != 1) {
            posY--;
        }
    }

    public void moveDown(int[][] board) {
        if (posY != 9 && board[posY + 1][posX] != 1) {
            posY++;
        }
    }

    public void moveLeft(int[][] board) {
        if (posX != 0 && board[posY][posX - 1] != 1) {
            posX--;
        }
    }

    public void moveRight(int[][] board) {
        if (posX != 9 && board[posY][posX + 1] != 1) {
            posX++;
        }
    }
}
