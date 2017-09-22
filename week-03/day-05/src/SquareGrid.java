import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics){
        drawSquares(graphics, 800, 0, 0, 4);
    }

    public static void drawSquares(Graphics g, int n, int x, int y, int rec) {
        g.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
        for (int i = 0; i < rec * 2; i++) {
            g.drawRect(x + n / 4 + i, y + n / 4 + i, n / 2, n / 2);
        }

        if (rec > 0) {
            drawSquares(g, n / 2, x, y, rec - 1);
            drawSquares(g, n / 2, n / 2 + x, y, rec - 1);
            drawSquares(g, n / 2, x, n / 2 + y, rec - 1);
            drawSquares(g, n / 2, n / 2 + x, n / 2 + y, rec - 1);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            this.setBackground(Color.WHITE);
            mainDraw(graphics);
        }
    }
}
