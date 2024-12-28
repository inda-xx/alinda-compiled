public class MatrixCopyExample {

    /**
     * Performs a deep copy of a given matrix. A deep copy ensures that the original matrix and the copied
     * matrix are entirely separate objects. Changes to one do not affect the other.
     *
     * @param original the original matrix to be copied
     * @return a new matrix that is a deep copy of the original
     */
    public int[][] deepCopyMatrix(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }
        return copy;
    }

    /**
     * Performs a shallow copy of a given matrix. A shallow copy means that the new matrix
     * references the same rows as the original. Changes to elements in one will affect the other.
     *
     * @param original the original matrix to be copied
     * @return a new matrix that is a shallow copy of the original
     */
    public int[][] shallowCopyMatrix(int[][] original) {
        int[][] copy = new int[original.length][];
        System.arraycopy(original, 0, copy, 0, original.length);
        return copy;
    }

    public static void main(String[] args) {
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        MatrixCopyExample example = new MatrixCopyExample();

        // Demonstrate deep copy
        int[][] deepCopiedMatrix = example.deepCopyMatrix(originalMatrix);
        deepCopiedMatrix[0][0] = 99; // Modify the deep-copied matrix
        System.out.println("Original Matrix after deep copy modification:");
        for (int[] row : originalMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // Demonstrate shallow copy
        int[][] shallowCopiedMatrix = example.shallowCopyMatrix(originalMatrix);
        shallowCopiedMatrix[0][0] = 99; // Modify the shallow-copied matrix
        System.out.println("Original Matrix after shallow copy modification:");
        for (int[] row : originalMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}