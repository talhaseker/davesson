package game.data;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static TileMap map;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initGUI();
            }
        });
    }

    private static void initGUI( ){
            JFrame frame = new JFrame("DAVESSON");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            GamePanel panel = new GamePanel();
            frame.add(panel);

            frame.pack();
            frame.setVisible(true);
            frame.setSize(960, 500);
            frame.setPreferredSize(new Dimension(1600, 500));

            //ALINTI
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        }
    }
