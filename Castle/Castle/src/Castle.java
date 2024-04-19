import java.util.Scanner;

public class Castle {

    private String name;
    private int wood;
    public int userChoice;

    // Scanner for input
    Scanner input = new Scanner(System.in);
    
    public Castle(String name, int wood)
    {
        this.name = name;
        this.wood = wood;
        this.userChoice = 0;
        
    }

    public void generateResources()
    {
        while (true) {
            this.wood++;
            try {
                // 1 wood per sec
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public int getUserChoice()
    {
        System.out.println("\nChoice >>: ");
        this.userChoice = input.nextInt();
        return this.userChoice;
    }

    public void displayOptions()
    {
        ClearScreen();
        System.out.println(String.join("\n", "Castle "+this.name));
        System.out.println(String.join("\n", "\n=== Choices ===", "1.) View Resources"));
        this.userChoice = input.nextInt();
        switch (this.userChoice) {
        case 1:
            this.displayResources();
            break;
        
        case 2:
            System.exit(1);

    
        default:
            break;  
        }
    }

    public void displayResources()
    {
        while (this.userChoice != 99) {
            ClearScreen();
            System.out.println("Wood: "+this.wood);
            System.out.println("\n=== Press '99' to go back to menu");
            this.userChoice = input.nextInt(); 
            
        }
        this.displayOptions();
    }

    
    public static void ClearScreen()    {
        System.out.print("\033\143");
    }


}
