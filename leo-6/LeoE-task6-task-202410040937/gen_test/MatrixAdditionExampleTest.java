package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixAdditionExampleTest {

    @Test
    public void testAddMatricesValid() {
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
        int[][] expected = {
            {8, 10, 12},
            {14, 16, 18}
        };

        assertArrayEquals(expected, result);
    }

    @Test
    public void testAddMatricesInvalidDimensions() {
        MatrixAdditionExample example = new MatrixAdditionExample();

        int[][] matrixA = {{1, 2, 3}};
        int[][] matrixB = {{4, 5}};

        int[][] result = example.addMatrices(matrixA, matrixB);

        assertNull(result);
    }
}

// MatrixCopyExampleTest.java
import org.junit.Test;
import static org.junit.Assert.*;

