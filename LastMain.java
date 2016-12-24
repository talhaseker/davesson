package game.data;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class LastMain extends JFrame{
	
	
	static JFrame frame;
	static JPanel contentPane;
	static GamePanel gamePanel;
	static MainMenuPanel mainMenuPanel;
	static AboutPanel aboutPanel;
	static HelpPanel helpPanel;
	static SettingsPanel settingsPanel;
	static HighScorePanel highScorePanel;

	    public static void main(String[] args) {
	        frame = new LastMain();
	        
	        frame.pack();
	        frame.setVisible(true);
            frame.setSize(960, 500);
            frame.setPreferredSize(new Dimension(1600, 500));

	    }
	    
	    public LastMain()
	    {
	    	setTitle("Dave Davesson");
			//setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			/*setBounds(100, 100, 800, 600);
			setLocationRelativeTo(null);*/
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(100, 100, 800, 600));
			contentPane.setLayout(null);
			
	        gamePanel = new GamePanel();
	        mainMenuPanel = new MainMenuPanel();
	        aboutPanel = new AboutPanel();
	        helpPanel = new HelpPanel();
	        settingsPanel = new SettingsPanel();
	        highScorePanel = new HighScorePanel();
	        
	        gamePanel.setVisible(false);
	        aboutPanel.setVisible(false);
	        mainMenuPanel.setVisible(true);
	        helpPanel.setVisible(false);
	        settingsPanel.setVisible(false);
	        highScorePanel.setVisible(false);
			
			setContentPane(contentPane);
			getContentPane().add(gamePanel);
			getContentPane().add(aboutPanel);
			getContentPane().add(mainMenuPanel);
			getContentPane().add(helpPanel);
			getContentPane().add(settingsPanel);
			getContentPane().add(highScorePanel);
			gamePanel.setLayout(null);
	    	
	    }
}
