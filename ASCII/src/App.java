import java.io.Console;

public class App {

    

    private static Room currentRoom;


    // TODO: Look to add in a HELP option to the menu that will display all the commands available to player.

    // TODO: Add in Player Characters 
    // TODO: Add in Enemys 

    // TODO: Add in different Player Classes
    // TODO: Possibly look to have enemys have classes as well. May keep them as 'monsters' 


    public static void main(String[] args) throws Exception {

        clearScreen();


        
        // Create the player character
        Character playerCharacter = new Character("Player", Weapon.sword);


        // represet a 2x2 Grid of rooms
        // X->X
        //    |
        // X<-X

        Room room1 = new Room(Room.West, Room.East);
        Room room2 = new Room(Room.West, Room.South);
        Room room3 = new Room(Room.North, Room.West);
        Room room4 = new Room(Room.East, null);

        // Connect rooms...
        room1.setAdjacentRoom(Room.East, room2);
        room2.setAdjacentRoom(Room.West, room1);
        room2.setAdjacentRoom(Room.South, room3);
        room3.setAdjacentRoom(Room.North, room2);
        room3.setAdjacentRoom(Room.West, room4);
        room4.setAdjacentRoom(Room.East, room3);

        // Set initial room...
        currentRoom = room1;

        

        // Test Game Loop
        while (true) {
            clearScreen();
            currentRoom.ExamineRoom();
            
            // Get user input
            Console console = System.console();
            String input = console.readLine("Enter ACTION/DIRECTION or 'quit' to exit: ").toUpperCase();

            // Check for user input to move or quit
            if (input.equals("QUIT")) {
                break;
            } 
            if (input.equals("ATTACK")) {

                playerCharacter.Attack(currentRoom.enemyCharacter);
                if (currentRoom.enemyCharacter.currentHP <= 0) {
                    currentRoom.enemyCharacter = null;
                }

                
                
            }
            else {
                // If enemy is in the room do not allow the user to proceed
                if (currentRoom.hasEnemy == true) {
                    System.out.println("You cannot proceed... A monster blocks the way!");
                    console.readLine("Press Enter to continue...");
                    continue;
                    
                }
                
                // Try to move to the adjacent room
                Room nextRoom = currentRoom.getAdjacentRoom(input);
                if (nextRoom != null) {
                    currentRoom = nextRoom;
                    if (currentRoom == room4) {
                        System.out.println("\nFINAL ROOM!!!");
                        System.console().readLine();
                    }
                } else {
                    System.out.println("You cannot move in that direction.");
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
