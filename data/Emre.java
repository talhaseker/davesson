package game.data;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Emre extends JPanel {

    private BufferedImage img = null;

    public Emre(){
        File initialImage = new File("com/company/sample.png");

        try{
            img = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }
    public void paaintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLUE);

        g.setColor(Color.RED);
        g.fill3DRect(10, 10, 20, 20, true);
    }
}
