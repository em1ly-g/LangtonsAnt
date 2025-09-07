import javax.swing.JPanel;
import java.awt.*;

public class SimulationPanel extends JPanel {

    private int panelWidth = SimulationConfig.gridSize * SimulationConfig.numberOfColumns;
    private int panelHeight = SimulationConfig.gridSize * SimulationConfig.numberOfRows;

    private Ant ant;
    private Grid grid;

    public SimulationPanel(Ant ant, Grid grid) {
        this.setBounds(0, 0, panelWidth, panelHeight);
        this.setBackground(Colours.backgroundColor);
        this.ant = ant;
        this.grid = grid;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics graphics) {
        drawGridLines(graphics);
        drawTiles(graphics);
        drawAnt(graphics);
    }

    private void drawGridLines(Graphics graphics) {

        graphics.setColor(Colours.simulationBackground);
        graphics.fillRect(0, 0, panelWidth, panelHeight);
        graphics.setColor(Colours.gridLines);
        for (int i=0; i < SimulationConfig.numberOfColumns+1; i++){
            graphics.drawLine(i*SimulationConfig.gridSize, 0, i*SimulationConfig.gridSize, SimulationConfig.numberOfRows*SimulationConfig.gridSize);
        }

        for (int j=0; j<SimulationConfig.numberOfRows+1; j++){
            graphics.drawLine(0, j*SimulationConfig.gridSize, SimulationConfig.numberOfColumns*SimulationConfig.gridSize, j*SimulationConfig.gridSize);
        }
    }

    private void drawAnt(Graphics graphics) {
        graphics.setColor(Colours.ant);
        int[] position = ant.getPosition();
        graphics.fillRect(position[0] * SimulationConfig.gridSize, position[1] * SimulationConfig.gridSize, SimulationConfig.gridSize, SimulationConfig.gridSize);
    }

    private void drawTiles(Graphics graphics) {
        graphics.setColor(Colours.tile);
        for (int x=0; x<SimulationConfig.numberOfColumns; x++) {
            for (int y=0; y<SimulationConfig.numberOfRows; y++) {
                int tile = grid.getGridValue(new int[] {x, y});
                if (tile == 1) {
                    graphics.fillRect(x * SimulationConfig.gridSize, y * SimulationConfig.gridSize, SimulationConfig.gridSize, SimulationConfig.gridSize);
                }
            }
        }
    }

    public void update() {
        repaint();
    }

}
