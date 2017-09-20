import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // create a loop that fills the canvas with rainbow colored squares.

        int[] darkPurple = {102, 0, 102};
        int[] purple = {163, 22, 233};
        int[] darkPink = {233, 22, 135};
        int[] orange = {255, 128, 0};
        int[] peach = {249, 178, 106};
        int[] yellow = {255, 255, 0};
        int[] white = {255, 255, 255};

        ArrayList<int[]> colours = new ArrayList<>();
        colours.addAll(Arrays.asList(darkPurple, purple, darkPink, orange, peach, yellow, white));

        for (int i = 0; i < 7; i++) {
            int boxSize = 290;
            rainbowBox(graphics, boxSize - i * 30, colours.get(i));
        }
    }

    static void rainbowBox(Graphics g, int size, int[] color) {
        g.setColor(new Color(color[0], color[1], color[2]));
        g.fillRect(150 - size / 2, 150 - size / 2, size, size);
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