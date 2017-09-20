import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.

        graphics.setColor(Color.PINK);
        graphics.fillRect(10, 10, 200, 80);

        graphics.setColor(new Color(249, 149, 18));
        graphics.fillRect(60, 100, 220, 90);

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(100, 225, 100, 30);

        graphics.setColor(new Color(249, 18, 80));
        graphics.fillRect(37, 210, 50, 80);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
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
            mainDraw(graphics);

        }
    }
}