import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

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

        // Create the list holding the tasks data
        DefaultListModel<Task> listModel = new DefaultListModel<>();
        JList<Task> taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        taskList.setSelectedIndex(0);
        taskList.setVisibleRowCount(5);

        JScrollPane savedTasks_ScrollList = new JScrollPane(taskList);
        savedTasks_ScrollList.setPreferredSize(new Dimension(500,200));

        // Create the Pane to hold the "Saved Tasks" Controls
        JPanel taskControls_Pane = new JPanel();

        // Allow user to create new Tasks/Notes
        JButton addTask_Button = new JButton("Add Task");
        addTask_Button.addActionListener(action -> {

            System.out.println("Attempting to add task.");
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
                listModel.addElement(newTask);
                savedTasks_Pane.revalidate();
                savedTasks_Pane.repaint();
                System.out.println("=== Task Created: "+newTask.getTaskTitle()+" ===");
                System.out.println(newTask.getTaskBody());
                
            }

        });

        // Allow User to Open and edit notes
        JButton editTask_Button = new JButton("Open Task");
        editTask_Button.addActionListener(action -> {
            System.out.println("Attempting to edit task.");
            int selected = taskList.getSelectedIndex();
            Task currentTask = listModel.getElementAt(selected);

            System.out.println("Selected from list index: "+selected);
            String selectedTitle = currentTask.getTaskTitle();
            String selectedBody = currentTask.getTaskBody();

            JTextField titleField = new JTextField(selectedTitle);
            JTextField bodyField = new JTextField(selectedBody);
            bodyField.setPreferredSize(new Dimension(200,50));

            Object[] taskMessage = {
                "Title", titleField,
                "Body", bodyField
            };

            int result = JOptionPane.showConfirmDialog(null, taskMessage, "New Task", JOptionPane.OK_CANCEL_OPTION);
            if(result == JOptionPane.OK_OPTION){
                currentTask.setTaskTitle(titleField.getText());
                currentTask.setTaskBody(bodyField.getText());
                savedTasks_Pane.revalidate();
                savedTasks_Pane.repaint();

            }


        });

        // Allow user to delete Tasks/Notes
        JButton deleteTask_Button = new JButton("Delete Task");
        deleteTask_Button.addActionListener(action -> {
            System.out.println("Attempting to delete task.");
            int selected = taskList.getSelectedIndex();
            Task currentTask = listModel.getElementAt(selected);
            listModel.removeElementAt(selected);
            System.out.println("Deleted Task: "+currentTask.getTaskTitle());
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
