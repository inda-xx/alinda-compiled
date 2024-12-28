import java.util.Set;

public class TernaryOperatorExample {

    /**
     * Demonstrates the usage of the ternary operator.
     * The ternary operator in Java is a shorthand for the if-else statement and is written as:
     * condition ? valueIfTrue : valueIfFalse
     *
     * In the context of matrix operations, the ternary operator can be used to set values of a matrix
     * based on a condition. For example, if a certain condition is true, set the element to a specific value,
     * otherwise set it to a different value.
     */
    public void demonstrateTernaryOperator() {
        int[][] matrix = new int[3][3];

        // Setting matrix elements based on a condition using the ternary operator
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) % 2 == 0 ? 1 : -1; // Sets to 1 if sum of indices is even, else -1
            }
        }

        // Display the matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        TernaryOperatorExample example = new TernaryOperatorExample();
        example.demonstrateTernaryOperator();
    }
}