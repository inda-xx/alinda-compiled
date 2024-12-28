public class MatrixAdditionExample {

    /**
     * Adds two matrices of the same size.
     *
     * @param matrixA the first matrix
     * @param matrixB the second matrix
     * @return the resulting matrix after addition, or null if the dimensions do not match
     */
    public int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices dimensions do not match!");
            return null;
        }

        int[][] result = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MatrixAdditionExample example = new MatrixAdditionExample();
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] result = example.addMatrices(matrixA, matrixB);
        if (result != null) {
            for (int[] row : result) {
                System.out.println(java.util.Arrays.toString(row));
            }
        }
    }
}