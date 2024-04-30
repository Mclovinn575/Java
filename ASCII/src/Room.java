import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    // Cardinal Directions
    public static String North = "North";
    public static String East = "East";
    public static String South = "South";
    public static String West = "West";

    // Name of Room/Room Type
    private String roomName;

    // Short description of the room 
    private String roomDescription;

    // Doors in the room
    private HashMap<String, Door> doors;

    // Items in the room
    // private ArrayList<Items> items;

    // Enemies in the room
    // private ArrayList<Enemies> enemies;

    // Keep track of the current and next rooms
    private String entryDirection;

    // Specifies the chance a door will spawn on one of the cardinal directions
    public void GenerateDoors()
    {
        // Always spawn a door at the entryDirection
        doors.put(this.entryDirection, new Door(this.entryDirection));


        // Currently 25% chance to have a door spawn on each wall
        // '&&' returns true only if both left and right statements are TRUE
        if (!this.entryDirection.equals(North) && Math.random() < 0.25) {
            doors.put(North, new Door(North));
        }
        if (!this.entryDirection.equals(East) && Math.random() < 0.25) {
            doors.put(East, new Door(East));
        }
        if (!this.entryDirection.equals(South) && Math.random() < 0.25) {
            doors.put(South, new Door(South));
        }
        if (!this.entryDirection.equals(West) && Math.random() < 0.25) {
            doors.put(West, new Door(West));
        }
        
    }


    // +++++++++++++++++++++++++++ MAIN BLUEPRINT +++++++++++++++++++++++++++
    public Room(String roomName, String roomDescription, String entryDirection)
    {
        this.entryDirection = entryDirection;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.doors = new HashMap<>();
        GenerateDoors();

    }
    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++





    // =================================================================  GETTERS AND SETTERS  =================================================================

    public String getDescription()
    {
        return this.roomDescription;
    }

    public String getRoom()
    {
        return this.roomName;
    }

    // =================================================================  EXAMINING ROOM/OBJECTS  =================================================================

    // Overall Summary
    public void ExamineRoom()
    {

        // Specify which direction character entered from
        System.out.println("=== Entered From: ===\n"+this.entryDirection+"\n");





        // Specify doors and door direction
        System.out.println("Doors on:");
        for (Door door : doors.values()) {
            try {
                System.out.println(door.doorNameDir());
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
    }









    }


    




