public class Matrix {
    protected int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    /**
     * Adds this matrix to another matrix.
     * Assumes both matrices have the same dimensions.
     *
     * @param other the matrix to be added
     * @return the resulting matrix after addition
     */
    public Matrix add(Matrix other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices dimensions do not match for addition.");
        }

        int[][] result = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    /**
     * Displays the matrix.
     */
    public void display() {
        for (int[] row : data) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}