public class WorldPlane {

    private char[][] worldGrid;
    private char playerChar = '@';
    private char mapTile = 'X';

    private int playerX; // Players X coordinate
    private int playerY; // Players Y coordinate

    public WorldPlane(int xDimension, int yDimension)
    {
        this.worldGrid = new char[xDimension][yDimension];
        initializeMap();

        // Place Character at center
        playerX = xDimension /2;
        playerY = yDimension /2;
        updatePlayerPosition();
        




    }

    public void initializeMap()
    {
        for (int i = 0; i < worldGrid.length; i++) {
            for (int j = 0; j < worldGrid[i].length; j++) {
                worldGrid[i][j] = mapTile;
            }

        }
    }

    public void displayMap()
    {
        for (int i = 0; i < worldGrid.length; i++) {
                for (int j = 0; j < worldGrid[i].length; j++) {
                    System.out.print(worldGrid[i][j]);
                }
                System.out.println();
        }

    }

    public void movePlayer(char direction)
    {
        int pre_playerX = playerX;
        int pre_playerY = playerY;
        // Move player based on input direction (WASD)
        switch (direction) {
            // Move Up
            case 'w':
                if (playerX > 0) {
                    playerX--;  
                }
                break;
            // Move Left
            case 'a':
                if (playerY > 0) {
                    playerY--;  
                }
                break;
            // Move Down
            case 's':
                if(playerX< worldGrid.length -1){
                    playerX++;
                }
            break;
            // Move Right
            case 'd':
                if(playerY< worldGrid.length -1){
                    playerY++;
                }
            break;
        }

        // Update Player Position after moving

        worldGrid[pre_playerX][pre_playerY] = mapTile;
        updatePlayerPosition();

    }

    public void updatePlayerPosition()
    {
        
        // Update player position with the @ symbol
        worldGrid[playerX][playerY] = playerChar;
    }



}
