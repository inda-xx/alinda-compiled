package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void calculateAverageIntThrowsExceptionWhenArrayIsEmpty() {
        CollectionUtils.calculateAverage(new int[]{});
    }

    @Test
    public void calculateAverageIntReturnsCorrectAverageForPositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3, CollectionUtils.calculateAverage(numbers));
    }
    
    @Test
    public void calculateAverageIntHandlesNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        assertEquals(-3, CollectionUtils.calculateAverage(numbers));
    }

    @Test
    public void calculateAverageIntReturnsCorrectAverageForMixedNumbers() {
        int[] numbers = {-5, -3, 0, 3, 5};
        assertEquals(0, CollectionUtils.calculateAverage(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateAverageDoubleThrowsExceptionWhenArrayIsEmpty() {
        CollectionUtils.calculateAverage(new double[]{});
    }

    @Test
    public void calculateAverageDoubleReturnsCorrectAverageForPositiveNumbers() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(3.0, CollectionUtils.calculateAverage(numbers), 0);
    }

    @Test
    public void calculateAverageDoubleHandlesNegativeNumbers() {
        double[] numbers = {-1.0, -2.0, -3.0, -4.0, -5.0};
        assertEquals(-3.0, CollectionUtils.calculateAverage(numbers), 0);
    }

    @Test
    public void calculateAverageDoubleReturnsCorrectAverageForMixedNumbers() {
        double[] numbers = {-5.0, -3.0, 0.0, 3.0, 5.0};
        assertEquals(0.0, CollectionUtils.calculateAverage(numbers), 0);
    }

    @Test
    public void filterOddNumbersReturnsOddNumbersOnly() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        List<Integer> expected = Arrays.asList(1, 3, 5);
        assertEquals(expected, CollectionUtils.filterOddNumbers(numbers));
    }

    @Test
    public void filterOddNumbersReturnsEmptyListForNoOddNumbers() {
        int[] numbers = {2, 4, 6, 8};
        assertTrue(CollectionUtils.filterOddNumbers(numbers).isEmpty());
    }

    @Test
    public void filterOddNumbersHandlesEmptyArray() {
        int[] numbers = {};
        assertTrue(CollectionUtils.filterOddNumbers(numbers).isEmpty());
    }

    @Test
    public void reverseListReturnsReversed() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(expected, CollectionUtils.reverseList(list));
    }

    @Test
    public void reverseListReturnsEmptyForEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        assertTrue(CollectionUtils.reverseList(list).isEmpty());
    }

    @Test
    public void reverseListDoesNotModifyOriginalList() {
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> copied = new ArrayList<>(original);
        CollectionUtils.reverseList(copied);
        assertEquals(original, copied);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

