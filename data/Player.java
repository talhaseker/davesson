package game.data; /**
 * Created by arıoğlu on 12/8/2016.
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends GameObject{

    private double airMove;

    private double x, y;

    private BufferedImage[] img;
    private File initialImage;

    public Player(TileMap tMap){
        super(tMap);

        img = new BufferedImage[6];

        for(int w = 8; w < 14; w++){
            img[w] = null;
            initialImage = new File(TileHelper.tileFileNameArray[w]);
            try{
                img[w] = ImageIO.read(initialImage);
            }
            catch (IOException ex){
                System.out.println("Could not find "+ TileHelper.tileFileNameArray[w] +" file.\n");
            }
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 8; i < 14; i++)
            g.drawImage(img[i], i*30, 0, this);
    }


    public void setRight(){
        x += 10;
    }
    public void setLeft(){
        x -= 10;
    }
    public void setUp(){
        y += 10;
    }
    public void setDown(){
        y -= 10;
    }


    public void getNextPosition(){
        /*
        *
        *
        *
        */
    }


    public double getAirMove() {
        return airMove;
    }

    public void setAirMove(double airMove) {
        this.airMove = airMove;
    }



}
