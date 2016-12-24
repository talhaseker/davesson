package game.data;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SettingsPanel extends JPanel {

	static JButton backButton;
	private JTextField textField;
	String userName;
	static JComboBox comboBox;
	
	public SettingsPanel() {
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
				LastMain.settingsPanel.setVisible(false);
        	}
        });
        backButton.setIcon(new ImageIcon("C:\\Users\\berkt\\Desktop\\Buttons\\backbutton.png"));
        backButton.setBounds(30, 530, 63, 59);
        add(backButton);
        
        JButton btnNewButton = new JButton("Apply");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		userName = (String)comboBox.getSelectedItem();
        	}
        });
        btnNewButton.setBounds(346, 260, 97, 25);
        add(btnNewButton);
        
        JSlider slider = new JSlider();
        slider.setBounds(412, 158, 200, 26);
        add(slider);
        
        comboBox = new JComboBox();
        comboBox.setBounds(422, 209, 31, 22);
        add(comboBox);
        
        textField = new JTextField();
        textField.setBounds(412, 107, 116, 22);
        add(textField);
        textField.setColumns(10);
        
        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUsername.setBounds(310, 108, 102, 16);
        add(lblUsername);
        
        JLabel lblVolume = new JLabel("Volume :");
        lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblVolume.setBounds(324, 158, 73, 16);
        add(lblVolume);
        
        JLabel lblSelectLevel = new JLabel("Level :");
        lblSelectLevel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSelectLevel.setBounds(342, 210, 88, 16);
        add(lblSelectLevel);
        
        
        
        
	}
}
