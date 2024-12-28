public class Matrix {
    // Fields to store the matrix data
    private double[][] data;
    private int rows;
    private int cols;

    // Constructor that initializes the matrix with given data
    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(data[i], 0, this.data[i], 0, cols);
        }
    }

    // Method to multiply this matrix by another matrix
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Inner matrix dimensions must agree for multiplication.");
        }
        double[][] result = new double[this.rows][other.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    // Method to add this matrix to another matrix
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }
        double[][] result = new double[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    // Method to scale the matrix by a scalar value
    public Matrix scale(double scalar) {
        double[][] result = new double[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result[i][j] = this.data[i][j] * scalar;
            }
        }
        return new Matrix(result);
    }

    // Static method to create a Matrix object from a file
    public static Matrix fromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String[] dimensions = reader.readLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        double[][] data = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] rowData = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                data[i][j] = Double.parseDouble(rowData[j]);
            }
        }
        reader.close();
        return new Matrix(data);
    }

    // Method to print the matrix to the console
    public void print() {
        for (double[] row : data) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}