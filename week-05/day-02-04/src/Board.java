import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {

    int heroPosX;
    int heroPosY;

    static int BOARD_SIZE = 10;

    public Board(String file) {

        heroPosX = 0;
        heroPosY = 0;

        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

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
            {0,0,0,1,0,1,1,0,1,0}};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                PositionedImage floor = new PositionedImage("assets/floor.png", j * 72, i * 72);
                PositionedImage wall = new PositionedImage("assets/wall.png", j * 72, i * 72);
                if (board[i][j] == 0) {
                    floor.draw(graphics);
                } else if (board[i][j] == 1){
                    wall.draw(graphics);
                }
            }
        }

        PositionedImage hero = new PositionedImage("assets/hero-down.png", heroPosX, heroPosY);
        hero.draw(graphics);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            heroPosY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            heroPosY += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            heroPosX -= 72;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            heroPosX += 72;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
