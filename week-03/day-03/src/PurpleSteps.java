import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

    public static void mainDraw(Graphics graphics){
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

        /*graphics.setColor(new Color(200, 0, 200));
        graphics.fillRect(10,10, 10, 10);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(10,10, 10, 10);*/

        for (int i = 0; i < 200; i += 10) {
            drawBox(graphics, i, i);
        }
    }

    static void drawBox(Graphics g, int x, int y) {
        g.setColor(new Color(200, 0, 200));
        g.fillRect(x + 10, y + 10, 10, 10);         // draws a 10*10 purple square with black border
        g.setColor(Color.BLACK);                                    // x + 10, y + 10 : padding in top left corner
        g.drawRect(x + 10, y + 10,10, 10);
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