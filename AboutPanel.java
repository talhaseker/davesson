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

public class AboutPanel extends JPanel {

	static JButton backButton;
	
	public AboutPanel() {
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
				LastMain.aboutPanel.setVisible(false);
        	}
        });
        backButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\Buttons\\backbutton.png"));
        backButton.setBounds(30, 530, 63, 59);
        add(backButton);
        
        
        JLabel lblNewLabel = new JLabel("Developers");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(322, 25, 234, 92);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Emre Arıoglu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(349, 185, 106, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sefa Gundogdu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(337, 234, 135, 25);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Berk Turk");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(359, 142, 96, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Burak Ozmen");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(348, 289, 124, 16);
		add(lblNewLabel_4);
        
	}
}
