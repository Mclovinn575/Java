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

        this.population = 2;

    }

    public void buildHouse()
    {
        // Check if enough resources
        if (this.wood >= 50) {
            // Check if enough workers 
            if (this.population >= 1) {
                this.wood-= 50;
                this.population-=1;
                this.houseTotal++;
                this.population+=3;
                JOptionPane.showMessageDialog(null, "House Built!");
                
            }else{
                JOptionPane.showMessageDialog(null, "Not enough POPULATION", "Insufficient Population", 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Not enough WOOD", "Insufficient Wood", 0);
        }
    }


    public void buildLumberMill()
        {
            // Check if enough resources
            if (this.wood >= 50) {
                // Check if enough workers 
                if (this.population >= 1) {
                    this.wood-= 50;
                    this.population-=1;
                    this.lumbermillTotal++;
                    JOptionPane.showMessageDialog(null, "Lumber Mill Built!");
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Not enough POPULATION", "Insufficient Population", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Not enough WOOD", "Insufficient Wood", 0);
            }
        }

 public void buildMine()
        {
            // Check if enough resources
            if (this.wood >= 50) {
                // Check if enough workers 
                if (this.population >= 1) {
                    this.wood-= 50;
                    this.population-=1;
                    this.minesTotal++;
                    JOptionPane.showMessageDialog(null, "Mine Built!");
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Not enough POPULATION", "Insufficient Population", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Not enough WOOD", "Insufficient Wood", 0);
            }
        }
 
 public void buildFarm()
        {
            // Check if enough resources
            if (this.wood >= 50) {
                // Check if enough workers 
                if (this.population >= 1) {
                    this.wood-= 50;
                    this.population-=1;
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
