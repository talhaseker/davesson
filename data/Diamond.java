package game.data;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Diamond extends GameObject {
    private static final int DIAMOND_COUNT = 5;
    public BufferedImage tex_diamond[];

    public Diamond(TileMap tileMap){
        super(tileMap);

        tex_diamond = new BufferedImage[DIAMOND_COUNT];
        File initialImage = new File("tile/tile_flame.png");

        try{
            for(int i = 0; i < DIAMOND_COUNT; i++)
                tex_diamond[i] = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < DIAMOND_COUNT; i++)
            g.drawImage(tex_diamond[i], i*30, 0, this);
    }



}
