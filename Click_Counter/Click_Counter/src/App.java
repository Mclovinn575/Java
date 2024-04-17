import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class App {

    static int counter;
    static JLabel counterLabel = new JLabel("Counter: "+counter);
    public static void main(String[] args) throws Exception {



        // Create frame to hold components
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);


        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        // Create the file Option
        JMenu menuFile = new JMenu("File");
        // File>Clear_Counter
        JMenuItem counterClear = new JMenuItem("Clear Counter");
        counterClear.addActionListener(selected -> {
            counter = 0;
            counterLabel.setText("Counter "+counter);
        });
        
        // Add 'File' option to 'menu bar'
        menuBar.add(menuFile);
        // Add 'Clear_File' option to 'File'
        menuFile.add(counterClear);
        frame.getContentPane().add(BorderLayout.PAGE_START, menuBar);

        // Create Label as a counter
        // Add to frame container
        frame.getContentPane().add(BorderLayout.CENTER, counterLabel);

        // Create a button that will hold the 'click' action
        JButton clickButton = new JButton("CLick Me!");
        // Add ActionListener Lambda to button to do something when clicked
        clickButton.addActionListener(click -> {
            // When clicked increase counter by 1
            counter++;
            counterLabel.setText("Counter: "+counter);
            
        });
        // Add to frame container
        frame.getContentPane().add(BorderLayout.PAGE_END, clickButton);






















        // Output to user
        frame.setVisible(true);
    }
}
