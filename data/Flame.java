package game.data;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Flame extends GameObject {
    private static final int FLAME_COUNT = 100;
    public BufferedImage tex_flame[];

    public Flame(TileMap tileMap){
        super(tileMap);
        tex_flame = new BufferedImage[FLAME_COUNT];
        File initialImage = new File("tile/tile_flame.png");

        try{
            for(int i = 0; i < FLAME_COUNT; i++)
                tex_flame[i] = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < FLAME_COUNT; i++)
            g.drawImage(tex_flame[i], i*30, 0, this);
    }
}
