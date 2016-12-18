package def;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DaveDriver extends JFrame {

	static JFrame frame;
	static JPanel contentPane;
	static MainMenuPanel mainMenuPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		
		frame = new DaveDriver();
		
		frame.pack();
		frame.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public DaveDriver() {
		setTitle("Dave Davesson");
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 800, 600));
		contentPane.setLayout(null);
		
		mainMenuPanel = new MainMenuPanel();
		
		mainMenuPanel.setVisible(true);
		
		setContentPane(contentPane);
		getContentPane().add(mainMenuPanel);
		mainMenuPanel.setLayout(null);
		
	}

}
