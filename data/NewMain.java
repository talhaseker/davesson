package game.data;

/**
 * Created by Sefa Gündoğdu on 12/19/2016.
 */
import javax.swing.JFrame;

public class NewMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("DENEME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel sample = new GamePanel();
        frame.add(sample);

        frame.pack();
        frame.setVisible(true);


    }

}
