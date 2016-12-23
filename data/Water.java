package game.data;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Water extends GameObject {
    private static final int WATER_COUNT = 100;
    public BufferedImage tex_Water[];

    public Water(TileMap tileMap){
        super(tileMap);
        tex_Water = new BufferedImage[WATER_COUNT];
        File initialImage = new File("tile/tile_Water.png");

        try{
            for(int i = 0; i < WATER_COUNT; i++)
                tex_Water[i] = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < WATER_COUNT; i++)
            g.drawImage(tex_Water[i], i*30, 0, this);
    }
}
