public class Generator extends Thread {


    private String taskName;
    World world;


    public Generator(String taskName, World world)
    {
        // Generates 'things' over time
        this.taskName = taskName;

        // Define world to execute task on
        this.world = world;


    }


    public void run()
    {

        while (true) {

            // Overwrite threads run() method that runs when the thread is started
            world.wood ++;
            world.stone++;

            // Sleep for 1 second
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }






    }

}
