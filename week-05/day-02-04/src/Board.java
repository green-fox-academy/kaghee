import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent implements KeyListener {

    Hero hero;
    Boss boss;
    int monsterCount;

    List<Character> npcChars;

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

    public Board() {
        hero = new Hero();
        boss = new Boss();

        monsterCount = 5;
        npcChars = new ArrayList<>();
        for (int i = 0; i < monsterCount + 1; i++) {
            npcChars.add(boss);
            npcChars.add(new Skeleton());
        }

        setPreferredSize(new Dimension(720, 920));
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

        hero.draw(graphics);

        for (Character ch : npcChars) {
            while (board[ch.posY][ch.posX] != 0) {
                ch.reposition();
            }
            ch.draw(graphics);
        }

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 720, 720, 200);

        Graphics2D g2d = (Graphics2D) graphics;
        int width = 10;
        g2d.setStroke(new BasicStroke(width));
        graphics.setColor(Color.BLACK);
        g2d.drawRect(5,720,710,195);
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
            hero.turnUp();
            hero.moveUp(board);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.turnDown();
            hero.moveDown(board);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.turnLeft();
            hero.moveLeft(board);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.turnRight();
            hero.moveRight(board);
        }
        repaint();
    }
}
