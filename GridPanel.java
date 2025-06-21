import javax.swing.JPanel;
import java.awt.*;


public class GridPanel extends JPanel{
    private int gridSize = 20;

    private int numberOfColumns = 10;
    private int numberOfRows = 10;

    private int panelWidth = gridSize * numberOfColumns;
    private int panelHeight = gridSize * numberOfRows;

    private int[][] grid = new int[numberOfRows][numberOfColumns];
    
    public void printgridLocation(int x, int y){
        System.out.println(grid[y][x]);
    }

    public void changeSquareColour(int x, int y){
        grid[y][x] ^= 1;
    }

    public void printGrid(){
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println("\n");
        }
    }
    
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

    public int[] getDimensions(){
        return new int[] {numberOfColumns, numberOfRows};
    }

    public int getGridValue(int[] position){
        return grid[position[1]][position[0]];
    }
}
