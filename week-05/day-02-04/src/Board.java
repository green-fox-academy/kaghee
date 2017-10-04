import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {

    Character hero;

    int[][] board = {
            {0,0,0,1,0,1,0,0,0,0},
            {0,0,0,1,0,1,0,1,1,0},
            {0,1,1,1,0,1,0,1,1,0},
            {0,0,0,0,0,1,0,0,0,0},
            {1,1,1,1,0,1,1,1,1,0},
            {0,1,0,1,0,0,0,0,1,0},
            {0,1,0,1,0,1,1,0,1,0},
            {0,0,0,0,0,1,1,0,1,0},
            {0,1,1,1,0,0,0,0,1,0},
            {0,0,0,1,0,1,1,0,0,0}};

    static int BOARD_SIZE = 10;

    public Board() {

        hero = new Hero();

        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                PositionedImage floor = new PositionedImage("assets/floor.png", j, i);
                PositionedImage wall = new PositionedImage("assets/wall.png", j, i);
                if (board[i][j] == 0) {
                    floor.draw(graphics);
                } else if (board[i][j] == 1) {
                    wall.draw(graphics);
                }
            }
        }

        PositionedImage heroImg = new PositionedImage(hero.image, hero.posX, hero.posY);
        heroImg.draw(graphics);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.image = "assets/hero-up.png";
            if (hero.posY != 0 && board[hero.posY - 1][hero.posX] != 1) {
                hero.posY--;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.image = "assets/hero-down.png";
            if (hero.posY != 9 && board[hero.posY + 1][hero.posX] != 1) {
                hero.posY++;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.image = "assets/hero-left.png";
            if (hero.posX != 0 && board[hero.posY][hero.posX - 1] != 1) {
                hero.posX--;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.image = "assets/hero-right.png";
            if (hero.posX != 9 && board[hero.posY][hero.posX + 1] != 1) {
                hero.posX++;
            }
        }
        repaint();
    }
}
