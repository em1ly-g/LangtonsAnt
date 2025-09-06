import javax.swing.*;

public class SimulationWindow extends JFrame{

    private int frameWidth = 900;
    private int frameHeight = 600;

    public void initFrame(){
        this.setTitle("Langton's Ant Simulation");
        this.setSize(frameWidth, frameHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        // this.setLayout(null);
        // this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void setPanel(SimulationPanel panel){
        this.add(panel);
    }

}
