package game.data;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Background extends GameObject {
    private static final int BACKGROUND_COUNT = 100;
    public BufferedImage tex_Background[];

    public Background(TileMap tileMap){
        super(tileMap);

        tex_Background = new BufferedImage[BACKGROUND_COUNT];
        File initialImage = new File("tile/tile_Background.png");

        try{
            for(int i = 0; i < BACKGROUND_COUNT; i++)
                tex_Background[i] = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < BACKGROUND_COUNT; i++)
            g.drawImage(tex_Background[i], i*30, 0, this);
    }

}
