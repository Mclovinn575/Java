import java.io.Console;

public class App {

    

    private static Room currentRoom;



    public static void main(String[] args) throws Exception {

        clearScreen();

        // represet a 2x2 Grid of rooms
        // X->X
        //    |
        // X<-X
        Room room1 = new Room(Room.West, Room.East);
        Room room2 = new Room(Room.West, Room.South);
        Room room3 = new Room(Room.North, Room.West);
        Room room4 = new Room(Room.South, null);

        // Connect rooms...
        room1.setAdjacentRoom(Room.East, room2);
        room2.setAdjacentRoom(Room.West, room1);
        room2.setAdjacentRoom(Room.South, room3);
        room3.setAdjacentRoom(Room.North, room2);
        room3.setAdjacentRoom(Room.West, room4);
        room4.setAdjacentRoom(Room.South, room3);

        // Set initial room...
        currentRoom = room1;

    // Test Game Loop
    while (true) {
            clearScreen();
            currentRoom.ExamineRoom();
            
            // Get user input
            Console console = System.console();
            String input = console.readLine("Enter direction (NORTH, EAST, SOUTH, WEST) to move or 'quit' to exit: ").toUpperCase();

            // Check for user input to move or quit
            if (input.equals("QUIT")) {
                break;
            } else {
                // Try to move to the adjacent room
                Room nextRoom = currentRoom.getAdjacentRoom(input);
                if (nextRoom != null) {
                    currentRoom = nextRoom;
                    if (currentRoom == room1) {
                        System.out.println("FINAL ROOM!!!");
                    }
                } else {
                    System.out.println("You cannot move in that direction.");

                    // For debugging correct direction
                    // System.out.println(input);

                    console.readLine("Press Enter to continue...");
                }
            }
        }
    }

        







    // Clear Screen Function
    public static void clearScreen() {
        // Clear Screen method
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    
}
