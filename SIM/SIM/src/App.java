import java.util.Scanner;
import java.util.concurrent.CompletableFuture;


public class App {
    
    // Clear Screen Function
    public static void clearScreen() {
        // Clear Screen method
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Scanner for input
    // private static Scanner input = new Scanner(System.in);

    // Import Menu System
    public static Menu menu = new Menu();







    public static void main(String[] args) throws Exception {


        // Clean up before displaying
        clearScreen();


        // Create test 3x3 grid
        // WorldPlane testPlane = new WorldPlane(3, 3);
        // testPlane.displayMap();

        // Character testDummy = new Character();

        // Use CompleteableFuture to run class method asynchronously
        // This will only run as long as the program does. It will not keep the program running by itself.
        // A way to wait for the task to finish is to use the .join() command

        
        menu.mainMenu();

        




        



        















    }
}

