package game.data;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arıoğlu on 12/14/2016.
 */
public class GameObject extends JPanel {
    private int HEIGHT;
    private int WIDTH;

    private int currentW;
    private int currentH;

    public BufferedImage[] img;
    private int[] pMap = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 1, 1, 1, 6, 1, 1, 6, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1, 6, 1, 1, 1, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 3, 3, 3, 2, 3, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

    private File initialImage;

    public static TileMap tileMap;

    public GameObject(TileMap inTileMap){
        img = new BufferedImage[14];

        tileMap = inTileMap;

        tileMap.setNumCols(50);
        tileMap.setNumRows(10);
        tileMap.setMap(new int [tileMap.getNumRows()][tileMap.getNumCols()]);

        tileMap.setCurCols(30);
        tileMap.setCurRows(10);
        tileMap.setCurrentMap(new int [tileMap.getCurRows()][tileMap.getCurCols()]);

        WIDTH = tileMap.getNumRows();
        HEIGHT = tileMap.getNumCols();

        currentH = tileMap.getCurCols();
        currentW = tileMap.getCurRows();

        for(int w = 0; w < 14; w++){
            img[w] = null;
            initialImage = new File(TileHelper.tileFileNameArray[w]);
            try{
                img[w] = ImageIO.read(initialImage);
            }
            catch (IOException ex){
                System.out.println("Could not find "+ TileHelper.tileFileNameArray[w] +" file.\n");
            }
        }

        int tmp = 0;

        for(int i = 0; i < tileMap.getNumRows(); i++){
            for(int j = 0; j < tileMap.getNumCols(); j++){
                tileMap.getMap()[i][j] = pMap[tmp];
                tmp++;
            }
        }

        for(int i = 0; i < tileMap.getCurRows(); i++){
            for(int j = 0; j < tileMap.getCurCols(); j++){
                tileMap.getCurrentMap()[i][j] = tileMap.getMap()[i][j];
            }
        }


        /*
        for(int i = 0; i < tileMap.getNumRows(); i++){
            for (int j = 0; j < tileMap.getNumCols(); j++) {
                System.out.print(tileMap.getMap()[i][j] + " ");
            }
            System.out.println();
        }*/


        for(int i = 0; i < tileMap.getCurRows(); i++){
            for (int j = 0; j < tileMap.getCurCols(); j++) {
                System.out.print(tileMap.getCurrentMap()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*******************************************");

    }


    public int getHEIGHT(){
        return HEIGHT;
    }

    public int getWIDTH(){
        return WIDTH;
    }

    public int getCurrentW() {
        return currentW;
    }

    public int getCurrentH() {
        return currentH;
    }
}
