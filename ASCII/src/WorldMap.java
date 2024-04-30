import java.util.Random;

public class WorldMap {

    // This will generate a random room based on x and y inputs
    // It will then create random walls (#) as obstacles for the player
    // This could work for a (WASD) type of game
    private char[][] map;

    public WorldMap(int maxX, int maxY) {
        map = new char[maxY][maxX];
        generateMap();
    }

    private void generateMap() {
        Random random = new Random();

        // Fill the map with empty spaces
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                // '.' represents empty floor
                map[y][x] = '.';
            }
        }

        // Place walls randomly
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (random.nextDouble() < 0.1) { // Adjust this probability as needed
                    map[y][x] = '#'; // '#' represents a wall
                }
            }
        }

        // Place the player's starting position
        map[0][0] = '@'; // '@' represents the player's starting position
    }

    public void printMap() {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                System.out.print(map[y][x]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maxX = 10; // Maximum x size of the map
        int maxY = 10; // Maximum y size of the map

        WorldMap worldMap = new WorldMap(maxX, maxY);
        worldMap.printMap();
    }
}