import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Create world
        World myWorld = new World("My World", 0, 0);

        // Start generating
        Generator resourceGenerator = new Generator("Resource Generator", myWorld);
        resourceGenerator.start();



        
        // Create a window to track 'things'
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel resources = new JLabel(String.join("\n", "=== Resources ===", "Wood: "+myWorld.wood,"Stone: "+myWorld.stone));
        frame.getContentPane().add(resources);
        JButton house_BuildButton = new JButton("Build a House");
        house_BuildButton.addActionListener(clicked ->{
            if(myWorld.wood >= 50)
            {
                myWorld.wood -= 50;
                JOptionPane.showMessageDialog(null, "House built");
            }else{
                JOptionPane.showMessageDialog(null, "Not enough resources", null, 0);
            }
        });
        frame.getContentPane().add(house_BuildButton);
        JButton mine_BuildButton = new JButton("Build a Mine");


        frame.getContentPane().add(resources);
        frame.getContentPane().add(mine_BuildButton);
        frame.getContentPane().add(house_BuildButton);

        frame.setVisible(true);


        while (true) {
            
            resources.setText(String.join("\n", "=== Resources ===", "Wood: "+myWorld.wood,"Stone: "+myWorld.stone));
        }
        


















    }
}
