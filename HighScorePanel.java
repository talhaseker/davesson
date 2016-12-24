package game.data;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighScorePanel extends JPanel {

	static JButton backButton;
	static String highScore;
	
	public HighScorePanel() {
		setLayout(null);
					
		setForeground(new Color(0, 0, 0));
		setBackground(Color.lightGray);
		setBounds(0,0,800,614);
		setLayout(null);
        
		JButton backButton = new JButton("");
        backButton.setBackground(Color.LIGHT_GRAY);
        backButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LastMain.mainMenuPanel.setVisible(true);
				LastMain.highScorePanel.setVisible(false);
        	}
        });
        backButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\Buttons\\backbutton.png"));
        backButton.setBounds(30, 530, 63, 59);
        add(backButton);
        
        
        JLabel lblNewLabel = new JLabel("High Scores: ");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(322, 25, 234, 92);
		add(lblNewLabel);
		
		BufferedReader br = null;
		
		try {


            br = new BufferedReader(new FileReader("C:\\Users\\berkt\\Desktop\\data\\high_scores.txt"));

            while ((highScore = br.readLine()) != null) {

            	JLabel lblNewLabel_1 = new JLabel(highScore);
        		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        		lblNewLabel_1.setBounds(349, 185, 106, 25);
        		add(lblNewLabel_1);
                System.out.println(highScore);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
	}
}

