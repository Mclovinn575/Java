import java.util.Scanner;

public class App { 




    public static void main(String[] args) throws Exception {
    

        Scanner input = new Scanner(System.in);
        Inventory userBasket = new Inventory("User Cart");
        // Initalize Master (Reference) List of all available items 
       Inventory masterList = new Inventory("Master List");
       masterList.InitializeMasterList();

        // List out items and prices to user
        System.out.println("=== Available Items ===");
        for (int i = 0; i < masterList.inventoryStock.size(); i++) {
            System.out.println(i+".) "+masterList.inventoryStock.get(i).getItemName()+"|| "+masterList.inventoryStock.get(i).getItemPrice());
        }
        System.out.println("\nChoose a number to add to cart: ");
        int userChoice = input.nextInt();


        

    }
}
