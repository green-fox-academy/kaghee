import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Board extends JComponent implements KeyListener {

    Character hero;
    Character skeleton1;
    Character skeleton2;
    Character skeleton3;
    List<Character> monsters;

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
        skeleton1 = new Skeleton();
        skeleton2 = new Skeleton();
        skeleton3 = new Skeleton();
        monsters = new ArrayList<>(Arrays.asList(skeleton1, skeleton2, skeleton3));

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


        for (Character ch: monsters) {
            while (board[ch.posY][ch.posX] != 0) {
                ch.reposition();
            }
        }

        PositionedImage sk1 = new PositionedImage(skeleton1.image, skeleton1.posX, skeleton1.posY);
        sk1.draw(graphics);

        PositionedImage sk2 = new PositionedImage(skeleton2.image, skeleton2.posX, skeleton2.posY);
        sk2.draw(graphics);

        PositionedImage sk3 = new PositionedImage(skeleton3.image, skeleton3.posX, skeleton3.posY);
        sk3.draw(graphics);
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
