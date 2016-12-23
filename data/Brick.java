package game.data;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Brick extends GameObject {
    private static final int BRICK_COUNT = 100;
    public BufferedImage tex_Brick[];

    public Brick(TileMap tileMap){
        super(tileMap);

        tex_Brick = new BufferedImage[BRICK_COUNT];
        File initialImage = new File("tile/tile_Brick.png");

        try{
            for(int i = 0; i < BRICK_COUNT; i++)
                tex_Brick[i] = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < BRICK_COUNT; i++)
            g.drawImage(tex_Brick[i], i*30, 0, this);
    }
}
