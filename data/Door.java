package game.data;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Door extends GameObject {
    private static final int DOOR_COUNT = 100;
    public BufferedImage tex_Door[];

    public Door(TileMap tileMap){
        super(tileMap);
        tex_Door = new BufferedImage[DOOR_COUNT];
        File initialImage = new File("tile/tile_Door.png");

        try{
            for(int i = 0; i < DOOR_COUNT; i++)
                tex_Door[i] = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < DOOR_COUNT; i++)
            g.drawImage(tex_Door[i], i*30, 0, this);
    }
}
