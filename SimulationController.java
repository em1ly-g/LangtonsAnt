public class SimulationController {

    private Ant ant;
    // private GridPanel grid;
    private SimulationPanel simulationPanel;

    // public void initSimulationController(){
    //     this.grid = new GridPanel();
    //     int[] dimensions = grid.getDimensions();
    //     this.ant = new Ant(dimensions[0]/2, dimensions[1]/2);
    //     this.simulationPanel = new SimulationPanel();
    // }

    //  public void simulationStep(){
    //     ant.move();
    //     int[] antPosition = ant.getPosition();
    //     grid.changeSquareColour(antPosition[0], antPosition[1]);
    //     ant.changeDirection(grid.getGridValue(antPosition));
    //     // grid.printGrid();
    //  }



    public static void main(String[] args){

        Ant ant = new Ant((int) (SimulationConfig.numberOfColumns/2), (int) (SimulationConfig.numberOfRows/2));

        SimulationWindow window = new SimulationWindow();
        
        SimulationPanel simulationPanel = new SimulationPanel(ant);

        window.setPanel(simulationPanel);
        window.initFrame();

        SimulationController controller = new SimulationController();

        // controller.initSimulationController();

        // for (int i=1; i<10; i++){
        //     controller.simulationStep();
        // }

    }
}
