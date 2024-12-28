public class MatrixCalculator {
    public static void main(String[] args) {
        try {
            // Load matrices from files
            Matrix matrixA = Matrix.fromFile("matrixA.txt");
            Matrix matrixB = Matrix.fromFile("matrixB.txt");

            // Perform matrix multiplication
            Matrix result = matrixA.multiply(matrixB);

            // Print the result
            System.out.println("Result of multiplication:");
            result.print();
        } catch (IOException e) {
            System.err.println("Error reading matrix files: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Matrix operation error: " + e.getMessage());
        }
    }
}