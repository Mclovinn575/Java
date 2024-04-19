public class Task extends Thread {
    // Defines a task a person can create that will utilize resources

    String taskName;
    int duration;

    public Task(String taskName, int duration)
    {
        this.taskName = taskName;
        this.duration = duration;
    }

    public void addTill()
    {
        int num = 0;
        System.out.println("=== Background Task "+this.taskName+" Started ===");
        while (num < this.duration) {
            num++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("=== Background Task "+this.taskName+" Completed! ===");
    }





}
