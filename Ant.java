import java.util.Arrays;

public class Ant {
    // private int xPos;
    // private int yPos;

    private int[] direction = new int[] {0, 1};
    private final int[][] turnClockwise = new int[][]{{0, 1},{-1, 0}};
    private final int[][] turnAnticlockwise = new int[][]{{0, -1},{1, 0}};

    private int[] vectorMatrixMultiplication(int[] vector, int[][] matrix){
        int[] result = new int[2];

        result[0] = matrix[0][0] * vector[0] + matrix[0][1] * vector[1];
        result[1] = matrix[1][0] * vector[0] + matrix[1][1] * vector[1];

        return result;
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
     
}
