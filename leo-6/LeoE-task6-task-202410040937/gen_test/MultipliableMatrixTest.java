package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultipliableMatrixTest {

    @Test
    public void testMultiplyValidMatrices() {
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};

        MultipliableMatrix matrix1 = new MultipliableMatrix(data1);
        MultipliableMatrix matrix2 = new MultipliableMatrix(data2);

        MultipliableMatrix result = matrix1.multiply(matrix2);
        int[][] expected = {{19, 22}, {43, 50}};
        
        assertArrayEquals(expected, result.data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyInvalidMatrices() {
        int[][] data1 = {{1, 2, 3}};
        int[][] data2 = {{4, 5}, {6, 7}};

        MultipliableMatrix matrix1 = new MultipliableMatrix(data1);
        MultipliableMatrix matrix2 = new MultipliableMatrix(data2);

        matrix1.multiply(matrix2); // This should throw an exception due to dimension mismatch
    }

    @Test
    public void testMultiplyDifferentSizedMatrices() {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] data2 = {{7, 8}, {9, 10}, {11, 12}};

        MultipliableMatrix matrix1 = new MultipliableMatrix(data1);
        MultipliableMatrix matrix2 = new MultipliableMatrix(data2);

        MultipliableMatrix result = matrix1.multiply(matrix2);
        int[][] expected = {{58, 64}, {139, 154}};

        assertArrayEquals(expected, result.data);
    }

    @Test
    public void testMultiplyWithZeroMatrix() {
        int[][] data1 = {{0, 0}, {0, 0}};
        int[][] data2 = {{1, 2}, {3, 4}};

        MultipliableMatrix zeroMatrix = new MultipliableMatrix(data1);
        MultipliableMatrix regularMatrix = new MultipliableMatrix(data2);

        MultipliableMatrix result = zeroMatrix.multiply(regularMatrix);
        int[][] expected = {{0, 0}, {0, 0}};

        assertArrayEquals(expected, result.data);
    }
}

// MatrixAdditionExampleTest.java
import org.junit.Test;
import static org.junit.Assert.*;

