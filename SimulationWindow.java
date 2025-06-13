import java.awt.*;
import javax.swing.*;

public class SimulationWindow {

    private int frameWidth = 900;
    private int frameHeight = 600;

    private int gridSize = 15;

    private JFrame frame;


    public void initFrame(){
        
        frame = new JFrame("Langton's Ant Simulation");
        frame.setSize(frameWidth, frameHeight);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Grid());
        frame.setVisible(true);

    }

}
