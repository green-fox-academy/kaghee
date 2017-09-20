import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
        // divide the canvas into 4 parts
        // and repeat this pattern in each quarter:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

        graphics.setColor(new Color(204, 0, 204));
        for (int i = 1; i < 300; i += 20) {
            graphics.drawLine(i, 0, 300, i);
        }

        graphics.setColor(new Color(0, 255, 128));
        for (int i = 0; i < 300; i += 20) {
            graphics.drawLine(0, i, i, 300);
        }

        graphics.setColor(Color.YELLOW);
        for (int i = 0; i < 300; i += 20) {
            graphics.drawLine(i, 0, 0, 300 - i);
        }

        graphics.setColor(Color.RED);
        for (int i = 0; i < 300; i += 20) {
            graphics.drawLine(300, i, 300 - i, 300);
        }
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
            this.setBackground(Color.WHITE);
            mainDraw(graphics);

        }
    }

}