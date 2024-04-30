import java.io.Console;

public class App {





    public static void main(String[] args) throws Exception {

        clearScreen();

        // represet a 2x2 Grid of rooms
        // X->X
        //    |
        // X<-X
        Room room1 = new Room(Room.West, Room.East);
        room1.ExamineRoom();
        System.console().readLine();
        Room room2 = new Room(Room.West, Room.South);
        room2.DisplayRoom();
        System.console().readLine();
        Room room3 = new Room(Room.North, Room.West);
        room3.DisplayRoom();
        System.console().readLine();
        Room room4 = new Room(Room.South, null);
        room4.DisplayRoom();
        System.console().readLine();


        





    }


    // Clear Screen Function
    public static void clearScreen() {
        // Clear Screen method
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
