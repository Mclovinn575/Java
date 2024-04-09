
public class App {



  
    public static void main(String[] args) throws Exception {

        Player playerCharacter = new Player("Player");
        Player computerCharacter = new Player("Computer");


        // Computer chooses a random number between 1 and 10
        int cc = computerCharacter.ComputerChoice();

        // Player Enters their choice
        int pc = playerCharacter.PlayerChoice();

        // Logic to compare choices and determine winner

        while (cc != pc) {

            System.out.println("\nIncorrect guess...");
            pc = playerCharacter.PlayerChoice();
            
        }

        // Once guess is correct
        System.out.println("\nYou win!!");




    }

    

}
