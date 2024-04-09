import java.util.ArrayList;

public class Inventory {

    private String inventoryName;
    private ArrayList<Item> inventoryStock = new ArrayList<>();


    public Inventory(String nameString)
    {
        // Name new inventory
        this.inventoryName = nameString;
        // Initializes new inventory
    }

    public void getItems()
    {
        System.out.println(this.inventoryName+" contains: ");
        for (Item item : inventoryStock) {

            System.out.println(item.getItemName()+" : "+item.getItemPrice());
            
        }
    }

    

    public void addItem(Item item)
    {
        this.inventoryStock.add(item);
    }

    public void removeItem(Item item)
    {
        this.inventoryStock.remove(item);
    }

    public void getInventoryName()
    {
        System.out.println(this.inventoryName);
    }

    public double checkOut()
    {
        double total = 0.00;
        for (Item item : inventoryStock) {

            total = total + item.getItemPrice();
        }
        return total;



    }
    

}
