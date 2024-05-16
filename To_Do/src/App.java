import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class App {


    public static void main(String[] args) throws Exception {


        // Create the Frame to hold the window
        JFrame frame = new JFrame("To-Do Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set Frame sizing
        frame.setSize(600,300);

        // Centers the frame
        frame.setLocationRelativeTo(null);
        Container rootPane = frame.getContentPane();

        // Create a File Explorer
        // final JFileChooser fileChooser = new JFileChooser();
        
        // Set the pane layout (Default is a JPanel with a BorderLayout)
        rootPane.setLayout(new BoxLayout(rootPane, BoxLayout.PAGE_AXIS));
        JLabel savedTasks_Title = new JLabel("Saved Tasks:");

        // Create the Pane to hold the list of notes
        JPanel savedTasks_Pane = new JPanel();
        JScrollPane savedTasks_ScrollList = new JScrollPane(savedTasks_Pane);
        savedTasks_ScrollList.setPreferredSize(new Dimension(500,200));

        // Create the Pane to hold the "Saved Tasks" Controls
        JPanel taskControls_Pane = new JPanel();


        // Create buttons to add to the controls panel
        JButton addTask_Button = new JButton("Add Task");
        addTask_Button.addActionListener(action -> {

            System.out.println("Attempting to add task.\n");
            JTextField titleField = new JTextField();
            JTextField bodyField = new JTextField();
            bodyField.setPreferredSize(new Dimension(200,50));
            Object[] taskMessage = {
                "Title", titleField,
                "Body", bodyField
            };
            int result = JOptionPane.showConfirmDialog(null, taskMessage, "New Task", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                Task newTask = new Task(titleField.getText(), bodyField.getText());
                savedTasks_Pane.add(new JLabel(newTask.getTaskTitle()));
                savedTasks_Pane.revalidate();
                savedTasks_Pane.repaint();



                System.out.println("=== Task Created: "+newTask.getTaskTitle()+" ===\n");
                System.out.println(newTask.getTaskBody());
                
            }




        });

        JButton editTask_Button = new JButton("Edit Task");
        editTask_Button.addActionListener(action -> {
            System.out.println("Attempting to edit task.");
        });

        JButton deleteTask_Button = new JButton("Delete Task");
        deleteTask_Button.addActionListener(action -> {
            System.out.println("Attempting to delete task.");
        });


        // Add buttons to the control pane
        taskControls_Pane.add(addTask_Button);
        taskControls_Pane.add(editTask_Button);
        taskControls_Pane.add(deleteTask_Button);


        // ===== Add Components to the Root Pane
        rootPane.add(savedTasks_Title);
        rootPane.add(savedTasks_ScrollList);
        rootPane.add(taskControls_Pane);
        // rootPane.add(taskCreateTitle_Pane);
        // rootPane.add(taskCreateBody_Pane);


        // Allow the user to see the Pane/Window
        frame.setVisible(true);
      

    }
}
