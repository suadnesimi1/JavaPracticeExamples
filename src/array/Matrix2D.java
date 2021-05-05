package array;

public class Matrix2D {
    public static void main(String[] args) {
        int rows = 4; //declaring variable with assign value;
        int columns = 4;//declaring variable with assign value;

        // declaring matrices as multi-D arrays
        int[][] MatrixA={{1,2,3,4},{5,6,7,8},{4,3,4,1},{9,0,1,7}};
        int[][] MatrixB={{5,6,7,8},{4,3,2,1},{8,5,3,8},{1,9,0,2}};

       // declaring the matrix sum,that will be the sum of MatrixA
        //and the MatrixB,the sum matrix will have the same rows and columns
        // as the given matrices
        int[][] sum = new int[rows][columns];
        for (int i =0;i<rows;i++){
            for (int j = 0;j<columns;j++){
                sum[i][j]= MatrixA[i][j] + MatrixB[i][j];
            }
        }
        //displaying the matrices
        System.out.println("Sum of the given matrices is: ");
        for (int i = 0;i<rows;i++){
            for (int j =0;j<columns;j++){
                System.out.print(sum[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
