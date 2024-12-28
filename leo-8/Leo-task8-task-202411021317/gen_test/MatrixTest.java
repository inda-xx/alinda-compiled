package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {

    private Matrix matrixA;
    private Matrix matrixB;
    private Matrix matrixC;

    @Before
    public void setup() {
        double[][] dataA = {
            {1, 2},
            {3, 4}
        };
        double[][] dataB = {
            {2, 0},
            {1, 2}
        };
        double[][] dataC = {
            {0, 1, 2},
            {3, 4, 5}
        };

        matrixA = new Matrix(dataA);
        matrixB = new Matrix(dataB);
        matrixC = new Matrix(dataC);
    }

    @Test
    public void testMultiplyValidMatrices() {
        Matrix result = matrixA.multiply(matrixB);
        double[][] expectedData = {
            {4, 4},
            {10, 8}
        };
        assertMatrixEquals(new Matrix(expectedData), result);
    }

    @Test
    public void testMultiplyInvalidMatrices() {
        assertThrows(IllegalArgumentException.class, () -> matrixA.multiply(matrixC));
    }

    @Test
    public void testAddValidMatrices() {
        Matrix result = matrixA.add(matrixB);
        double[][] expectedData = {
            {3, 2},
            {4, 6}
        };
        assertMatrixEquals(new Matrix(expectedData), result);
    }

    @Test
    public void testAddInvalidMatrices() {
        assertThrows(IllegalArgumentException.class, () -> matrixA.add(matrixC));
    }

    @Test
    public void testScaleMatrix() {
        Matrix result = matrixA.scale(2.0);
        double[][] expectedData = {
            {2, 4},
            {6, 8}
        };
        assertMatrixEquals(new Matrix(expectedData), result);
    }

    private void assertMatrixEquals(Matrix expected, Matrix actual) {
        double[][] expectedData = expected.data;
        double[][] actualData = actual.data;
        
        assertEquals(expectedData.length, actualData.length);
        for (int i = 0; i < expectedData.length; i++) {
            assertEquals(expectedData[i].length, actualData[i].length);
            for (int j = 0; j < expectedData[i].length; j++) {
                assertEquals(expectedData[i][j], actualData[i][j], 0.001);
            }
        }
    }

    @Test(expected = IOException.class)
    public void testFromFileWithNonExistentFile() throws IOException {
        Matrix.fromFile("non_existent_file.txt");
    }

    @Test(expected = NumberFormatException.class)
    public void testFromFileWithInvalidFileContent() throws IOException {
        // Create a mock file reader here with invalid content (mocking required in actual implementation)
        // This is a placeholder to indicate the test case
    }

    @Test
    public void testMatrixMultiplicationPerformance() {
        double[][] largeData1 = new double[100][100];
        double[][] largeData2 = new double[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                largeData1[i][j] = i + j;
                largeData2[i][j] = i - j;
            }
        }

        Matrix largeMatrix1 = new Matrix(largeData1);
        Matrix largeMatrix2 = new Matrix(largeData2);

        // Measure time for multiplication (mock measure if needed)
        Matrix result = largeMatrix1.multiply(largeMatrix2);

        // Just checking if the result matrix has correct dimensions
        assertEquals(largeMatrix1.data.length, result.data.length);
        assertEquals(largeMatrix2.data[0].length, result.data[0].length);
    }
}