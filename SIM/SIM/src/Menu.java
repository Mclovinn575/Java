import java.util.Scanner;

public class Menu {

    private Character currentCharacter;
    private Scanner input = new Scanner(System.in);


    public Menu()
    {
        this.currentCharacter = null;
        
        
    }

    public void mainMenu()
    {
        App.clearScreen();
        System.out.println("=== MAIN MENU ===");       
        if (this.currentCharacter == null) {
            System.out.println("\nCURRENT CHARACTER: \n");
        }else{
            System.out.println("\nCURRENT CHARACTER: "+this.currentCharacter.getName()+"\n");
        }
        System.out.println("1.) Create Character");
        System.out.println("2.) View Character Stats");
        System.out.println("3.) Delete Characters");
        System.out.println("4.) EXIT");

        // Get User Selection
        System.out.println("\nEnter Selection:");
        int userChoice = input.nextInt();

        // Navigate to user choice menu
        switch (userChoice) {
            case 1:
                createCharacter();
                break;
            case 2:
                if (this.currentCharacter == null) {
                    // If there is no current character, let user know
                    App.clearScreen();
                    System.out.println("!!! No Current Character !!!\n");
                    System.out.println("< Press ENTER to continue... >");
                    System.console().readLine();
                    mainMenu();
                }
                viewCharacterStats();
                break;
            case 3:
                if (this.currentCharacter == null) {
                    // If there is no current character, let user know
                    App.clearScreen();
                    System.out.println("!!! No Current Character !!!\n");
                    System.out.println("< Press ENTER to continue... >");
                    System.console().readLine();
                    mainMenu();
                }
                deleteCharacter();
                break;
            case 4:
                // May become a 'Continue to Game' later
                input.close();
                System.exit(0);
                break;
        
            // default:
            //     break;
        }


    }

    public void createCharacter()
    {
        // Create another scanner for CharacterName input
        // Closing handled by garbage collector
        Scanner nameInput = new Scanner(System.in);

        System.out.println("\nEnter Character Name:");
        String characterName = nameInput.nextLine();
        Character newCharacter = new Character();
        newCharacter.setName(characterName);
        this.currentCharacter = newCharacter;
        mainMenu();

    }

    public void viewCharacterStats()
    {
        App.clearScreen();
        System.out.println("=== Character Details ===\n");
        System.out.println("Name: "+this.currentCharacter.getName());
        System.out.println("< Press ENTER to continue... >");
        // This will also stop to wait for user input without a scanner (Console Applications)
        System.console().readLine();
        mainMenu();

    }

    public void deleteCharacter()
    {
        this.currentCharacter = null;
        mainMenu();
    }




}


