

public class Item {

    private String itemName;
    private String itemDescription;
    private double itemPrice;

    public Item(String itemName, String itemDescription, double itemPrice)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        
    }

    // Getters and Setters
    public String getItemName()
    {
        return this.itemName;
    }

    public double getItemPrice()
    {
        return this.itemPrice;
    }

    public String getItemDescription()
    {
        return this.itemDescription;
    }



   

    // Create Items to use
   static Item shirt = new Item("Shirt", "A piece of clothing worn to protect the upper torso. Said to come in various fashions.", 5.99);
   static Item pants = new Item("Pants", "A piece of clothing worn to protect the lower extremeties. Comes in a variety of materials.", 10.99);
   static Item shoes = new Item("Shoes", "Worn on the feet, this type of clothing provides protection to a persons feet and soles.", 8.99);


    
    


    



   


}
