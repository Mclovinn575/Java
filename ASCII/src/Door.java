public class Door {

    // private Room currentRoom;
    // private Room nextRoom;
    
    private String doorDirection;
    public char doorChar = 'D';

    public Door(String direction)
    {
        
        this.doorDirection = direction;

    }

    public String doorNameDir()
    {
        return this.doorDirection;
    }


}
