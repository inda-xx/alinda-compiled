package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixModificationExampleTest {

    @Test
    public void testDoubleEvens() {
        List<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(java.util.Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(java.util.Arrays.asList(7, 8, 9)));

        MatrixModificationExample example = new MatrixModificationExample();
        example.doubleEvens(matrix);

        assertEquals(java.util.Arrays.asList(1, 4, 3), matrix.get(0));
        assertEquals(java.util.Arrays.asList(8, 5, 12), matrix.get(1));
        assertEquals(java.util.Arrays.asList(7, 16, 9), matrix.get(2));
    }
}