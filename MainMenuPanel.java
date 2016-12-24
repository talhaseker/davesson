package game.data;

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

	static JButton playButton, helpButton, highScoresButton, settingsButton, aboutButton;
	JLabel lblNewLabel;
	
	public MainMenuPanel() {
		setForeground(new Color(0, 0, 0));
		setBackground(Color.lightGray);
		setBounds(0,0,800,600);
		setLayout(null);
		
		playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==MainMenuPanel.playButton){
					LastMain.mainMenuPanel.setVisible(false);
					LastMain.gamePanel.setVisible(true);
				}
			}
		});
		playButton.setBounds(291, 123, 201, 46);
		add(playButton);
		
		helpButton = new JButton("Help");
		helpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==MainMenuPanel.helpButton){
					LastMain.mainMenuPanel.setVisible(false);
					LastMain.helpPanel.setVisible(true);
				}
			}
		});
		helpButton.setBounds(291, 182, 201, 39);
		add(helpButton);
		
		highScoresButton = new JButton("High Scores");
		highScoresButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==MainMenuPanel.highScoresButton){
					LastMain.mainMenuPanel.setVisible(false);
					LastMain.highScorePanel.setVisible(true);
				}
			}
		});
		highScoresButton.setBounds(291, 232, 201, 52);
		add(highScoresButton);
		
		settingsButton = new JButton("Settings");	
		settingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==MainMenuPanel.settingsButton){
					LastMain.mainMenuPanel.setVisible(false);
					LastMain.settingsPanel.setVisible(true);
				}
			}
		});
		settingsButton.setBounds(291, 297, 201, 46);
		add(settingsButton);
		
		aboutButton = new JButton("About");
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==MainMenuPanel.aboutButton){
					LastMain.mainMenuPanel.setVisible(false);
					LastMain.aboutPanel.setVisible(true);
				}
			}
		});
		aboutButton.setBounds(291, 356, 201, 46);
		add(aboutButton);
		
		lblNewLabel = new JLabel("Dave Davesson");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 40));
		lblNewLabel.setBounds(271, 30, 362, 66);
		add(lblNewLabel);
		
		

	}
}
