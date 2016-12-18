package def;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MainMenuPanel extends JPanel {

	static JButton playButton, howToPlayButton, highScoresButton, creditsButton;
	JLabel lblNewLabel;
	
	public MainMenuPanel() {
		setForeground(new Color(0, 0, 0));
		setBackground(Color.GREEN);
		setBounds(0,0,800,600);
		setLayout(null);
		
		playButton = new JButton("Play");
		//playButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\CV and So On\\Sucoder v1.2\\Yeni klas\u00F6r\\Images\\Buttons\\button2.png"));
		playButton.setBounds(291, 123, 201, 61);
		add(playButton);
		
		howToPlayButton = new JButton("How To Play");
		//howToPlayButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\CV and So On\\Sucoder v1.2\\Yeni klas\u00F6r\\Images\\Buttons\\button2.png"));
		howToPlayButton.setBounds(291, 209, 201, 61);
		add(howToPlayButton);
		
		highScoresButton = new JButton("High Scores");
		//highScoresButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\CV and So On\\Sucoder v1.2\\Yeni klas\u00F6r\\Images\\Buttons\\button2.png"));
		highScoresButton.setBounds(291, 290, 201, 75);
		add(highScoresButton);
		
		creditsButton = new JButton("Credits");	
		//creditsButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\CV and So On\\Sucoder v1.2\\Yeni klas\u00F6r\\Images\\Buttons\\button2.png"));
		creditsButton.setBounds(291, 393, 201, 66);
		add(creditsButton);
		
		lblNewLabel = new JLabel("Dave Davesson");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 40));
		lblNewLabel.setBounds(271, 30, 362, 66);
		add(lblNewLabel);

	}
}
