package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixCopyExampleTest {

    @Test
    public void testDeepCopyMatrix() {
        MatrixCopyExample example = new MatrixCopyExample();

        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] deepCopy = example.deepCopyMatrix(original);
        deepCopy[0][0] = 99;

        assertNotEquals(original[0][0], deepCopy[0][0]);
    }

    @Test
    public void testShallowCopyMatrix() {
        MatrixCopyExample example = new MatrixCopyExample();

        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] shallowCopy = example.shallowCopyMatrix(original);
        shallowCopy[0][0] = 99;

        assertEquals(original[0][0], shallowCopy[0][0]);
    }
}

// TernaryOperatorExampleTest.java
import org.junit.Test;
import static org.junit.Assert.*;

