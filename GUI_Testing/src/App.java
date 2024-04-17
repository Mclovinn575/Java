import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {


        // Create 800 x 600 frame
        JFrame frame = new JFrame("Testing Window");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Add text field 20 columns wide
        JTextField textField = new JTextField(20);


        // Add button and actionListener
        JButton button = new JButton("Enter Name");
        button.addActionListener(action -> {
            JOptionPane.showMessageDialog(textField, "Hello "+textField.getText(), "Greetings!", JOptionPane.DEFAULT_OPTION);

        });


        // Add components to frame
        frame.getContentPane().setLayout(new FlowLayout()); 
        frame.getContentPane().add(button);
        frame.getContentPane().add(textField);

        

        




        

        // Display to user
        frame.setVisible(true);


    }
}
