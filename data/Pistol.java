package game.data;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class Pistol extends GameObject{
    private static final int PISTOL_COUNT = 100;
    public BufferedImage tex_Pistol[];

    public Pistol(TileMap tileMap){
        super(tileMap);
        tex_Pistol = new BufferedImage[PISTOL_COUNT];
        File initialImage = new File("tile/tile_Pistol.png");

        try{
            for(int i = 0; i < PISTOL_COUNT; i++)
                tex_Pistol[i] = ImageIO.read(initialImage);
        }
        catch (IOException ex){
            System.out.println("Could not find file.\n");
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < PISTOL_COUNT; i++)
            g.drawImage(tex_Pistol[i], i*30, 0, this);
    }
}
