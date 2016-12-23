package game.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by arıoğlu on 12/16/2016.
 */
public class MainMenu {
    private JFrame settingsFrame, helpFrame, aboutFrame;
    private JPanel mainPanel, settingsPanel, helpPanel, aboutPanel;

    private JLabel label;
    private JComboBox level;
    private JTextField userName;
    private JSlider soundVolume;

    private JButton playGameButton, highScoreButton,
            settingsButton, helpButton, aboutButton,
            exitButton, backButton, applySettings;

    public MainMenu() {
        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Starts game.");
            }
        });
        highScoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame scoreFrame = new JFrame();

                scoreFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                scoreFrame.setSize(1000, 750);
                scoreFrame.setVisible(true);

                JPanel scorePanel = new JPanel();

                BufferedReader br = null;
                scoreFrame.add(scorePanel, BorderLayout.CENTER);

                try {
                    backButton = new JButton("BACK");
                    scorePanel.add(backButton);
                    String currentLine;

                    br = new BufferedReader(new FileReader("game/data/high_scores.txt"));

                    while ((currentLine = br.readLine()) != null) {

                        scorePanel.setLayout(new BoxLayout(scorePanel, BoxLayout.Y_AXIS));
                        label = new JLabel(currentLine);
                        label.setAlignmentX(scorePanel.BOTTOM_ALIGNMENT);
                        scorePanel.add(label);
                        System.out.println(currentLine);
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

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        scoreFrame.setVisible(false);
                    }
                });

                //openFile = new JFileChooser(new File("C:/Users/arıoğlu/Desktop/davesson/src/game/menu"));
                //openFile.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

                /*Scanner scan = new Scanner(System.in);
                BufferedReader scores = null;
                String str;

                try{
                    scores = new BufferedReader(new FileReader("C:/Users/arıoğlu/Desktop/davesson/src/game/menu" + scan.next()));

                }
                catch (FileNotFoundException fnfe){
                    JOptionPane.showMessageDialog(null, "File cannot be found.");
                }

                try{
                    while((str = scores.readLine()) != null){
                        System.out.println(str);
                    }
                }
                catch (IOException ioe){
                    JOptionPane.showMessageDialog(null, "File cannot be found.");
                }
                finally {
                    System.exit(0);
                }*/
            }
        });

        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                level = new JComboBox();
                backButton = new JButton("BACK");
                soundVolume = new JSlider();
                userName = new JTextField();
                applySettings = new JButton("APPLY");

                settingsFrame = new JFrame();
                settingsFrame.setVisible(true);
                settingsFrame.setSize(1000, 750);
                settingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                settingsPanel = new JPanel();
                settingsFrame.add(settingsPanel);

                settingsPanel.add(level);
                settingsPanel.add(userName);
                settingsPanel.add(backButton);
                settingsPanel.add(soundVolume);
                settingsPanel.add(applySettings);

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        settingsFrame.setVisible(false);
                    }
                });
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpFrame = new JFrame();
                helpFrame.setVisible(true);
                helpFrame.setSize(1000, 750);
                helpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                helpPanel = new JPanel();
                backButton = new JButton("BACK");
                helpFrame.add(helpPanel, BorderLayout.CENTER);
                helpPanel.add(backButton);

                BufferedReader br = null;

                try {
                    String currentLine;

                    br = new BufferedReader(new FileReader("game/menu/help.txt"));

                    while ((currentLine = br.readLine()) != null) {
                        helpPanel.setLayout(new BoxLayout(helpPanel, BoxLayout.Y_AXIS));
                        label = new JLabel(currentLine);
                        label.setAlignmentX(helpPanel.BOTTOM_ALIGNMENT);
                        helpPanel.add(label);
                        System.out.println(currentLine);
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

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        helpFrame.setVisible(false);
                    }
                });
            }
        });
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutFrame = new JFrame();
                aboutFrame.setVisible(true);
                aboutFrame.setSize(1000, 750);
                aboutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                aboutPanel = new JPanel();
                backButton = new JButton("BACK");
                aboutFrame.add(aboutPanel, BorderLayout.CENTER);
                aboutPanel.add(backButton);

                BufferedReader br = null;

                try {
                    String currentLine;

                    br = new BufferedReader(new FileReader("game/menu/about.txt"));

                    while ((currentLine = br.readLine()) != null) {

                        JLabel label;
                        aboutPanel.setLayout(new BoxLayout(aboutPanel, BoxLayout.Y_AXIS));
                        label = new JLabel(currentLine);
                        label.setAlignmentX(aboutPanel.BOTTOM_ALIGNMENT);
                        aboutPanel.add(label);
                        System.out.println(currentLine);
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

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        aboutFrame.setVisible(false);
                    }
                });

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Dave Davesson");
        mainFrame.setPreferredSize(new Dimension(1000, 750));
        mainFrame.setContentPane(new MainMenu().mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

}
