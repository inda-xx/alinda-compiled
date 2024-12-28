package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TernaryOperatorExampleTest {

    @Test
    public void testDemonstrateTernaryOperator() {
        TernaryOperatorExample example = new TernaryOperatorExample();
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) % 2 == 0 ? 1 : -1;
            }
        }

        example.demonstrateTernaryOperator();
    }
}

// MatrixModificationExampleTest.java
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

