public class MultipliableMatrix extends Matrix {

    public MultipliableMatrix(int[][] data) {
        super(data);
    }

    /**
     * Multiplies this matrix with another matrix.
     * The number of columns in this matrix must be equal to the number of rows in the other matrix.
     *
     * @param other the matrix to multiply by
     * @return the resulting matrix after multiplication
     */
    public MultipliableMatrix multiply(MultipliableMatrix other) {
        if (data[0].length != other.data.length) {
            throw new IllegalArgumentException("Matrices dimensions do not match for multiplication.");
        }

        int[][] result = new int[data.length][other.data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < data[0].length; k++) {
                    result[i][j] += data[i][k] * other.data[k][j];
                }
            }
        }
        return new MultipliableMatrix(result);
    }

    public static void main(String[] args) {
        int[][] data1 = {
            {1, 2},
            {3, 4}
        };
        int[][] data2 = {
            {5, 6},
            {7, 8}
        };

        MultipliableMatrix matrix1 = new MultipliableMatrix(data1);
        MultipliableMatrix matrix2 = new MultipliableMatrix(data2);

        MultipliableMatrix result = matrix1.multiply(matrix2);
        result.display();
    }
}