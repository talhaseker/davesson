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

public class HelpPanel extends JPanel {

	static JButton backButton;
	
	public HelpPanel() {
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
				LastMain.helpPanel.setVisible(false);
        	}
        });
        backButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\Buttons\\backbutton.png"));
        backButton.setBounds(30, 530, 63, 59);
        add(backButton);
        
        
        JLabel lblNewLabel = new JLabel("How To Play");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(322, 25, 234, 92);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The main goal in this game is to reach the door without dying.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(168, 114, 558, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("But, be careful about the flames, water and monsters along the road!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(143, 164, 583, 25);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Also, the users can pick the diamonds in the way to increase the score.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(132, 213, 630, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Controls");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(343, 254, 253, 45);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Arrow buttons for directing Dave.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(272, 312, 286, 57);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Space button for shooting a bullet.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(270, 371, 286, 45);
		add(lblNewLabel_6);
        
	}
}