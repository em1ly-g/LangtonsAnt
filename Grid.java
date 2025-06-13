import javax.swing.JPanel;
import java.awt.*;

public class Grid extends JPanel{
    private int gridSize = 15;

    private int frameWidth = 900;
    private int frameHeight = 600;
    
    @Override
    protected void paintComponent(Graphics graphcis){
        graphcis.setColor(Color.darkGray);

        for (int i=0; i < frameWidth; i = i + gridSize){
            graphcis.drawLine(i, 0, i, frameHeight);
        }

        for (int j=0; j<frameHeight; j=j+gridSize){
            graphcis.drawLine(0, j, frameWidth, j);
        }
    }
}
