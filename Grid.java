public class Grid {

    private int[][] grid = new int[SimulationConfig.numberOfRows][SimulationConfig.numberOfColumns];
    
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
    

    public int[] getDimensions(){
        return new int[] {SimulationConfig.numberOfColumns, SimulationConfig.numberOfRows};
    }

    public int getGridValue(int[] position){
        return grid[position[1]][position[0]];
    }
}
