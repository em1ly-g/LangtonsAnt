public class SimulationController {

    public static void main(String[] args){
        // SimulationWindow window = new SimulationWindow();
        // window.initFrame();

        // Ant ant = new Ant();
        // ant.printDirection();
        // ant.turnClockwise();
        // ant.printDirection();
        // ant.turnClockwise();
        // ant.printDirection();
        // ant.turnClockwise();
        // ant.printDirection();

        GridPanel grid = new GridPanel();

        grid.printgridLocation(0,0);
        grid.printgridLocation(1,0);
        grid.changeSquareColour(1, 0);
        grid.printgridLocation(1, 0);
        grid.printGrid();


    }
}
