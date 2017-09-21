import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic12 {
    public static void mainDraw(Graphics graphics){
        drawLines(graphics, 600, 40, 40);
    }

    public static void drawLines(Graphics g, int n, int x, int y) {           // n = size of box
        if (n > 1) {
            drawLines(g, n / 3, x , y + n / 3);                         // left
            drawLines(g, n / 3, x + n / 3, y );                        // top
            drawLines(g, n / 3, x + n / 3 * 2, y + n / 3);           // right
            drawLines(g, n / 3, x + n / 3, y + n / 3 * 2);          // bot
        }

        g.drawRect(x, y, n, n);
        g.drawLine(x + n / 3, y, x + n / 3, y + n);
        g.drawLine(x + n / 3 * 2, y, x + n / 3 * 2, y + n);
        g.drawLine(x, y + n / 3, x + n, y + n / 3);
        g.drawLine(x, y + n / 3 * 2, x + n, y + n / 3 * 2);
    }


    //    Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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
            this.setBackground(Color.YELLOW);
            mainDraw(graphics);
        }
    }
}
