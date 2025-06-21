import java.util.Arrays;

public class Ant {
    private int[] position = new int[2];

    private int[] direction = new int[] {0, 1};
    private final int[][] turnClockwise = new int[][]{{0, 1},{-1, 0}};
    private final int[][] turnAnticlockwise = new int[][]{{0, -1},{1, 0}};

    Ant(int initialXPosition, int initialYPosition){
        this.position[0] = initialXPosition;
        this.position[1] = initialYPosition;
    }

    public void move(){

        // TODO: handle the boundary
        this.position[0] = this.position[0] + this.direction[0];
        this.position[1] = this.position[1] + this.direction[1];
    }

    private int[] vectorMatrixMultiplication(int[] vector, int[][] matrix){
        int[] result = new int[2];

        result[0] = matrix[0][0] * vector[0] + matrix[0][1] * vector[1];
        result[1] = matrix[1][0] * vector[0] + matrix[1][1] * vector[1];

        return result;
    }

    public void changeDirection(int locationValue){
        if (locationValue == 1){
            turnAnticlockwise();
        } else {
            turnClockwise();
        }
    }

    public void turnClockwise(){
        this.direction = vectorMatrixMultiplication(direction, turnClockwise);
    }

    public void turnAnticlockwise(){
        this.direction = vectorMatrixMultiplication(direction, turnAnticlockwise);
    }

    public void printDirection(){
        System.out.println(Arrays.toString(direction));
    }

    public int[] getPosition(){
        return this.position;
    }
     
}
