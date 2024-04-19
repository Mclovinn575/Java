import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws Exception {
        // Attempting to try to make a multi threaded app, that can take in information while still processing data.



        // Create the tasks to be run
        MyThread thread = new MyThread(30, "'Counting to 30'");
        MyThread thread2 = new MyThread(50,"'Counting to 50'");

        // Create an Executor Service to launch threads Asynchronously
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
            

        

        executorService.submit(thread);
        executorService.submit(thread2);

        executorService.shutdown();










    }
}
