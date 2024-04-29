import java.util.Scanner;

public class App {

    public static void clearScreen() {
        // Clear Screen method
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static Scanner input = new Scanner(System.in);






    public static void main(String[] args) throws Exception {


        // Clean up before displaying
        clearScreen();


        // Create test 3x3 grid
        WorldPlane testPlane = new WorldPlane(3, 3);
        testPlane.displayMap();


        // while (true) {
        //     System.out.println("Enter Movement:");
        //     char moveKey = input.next().charAt(0);
        //     testPlane.movePlayer(moveKey);
        //     testPlane.displayMap();
            
        // }


        




        
















    }
}

