import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Create world
        World myWorld = new World("My World", 300, 500, 0);

        // Start generating
        Generator resourceGenerator = new Generator("Resource Generator", myWorld);
        resourceGenerator.start();



        
        // Create a window to track 'things'
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        // frame.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(3,4));
        // Close out program when you hit the 'x'
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set it to the dark side 
        frame.getContentPane().setBackground(Color.black);




        // ====================================================================================================================================


        // ___BUTTONS___

        // Housing 
        JButton house_BuildButton = new JButton("<html>Build a House <br><br> [75 Wood][75 Food] <br> [1 Population]");
        house_BuildButton.addActionListener(clicked ->{
            myWorld.buildHouse();
        });
        house_BuildButton.setBackground(Color.black);
        house_BuildButton.setForeground(Color.white);
        
        // Lumber Mill
        JButton lumberMill_BuildButton = new JButton("<html>Build a Lumber Mill <br><br> [150 Wood][200 Food] <br>[2 Population] </html>");
        lumberMill_BuildButton.addActionListener(clicked ->{
            myWorld.buildLumberMill();
        });
        lumberMill_BuildButton.setBackground(Color.black);
        lumberMill_BuildButton.setForeground(Color.white);

        // Mines
        JButton mines_BuildButton = new JButton("<html> Build a Mine <br><br> [300 Wood][300 Food] <br>[3 Population] </html>");
        mines_BuildButton.addActionListener(clicked ->{
            myWorld.buildMine();
        });
        mines_BuildButton.setBackground(Color.black);
        mines_BuildButton.setForeground(Color.white);

        // Farms
        JButton farms_BuildButton = new JButton("<html> Build a Farm <br><br> [125 Wood] <br>[2 Population] </html>");
        farms_BuildButton.addActionListener(clicked ->{
            myWorld.buildFarm();
        });
        farms_BuildButton.setBackground(Color.black);
        farms_BuildButton.setForeground(Color.white);


        // ====================================================================================================================================


        // ___LABELS___

        // RESOURCE TOTALS
        JLabel populationGUI = new JLabel("Population: "+myWorld.population);
        populationGUI.setForeground(Color.white);
        frame.getContentPane().add(populationGUI);

        JLabel foodGUI = new JLabel("Food: "+myWorld.food);
        foodGUI.setForeground(Color.white);
        frame.getContentPane().add(foodGUI);

        JLabel woodGUI = new JLabel("Wood: "+myWorld.wood);
        woodGUI.setForeground(Color.white);
        frame.getContentPane().add(woodGUI);

        JLabel stoneGUI = new JLabel("Stone: "+myWorld.stone);
        stoneGUI.setForeground(Color.white);
        frame.getContentPane().add(stoneGUI);


        // BUILDING TOTALS
        JLabel housesTotal = new JLabel("Houses: "+myWorld.houseTotal);
        housesTotal.setForeground(Color.white);
        frame.getContentPane().add(housesTotal);

        JLabel farmsTotal = new JLabel("Farms: "+myWorld.farmTotal);
        farmsTotal.setForeground(Color.white);
        frame.getContentPane().add(farmsTotal);

        JLabel lumbermillTotal = new JLabel("Lumber Mills: "+myWorld.lumbermillTotal);
        lumbermillTotal.setForeground(Color.white);
        frame.getContentPane().add(lumbermillTotal);

        JLabel minesTotal = new JLabel("Mines: "+myWorld.minesTotal);
        minesTotal.setForeground(Color.white);
        frame.getContentPane().add(minesTotal);


        // ___ACTION BUTTONS___
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
