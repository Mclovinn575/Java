public class App {





    public static void main(String[] args) throws Exception {


        Room testRoom = new Room("Test Room", "A room for testing things.", Room.South);


        clearScreen();
        testRoom.ExamineRoom();






    }


    // Clear Screen Function
    public static void clearScreen() {
        // Clear Screen method
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
