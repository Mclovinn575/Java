import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {


        // Create 800 x 600 frame
        JFrame frame = new JFrame("Testing Window");
        frame.setSize(800,600);
        frame.setLayout(null);


        // Create Text Field
        JTextField textField = new JTextField("Enter Name Here...");
        textField.setBounds(250, 100, 300, 50);
        frame.add(textField);

        JLabel label = new JLabel("Who are you?");
        label.setBounds(250, 200, 300, 50);
        frame.add(label);

        JButton button = new JButton("Enter");
        button.setBounds(250, 300, 100, 50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                label.setText("Hello "+ textField.getText());
            }
        });
        frame.add(button);


        

        

        




        

        // Display to user
        frame.setVisible(true);


    }
}
