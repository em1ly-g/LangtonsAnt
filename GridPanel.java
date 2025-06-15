import javax.swing.JPanel;
import java.awt.*;

public class GridPanel extends JPanel{
    private int gridSize = 20;

    private int numberOfColumns = 30;
    private int numberOfRows = 20;

    private int panelWidth = gridSize * numberOfColumns;
    private int panelHeight = gridSize * numberOfRows;

    public GridPanel(){
        this.setBounds(0, 0, panelWidth, panelHeight);
        this.setBackground(Color.LIGHT_GRAY);
    }
    

    @Override
    protected void paintComponent(Graphics graphcis){
        super.paintComponent(graphcis);
        for (int i=0; i < numberOfColumns+1; i++){
            graphcis.drawLine(i*gridSize, 0, i*gridSize, numberOfRows*gridSize);
        }

        for (int j=0; j<numberOfRows+1; j++){
            graphcis.drawLine(0, j*gridSize, numberOfColumns*gridSize, j*gridSize);
        }
    }
}
