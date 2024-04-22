import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Create world
        World myWorld = new World("My World", 100, 100, 100);

        // Start generating
        Generator resourceGenerator = new Generator("Resource Generator", myWorld);
        resourceGenerator.start();



        
        // Create a window to track 'things'
        JFrame frame = new JFrame();
        // frame.pack();
        // frame.setLocationRelativeTo(null);
        frame.setSize(600,400);
        // frame.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(3,4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        // ====================================================================================================================================
        // ___BUTTONS___

        // Housing 
        JButton house_BuildButton = new JButton("<html>Build a House <br><br> (50 Wood) <br> (1 Population)");
        house_BuildButton.addActionListener(clicked ->{
            myWorld.buildHouse();
        });
        frame.getContentPane().add(house_BuildButton);
        
        // Lumber Mill
        JButton lumberMill_BuildButton = new JButton("<html>Build a Lumber Mill <br><br> (50 Wood) <br>(1 Population) </html>");
        lumberMill_BuildButton.addActionListener(clicked ->{
            myWorld.buildLumberMill();
        });

        // Mines
        JButton mines_BuildButton = new JButton("<html> Build a Mine <br><br> (50 Wood) <br>(1 Population) </html>");
        mines_BuildButton.addActionListener(clicked ->{
            myWorld.buildMine();
        });

        // Farms
        JButton farms_BuildButton = new JButton("<html> Build a Farm <br><br> (50 Wood) <br>(1 Population) </html>");
        farms_BuildButton.addActionListener(clicked ->{
            myWorld.buildFarm();
        });



        // ====================================================================================================================================
        // ___LABELS___

        // JLabel resources = new JLabel(String.join("\n", "Population: "+myWorld.population ,"=== Resources ===", "Wood: "+myWorld.wood,"Stone: "+myWorld.stone));
        // frame.getContentPane().add(resources);

        // RESOURCE TOTALS
        JLabel populationGUI = new JLabel("Population: "+myWorld.population);
        frame.getContentPane().add(populationGUI);

        JLabel foodGUI = new JLabel("Food: "+myWorld.food);
        frame.getContentPane().add(foodGUI);

        JLabel woodGUI = new JLabel("Population: "+myWorld.population);
        frame.getContentPane().add(woodGUI);

        JLabel stoneGUI = new JLabel("Stone: "+myWorld.stone);
        frame.getContentPane().add(stoneGUI);


        // BUILDING TOTALS
        JLabel housesTotal = new JLabel("Houses: "+myWorld.houseTotal);
        frame.getContentPane().add(housesTotal);

        JLabel farmsTotal = new JLabel("Farms: "+myWorld.farmTotal);
        frame.getContentPane().add(farmsTotal);

        JLabel lumbermillTotal = new JLabel("Lumber Mills: "+myWorld.lumbermillTotal);
        frame.getContentPane().add(lumbermillTotal);

        JLabel minesTotal = new JLabel("Mines: "+myWorld.minesTotal);
        frame.getContentPane().add(minesTotal);


        // BUTTONS
        frame.getContentPane().add(house_BuildButton);
        frame.getContentPane().add(lumberMill_BuildButton);
        frame.getContentPane().add(mines_BuildButton);
        frame.getContentPane().add(farms_BuildButton);
        


        frame.setVisible(true);

        DisplayStats(myWorld, populationGUI, foodGUI, woodGUI, stoneGUI, housesTotal, farmsTotal, lumbermillTotal, minesTotal);

    
    



    }
    




    // ====================================================================================================================================
    public static void ClearScreen()    {
        System.out.print("\033\143");
    }

    public static void DisplayStats(World world, JLabel population, JLabel food, JLabel wood, JLabel stone, JLabel houses, JLabel farms, JLabel lumberMills, JLabel mines )
    {

        // Constantly updating screen with new information
        while (true) {
            population.setText("Population: "+world.population);
            food.setText("Food: "+world.food);
            wood.setText("Wood: "+world.wood);
            stone.setText("Stone: "+world.stone);
            
            houses.setText("Houses: "+world.houseTotal);
            farms.setText("Farms: "+world.farmTotal);
            lumberMills.setText("Lumber Mills: "+world.lumbermillTotal);
            mines.setText("Mines: "+world.minesTotal);



        }
    }
}
