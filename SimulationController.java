public class SimulationController {

    private boolean runSimulation = false;

    private Ant ant;
    private Grid grid;
    private SimulationPanel simulationPanel;
    private SimulationWindow window;

    public void initSimulationController(){
        this.grid = new Grid();
        this.ant = new Ant((int) (SimulationConfig.numberOfColumns/2), (int) (SimulationConfig.numberOfRows/2));
        this.simulationPanel = new SimulationPanel(ant);
        this.window = new SimulationWindow();
        window.setPanel(simulationPanel);
        window.initFrame();
    }

     public void simulationStep(){
        ant.move();
        int[] antPosition = ant.getPosition();
        grid.changeSquareColour(antPosition[0], antPosition[1]);
        ant.changeDirection(grid.getGridValue(antPosition));
        // grid.printGrid();
     }

    public void run() throws InterruptedException {

        initSimulationController();
        runSimulation = true;
        while (runSimulation){
            simulationStep();
            simulationPanel.update();
            Thread.sleep(1000);
        }

    }
}
