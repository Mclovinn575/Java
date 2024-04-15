import java.util.ArrayList;

public class Inventory {

    private String inventoryName;
    public double salesTax = 0.07;
    ArrayList<Item> inventoryStock = new ArrayList<>();


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

    public void checkOut()
    {
        double itemPrice;
        double itemTax;
        double total = 0.00;


        for (Item item : inventoryStock) {

            itemPrice = item.getItemPrice();
            itemTax = itemPrice * salesTax;
            double itemTotal = itemPrice + itemTax;
            total += itemTotal;
             

        }

        // System.out.println(total);
        // This expression will truncate the total to the '.00' digit.
        total = Math.floor(total * 100) / 100;

        System.out.println("== Current Tax Rate : "+salesTax+" ===\n");
        System.out.println("Cart Total : "+total);

    }

    public double TotalAmt()
        {
            double total = 0.00;
            for (Item item : inventoryStock) {

                total = total + item.getItemPrice();
            }

            return total;

        }

    public int ItemCount()
    {
        return this.inventoryStock.size();
    }

    public void InitializeMasterList()
    {
        // Initializes the ArrayList as the master list (reference list for available items)
        this.inventoryName = "Master List";
        this.inventoryStock.add(Item.shirt);
        this.inventoryStock.add(Item.pants);
        this.inventoryStock.add(Item.shoes);

    }

    public void ShowAvailableItems()
    {
        // List out items and prices to user
            System.out.println("=== Available Items ===");
            for (int i = 0; i < this.inventoryStock.size(); i++) {
                System.out.println(i+".) "+this.inventoryStock.get(i).getItemName()+"|| "+this.inventoryStock.get(i).getItemPrice());
            }
            System.out.println("==============================");
    }
    

}
