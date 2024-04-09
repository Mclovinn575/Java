import java.util.Scanner;

public class Player {

      public static int RandomRoll(int low, int high)
    {
        int result = (int)(Math.random() * (high - low + 1)) + low;
        return result;

    }
    
    // Prepare for user input
    Scanner input = new Scanner(System.in);


    // Establish variables
    private int choice;
    private String name;

    // Create Player Blueprint
    public Player(String nameString)
    {
        this.name = nameString;

    }

    //===== Getters and Setters =====
    
    // Name
    public void setName(String name)
    {
        this.name = name;
    }


    // Establish Player actions
    public int PlayerChoice()
    {
     System.out.println("Enter your guess:");
     this.choice = input.nextInt();  
     return this.choice; 

    }

    public int ComputerChoice()
    {
        this.choice = RandomRoll(1, 10);
        System.out.println(this.name+" has chosen: "+this.choice);
        return this.choice;
    }


    


}
