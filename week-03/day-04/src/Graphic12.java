import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic12 {
    public static void mainDraw(Graphics graphics){

        drawLines(graphics, 900, 0, 0);
    }



    public static void drawLines(Graphics g, int n, int x, int y) {           // n = size of box
        if (n > 1) {

            drawLines(g, n / 3, x * n / 3, y + n / 3);                // left
            drawLines(g, n / 3, x + n / 3, y * n / 3);                // top
           // drawLines(g, n / 3, ;)
            //drawLines(g, n / 3, x + n / 3, y + n / 3 * 2);

        }

        g.drawLine(x + n / 3, y, x + n / 3, y + n);
        g.drawLine(x + n / 3 * 2, y, x + n / 3 * 2, y + n);
        g.drawLine(x, y + n / 3, x + n, y + n / 3);
        g.drawLine(x, y + n / 3 * 2, x + n, y + n / 3 * 2);
    }

    /*public static void drawSquare(Graphics g, int size) {

        int count = 1;
        g.drawRect(0, 0, size / 3, size / 3);
    }*/



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
            this.setBackground(Color.YELLOW);
            mainDraw(graphics);
        }
    }
}
