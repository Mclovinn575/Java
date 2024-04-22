public class World {

    // Define worldname
    public String name;
    
    // Define resources
    public int wood;
    public int stone;

    // Test define building number
    int totalBuildings;

    int population;

    public World(String worldName, int wood, int stone)
    {
        this.name = worldName;

        this.wood = wood;
        this.stone = stone;

        this.totalBuildings = 0;

        this.population = 1;

    }








}
