import javax.swing.JOptionPane;

public class World {

    // Define worldname
    public String name;
    
    // Define resources
    public int food;
    public int farmTotal;

    public int wood;
    public int lumbermillTotal;

    public int stone;
    public int minesTotal;

    // Test define building number
    int totalBuildings = minesTotal+lumbermillTotal+farmTotal;

    // Population to assign to buildings
    public int houseTotal;
    public int population;

    public World(String worldName, int food, int wood, int stone)
    {
        this.name = worldName;

        this.wood = wood;
        this.stone = stone;
        this.food = food;

        this.totalBuildings = 0;

        this.population = 5;

    }


// ===============================================

// __METHODS__


    public void buildHouse()
    {
        if(this.food >= 50){
            // Check if enough resources
            if (this.wood >= 75) {
                // Check if enough workers 
                if (this.population >= 1) {
                    this.wood-= 75;
                    this.population-=1;
                    this.food-=50;
                    this.houseTotal++;
                    this.population+=3;
                    JOptionPane.showMessageDialog(null, "House Built!");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Not enough POPULATION", "Insufficient Population", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Not enough WOOD", "Insufficient Wood", 0);
            }
        }else{
                JOptionPane.showMessageDialog(null, "Not enough FOOD", "Insufficient Food", 0);
        }
    }

    public void buildLumberMill()
    {
        if(this.food >= 200){
            // Check if enough resources
            if (this.wood >= 150) {
                // Check if enough workers 
                if (this.population >= 2) {
                    this.wood-= 150;
                    this.food-=200;
                    this.population-=2;
                    this.lumbermillTotal++;
                    JOptionPane.showMessageDialog(null, "Lumber Mill Built!");
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Not enough POPULATION", "Insufficient Population", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Not enough WOOD", "Insufficient Wood", 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Not enough FOOD", "Insufficient Food", 0);
        }
    }

    public void buildMine()
        {
            // Check if enough resources
            if (this.wood >= 300)  {
                if(this.food >= 300){
                    // Check if enough workers 
                    if (this.population >= 3) {
                        this.wood-= 300;
                        this.food-=300;
                        this.population-=3;
                        this.minesTotal++;
                        JOptionPane.showMessageDialog(null, "Mine Built!");
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Not enough POPULATION", "Insufficient Population", 0);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Not enough FOOD", "Insufficient Food", 0);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Not enough WOOD", "Insufficient Wood", 0);

        }
    }
 
    public void buildFarm()
        {
            // Check if enough resources
            if (this.wood >= 125) {
                // Check if enough workers 
                if (this.population >= 2) {
                    this.wood-= 125;
                    this.population-=2;
                    this.farmTotal++;
                    JOptionPane.showMessageDialog(null, "Farm Built!");
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Not enough POPULATION", "Insufficient Population", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Not enough WOOD", "Insufficient Wood", 0);
            }
        }       






}
