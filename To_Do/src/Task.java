import javax.swing.JTextField;

public class Task {

    private String taskTitle;
    private String taskBody;

    public Task(String title, String body)
    {
        this.taskTitle = title;
        this.taskBody = body;



    }

    public String getTaskTitle()
    {return this.taskTitle;}

    public String getTaskBody()
    {return this.taskBody;}

}
