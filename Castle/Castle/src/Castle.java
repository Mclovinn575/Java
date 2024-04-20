import java.util.Scanner;

public class Castle extends Thread {

    
    public String name;
    public int wood;
    public int woodPerMinute;
    public int stone;
    public int stonePerMinute;
    public int gold;
    public int goldPerMinute;
    public int populationTotal;
    public int userChoice = 99;


    public int houseCost = 50;
    public int houseTotal;

    // Scanner for input
    public Scanner input = new Scanner(System.in);

   

    public Castle(String name, int wood, int stone, int gold)
    {
        this.name = name;
        this.wood = wood;
        this.woodPerMinute = 60;
        this.gold = gold;
        this.stonePerMinute = 60;
        this.stone = stone;
        this.goldPerMinute = 60;

        

        
    }

    public void generateResources()
    {
        while (true) {
            this.wood += (woodPerMinute / 60);
            this.stone += (woodPerMinute / 60);
            this.gold += (woodPerMinute / 60);
            try {
                // 1 wood per sec
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public void displayResources()
    {
        // Clean up the screen
        ClearScreen();
        // Display the resources
        System.out.println("Wood: "+this.wood);
        System.out.println("Wood: "+this.stone);
        System.out.println("Wood: "+this.gold);

        // Display the structures
        System.out.println("\nHouses: "+this.houseTotal);

        input.nextLine();
        mainMenu();

    }

    public void buildHouse()
    {
        int buildChoice;

        // Add in confirmation later
        if (this.wood >= houseCost) {
            // If wood stock is greater than house cost then allow player to build
            this.houseTotal++;
            this.populationTotal++;
            this.wood = this.wood - houseCost;
            System.out.println("\n - A new house was built in the kingdom! -");
            System.out.println("\n0.) BACK");
            // input.nextLine();
            buildChoice = input.nextInt();
            switch (buildChoice) {
                case 0:
                    buildMenu();
                    break;
            
                default:
                break;
            }
        }
            // TODO: This option has a problem when less than 50 wood with the program hanging.
            // If wood is less than house cost, don't allow player to build any houses
            System.out.println("=== You do not have enought WOOD to build this ===");
            System.out.println("\n0.) BACK");
            buildChoice = input.nextInt();
            switch (buildChoice) {
                case 0:
                    this.buildMenu();
                    break;
            
                default:
                    break;
            }

    }

    public void mainMenu()
    {
        ClearScreen();
        System.out.println(String.join("\n", "Castle "+this.name));
        System.out.println("\n- Generating: ");
        System.out.println("--Wood: "+this.woodPerMinute+" /per minute");
        System.out.println("--Stone: "+this.stonePerMinute+" /per minute");
        System.out.println("--Gold: "+this.goldPerMinute+" /per minute");

        System.out.println(String.join("\n", "\n=== Choices ===", "1.) View Resources", "2.) Build Structure", "0.) EXIT"));
        this.getUserChoice();
        switch (this.userChoice) {
            case 1:
                this.displayResources();
            case 2:
                this.buildMenu();
        
            default:
                this.mainMenu();;
        }
            
    }
    
    public void buildMenu()
    {
        ClearScreen();
        System.out.println(String.join("\n", "=== Build Menu ===", "1.) House ("+this.houseCost+" WOOD)", "0.) BACK"));
        int buildChoice = this.input.nextInt();

        switch (buildChoice) {
            case 1:
                this.buildHouse();
                break;

            case 0:
            mainMenu();
            break;
        
            default:
                mainMenu();
        }
    }

    public int getUserChoice()
        {
            System.out.println("\nChoice >>: ");
            this.userChoice = this.input.nextInt();
            this.input.nextLine();
            return this.userChoice;
        }
        

































    
    public static void ClearScreen()    {
        System.out.print("\033\143");
    }


}
