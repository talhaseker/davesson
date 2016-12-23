package game.data;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.imageio.ImageIO;

/**
 * Created by arıoğlu on 12/19/2016.
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


public class GamePanel extends JPanel
{
    private BufferedImage[] player;
    private BufferedImage current;

    private int x = 0, y = 256;
    private int count = 1, leftCount = 0, rightCount = 0;

    private boolean jump = false;
    private boolean jumpDir = false;

    private int collision;
    private boolean collided;

    private GameObject go;
    private TileMap tMap;

    public int k, m, i, j;
    private  int shiftAmount;

    private File initialImage;

    public GamePanel()
    {
        tMap = new TileMap();
        go = new GameObject(tMap);

        k = 0;
        m = 0;

        player = new BufferedImage[5];

        for(int i = 9; i < 14; i++ ){

            initialImage = new File(TileHelper.tileFileNameArray[i]);
            try {
                player[i - 9] = ImageIO.read(initialImage);
            }
            catch (IOException ex){
                System.out.println("Could not find "+ TileHelper.tileFileNameArray[i] +" file.\n");
            }
        }
        current = player[1];

        addKeyListener(new myKeyListener());

        setFocusable(true);
        setBackground(Color.black);
        setPreferredSize(new Dimension(300, 200));

        shiftAmount = 0;

        collided = false;

        i = 8;
        j = 0;
        collision = tMap.getCurrentMap()[i][j];
    }

    boolean right, left, stop;

    public void checkCollision(){
        if(right){
            if(x % 32 == 0){
                int temp = tMap.getCurrentMap()[i][j+2];
                System.out.println("HERE 1: " + temp);
                j++;
                if(temp == TileHelper.BRICK){
                    System.out.print("ANANANANANA\n");
                    stop = true;
                    System.out.println("HERE 2: " + temp);
                }
            }
        }
        if(left){
            if(x % 32 == 0){
                int temp = tMap.getCurrentMap()[i][j-2];
                j--;
                System.out.println("HERE 3: " + temp);
                if(temp == TileHelper.BRICK){
                    stop = true;
                    System.out.println("HERE 4: " + temp);}
            }
        }
    }


    int a = 0;
    int b = 0;

    public void shiftMap(boolean toRight){
        if(a < tMap.getNumRows() && b < tMap.getCurCols()-9 ){
            for(int i = 0; i < tMap.getCurRows(); i++){
                for (int j = 0; j < tMap.getCurCols(); j++){
                    tMap.getCurrentMap()[i][j] = tMap.getMap()[(i+a) % tMap.getNumRows()][(j+b) % tMap.getNumCols()];
                }
            }
            if(toRight)
                b++;
            else
                b--;
        }

        /*
        for(int i = 0; i < tMap.getCurRows(); i++){
            for (int j = 0; j < tMap.getCurCols(); j++) {
                System.out.print(tMap.getCurrentMap()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        */
        System.out.print("a: " + a + " b: " + b + "\n");
    }
    
    public void shiftRNow(){
        if(shiftAmount < 32)
            shiftAmount += 1;
        else
            shiftMap(true);
    }

    public void shiftLNow(){
        if(shiftAmount < 32)
            shiftAmount -= 1;
        else
            shiftMap(false);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < go.getCurrentW(); i++){
            for(int j = 0; j < go.getCurrentH(); j++){
                g.drawImage(go.img[ tMap.getCurrentMap()[i][j] ], j*32, i*32, null);
            }
        }
        g.drawImage(current, x, y, null);
    }

    public class myKeyListener implements KeyListener{
        @Override
        public void keyPressed(KeyEvent e) {
            //checkCollision;
            int key = e.getKeyCode();
            if(jump){
                if(key == KeyEvent.VK_UP)
                {
                    Timer t = new Timer();
                    TimerTask task1 = new TimerTask() {

                        @Override
                        public void run() {
                            if(right && jump)
                                x += 10;

                            if(left && jump)
                                x -= 10;

                            if(count < 4)
                            {
                                if(count < 2)
                                {
                                    y -= 30;
                                    count++;
                                }

                                else if(count >= 2 && count < 3)
                                {
                                    y -= 20;
                                    count++;
                                }

                                else
                                {
                                    y -= 10;
                                    count++;
                                }
                                repaint();
                            }

                            else if	(count >= 4 && count < 8)
                            {
                                if(count < 5)
                                {
                                    y += 10;
                                    count++;
                                }
                                else if(count >= 5 && count < 6)
                                {
                                    y += 20;
                                    count++;
                                }
                                else
                                {
                                    y += 30;
                                    count++;
                                }

                                y = 256;
                                repaint();
                            }
                            else
                            {

                                t.cancel();
                                jump = false;
                                count = 0;
                            }
                        }
                    };

                    t.schedule(task1, 0, 75);
                }
                repaint();
            }

            if(key == KeyEvent.VK_RIGHT)
            {
                //checkCollision;
                //SET TRUE
                right = true;
                left = false;
                jump = false;

                if(rightCount == 0 && !stop){
                    shiftRNow();
                    leftCount = 0;
                }

                if(rightCount % 2 != 0 && !stop)
                {
                    current = player[3];
                    x +=4;
                    shiftRNow();
                }
                else if(!stop)
                {
                    current = player[1];
                    x += 4;
                    shiftRNow();
                }

                rightCount++;
                repaint();
            }

            if(key == KeyEvent.VK_LEFT)
            {
                //checkCollision;
                //SET TRUE
                left = true;
                right = false;
                jump =  false;

                if(leftCount == 0 && !stop)
                    rightCount = 0;

                if(leftCount % 2 != 0 && !stop)
                {
                    current = player[2];
                    x -= 4;
                    shiftLNow();
                }
                else if(!stop)
                {
                    current = player[0];
                    x -= 4;
                }
                leftCount++;
                repaint();
            }

            if(key == KeyEvent.VK_UP)
            {
                jump = true;
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            //checkCollision;
            if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT){
                right = false;
                left = false;
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub

        }
    }








}
