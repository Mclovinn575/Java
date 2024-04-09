
public class App { 

       



    public static void main(String[] args) throws Exception {




        // Main code here

        Inventory mainStock = new Inventory("Main Stock");


        mainStock.addItem(Item.pants);
        mainStock.addItem(Item.shoes);
        mainStock.addItem(Item.shirt);
        mainStock.addItem(Item.pants);

        // Test out to make sure each inventory keeps its own objects
        Inventory secondInventory = new Inventory("Secondary Inventory");
        secondInventory.addItem(Item.shoes);




        mainStock.getItems();
        secondInventory.getItems();

        System.out.println("\nThe total of Main Stock is: "+mainStock.checkOut());
        System.out.println("\nThe total of Secondary Stock is: "+secondInventory.checkOut());











    }
}
