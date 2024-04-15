import java.util.Scanner;

public class App { 




    public static void main(String[] args) throws Exception {
    

        Scanner input = new Scanner(System.in);
        Inventory userBasket = new Inventory("User Cart");
        // Initalize Master (Reference) List of all available items 
       Inventory masterList = new Inventory("Master List");
       masterList.InitializeMasterList();


              int userChoice;

        do {

            // Clean up screen each update.
            ClearScreen();
            
            // Display Available items that user can buy
            masterList.ShowAvailableItems();

            // Display current number of items in cart, updates with each addition
            System.out.println("\nCurrent # Items : "+ userBasket.inventoryStock.size());
            // Display Total for user per addition
            System.out.println("Pre-Tax Total : "+userBasket.TotalAmt());

            // Allow user to choose item
            System.out.println("\nChoose a number to add to cart: ");
            System.out.println("== Press '99' to checkout ==\n");
            userChoice = input.nextInt();
            switch (userChoice) {
            case 0:
                userBasket.addItem(masterList.inventoryStock.get(userChoice));
                System.out.println("\n=== "+masterList.inventoryStock.get(userChoice).getItemName()+" added to cart. ===\n");
                break;

            case 1:
                userBasket.addItem(masterList.inventoryStock.get(userChoice));
                System.out.println(masterList.inventoryStock.get(userChoice).getItemName()+" added to cart.");
                break;

            case 2:
                userBasket.addItem(masterList.inventoryStock.get(userChoice));
                System.out.println(masterList.inventoryStock.get(userChoice).getItemName()+" added to cart.");
                break;

            default:
                break;

        }
        } while (userChoice != 99);
      

        // Finalize user basket
        ClearScreen();
        userBasket.checkOut();

        


 
        // Close out input
        input.close();

    }




    public static void ClearScreen()
    {
        System.out.print("\033\143");
    }
}
