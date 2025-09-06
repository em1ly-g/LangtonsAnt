public class SimulationController {

    private Ant ant;
    private GridPanel grid;

    public void initSimulationController(){
        this.grid = new GridPanel();
        int[] dimensions = grid.getDimensions();
        this.ant = new Ant(dimensions[0]/2, dimensions[1]/2);
    }

     public void simulationStep(){
        ant.move();
        int[] antPosition = ant.getPosition();
        grid.changeSquareColour(antPosition[0], antPosition[1]);
        ant.changeDirection(grid.getGridValue(antPosition));
        // grid.printGrid();
     }



    public static void main(String[] args){
        SimulationWindow window = new SimulationWindow();
        window.initFrame();

        // Ant ant = new Ant();
        // ant.printDirection();
        // ant.turnClockwise();
        // ant.printDirection();
        // ant.turnClockwise();
        // ant.printDirection();
        // ant.turnClockwise();
        // ant.printDirection();

        // GridPanel grid = new GridPanel();

        // grid.printgridLocation(0,0);
        // grid.printgridLocation(1,0);
        // grid.changeSquareColour(1, 0);
        // grid.printgridLocation(1, 0);
        // grid.printGrid();

        SimulationController controller = new SimulationController();

        controller.initSimulationController();

        for (int i=1; i<10; i++){
            controller.simulationStep();
        }

    }
}
