import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

    BufferedImage image;
    int posX, posY;

    static int TILE_SIZE = 72;

    public PositionedImage(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        readFromFile(filename);
    }

    public void readFromFile(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * TILE_SIZE, posY * TILE_SIZE, null);
        }
    }
}