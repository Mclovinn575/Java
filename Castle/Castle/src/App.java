import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 

public class App {
    public static void main(String[] args) throws Exception {
        // Purpose is to have a castle object that generates resources over time (Async thread)
        // Use resources to schedule tasks that utilize them (Task Manager / Async)

        // Clean up Screen 
        ClearScreen();

        // Create a Executor Service that will run threads asynchronously (increase/decrease pool as needed)
        ExecutorService threadRunner = Executors.newFixedThreadPool(1);

        // Create the Castle
        Castle myCastle = new Castle("Myke", 0);

        // Add the generateResources() as an Async Thread (runs in background)
        threadRunner.submit(myCastle::generateResources);

        // Displays menu, May change from displayOptions() -> Menu()
        myCastle.displayOptions();
       
            
        
            



        



        // Shudown threadRunner when no longer in use
        threadRunner.shutdown();

    }


public static void ClearScreen()
    {
        System.out.print("\033\143");
    }
}
