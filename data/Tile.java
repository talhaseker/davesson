package game.data;

import javax.swing.*;
import java.awt.image.BufferedImage;

/**
 * Created by arıoğlu on 12/16/2016.
 */
public class Tile extends JPanel{

    private static final int FREE = 0;
    private static final int BLOCKED = 1;
    private static final boolean TRANSPARENCY = false;


    private BufferedImage image;
    public int type;

    public Tile(){
        this.image = image;
        this.type = type;
    }



}
