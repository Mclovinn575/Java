import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {


        // Create 800 x 600 frame
        JFrame frame = new JFrame("Testing Window");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Add text field 20 columns wide
        JTextField textField = new JTextField(20);

        // Add a label with nothing for now
        JLabel label = new JLabel();
        


        // Add button and actionListener
        JButton button = new JButton("Enter Name");
        button.addActionListener(action -> {

            label.setText("Hello "+textField.getText()+'.');

        });


      

        frame.getContentPane().add(BorderLayout.CENTER, label);
        frame.getContentPane().add(BorderLayout.PAGE_START, textField);
        frame.getContentPane().add(BorderLayout.PAGE_END, button);
        

        




        

        // Display to user
        frame.setVisible(true);


    }
}
