import java.util.HashMap;

public class Room {

    // Cardinal Directions
    public final static String North = "NORTH";
    public final static String East = "EAST";
    public final static String South = "SOUTH";
    public final static String West = "WEST";


    // Define room size and layout
    private int roomX = 5;
    private int roomY = 5;
    private int playerY = roomY / 2;
    private int playerX = roomX / 2;
    char[][] roomLayout = new char[roomX][roomY];


    // Define map characters
    private char mapChar = '.';
    private char playerChar = 'X';

    // Doors in the room
    private HashMap<String, Door> doors;

    // Adjacent Rooms
    private HashMap<String, Room> adjacentRooms;

    // Items in the room
    // private ArrayList<Items> items;

    // Enemies in the room
    // private ArrayList<Enemies> enemies;

    // Keep track of the current and next rooms
    private String entryDirection;
    private String exitDirection;



    // +++++++++++++++++++++++++++ MAIN BLUEPRINT +++++++++++++++++++++++++++
    public Room(String entryDirection, String exitDoor)
    {
        this.entryDirection = entryDirection;
        this.exitDirection = exitDoor;
        this.doors = new HashMap<>();
        this.adjacentRooms = new HashMap<>();
        GenerateRoom();
        GenerateDoors();

        

    }
    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





    // =================================================================  GENERATORS  =================================================================

    // Specifies the chance a door will spawn on one of the cardinal directions
    public void GenerateDoors()
    {
        // Always spawn a door at the entryDirection
        doors.put(this.entryDirection, new Door(this.entryDirection));
        doors.put(this.exitDirection, new Door(this.exitDirection));


        
    }

    public void GenerateRoom()
    {
        // Fill area with #
        for (int i = 0; i < roomLayout.length; i++) {
            for (int j = 0; j < roomLayout[i].length; j++) {
                roomLayout[i][j] = mapChar;
            }

            roomLayout[playerX][playerY] = playerChar;
                
            
        }

        // Place 'D' on the cardinal faces (in the middle) depending on entry and exit directions
        int middle = roomX / 2; // Middle position

        // Handle entry direction if not null
        if (entryDirection != null) {
            if (entryDirection.equals(North)) {
                roomLayout[0][middle] = 'D';
            } else if (entryDirection.equals(East)) {
                roomLayout[middle][roomY - 1] = 'D';
            } else if (entryDirection.equals(South)) {
                roomLayout[roomX - 1][middle] = 'D';
            } else if (entryDirection.equals(West)) {
                roomLayout[middle][0] = 'D';
            }
        }

        // Handle exit direction if not null
        if (exitDirection != null) {
            if (exitDirection.equals(North)) {
                roomLayout[0][middle] = 'D';
            } else if (exitDirection.equals(East)) {
                roomLayout[middle][roomY - 1] = 'D';
            } else if (exitDirection.equals(South)) {
                roomLayout[roomX - 1][middle] = 'D';
            } else if (exitDirection.equals(West)) {
                roomLayout[middle][0] = 'D';
            }
        }

    }

    private void DisplayRoom()
    {
       
        for (int i = 0; i < roomLayout.length; i++) {
            for (int j = 0; j < roomLayout[i].length; j++) {

                System.out.print(roomLayout[i][j]);
            }
            System.out.println();
        }

        


    }


    // =================================================================  EXAMINING ROOM/OBJECTS  =================================================================

    // Overall Summary
    public void ExamineRoom()
    {
        // Specify which direction character entered from
        System.out.println("=== Entered From: ===\n"+this.entryDirection+"\n");

        // // Specify doors and door direction
        // System.out.println("Doors on:");
        // for (Door door : doors.values()) {
        //     try {
        //         System.out.println(door.doorNameDir());
        //     } catch (Exception e) {

        //     }
        // }

        DisplayRoom();

        System.out.println("======================");
        
    }

        // Method to set the adjacent room in a specific direction
        public void setAdjacentRoom(String direction, Room room) {

            adjacentRooms.put(direction, room);
        }

        public Room getAdjacentRoom(String direction) {

            return adjacentRooms.get(direction);
        }
  
    }


    




