package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void averageIntArrayReturnsZeroForEmptyArray() {
        assertEquals(0, Arrays.average(new int[]{}));
    }

    @Test
    public void averageIntArrayReturnsCorrectAverage() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, Arrays.average(array));
    }

    @Test
    public void averageIntArrayHandlesNegativeNumbers() {
        int[] array = {-1, -2, -3, -4};
        assertEquals(-2, Arrays.average(array));
    }

    @Test
    public void averageDoubleArrayReturnsZeroForEmptyArray() {
        assertEquals(0.0, Arrays.average(new double[]{}), 0.0);
    }

    @Test
    public void averageDoubleArrayReturnsCorrectAverage() {
        double[] array = {1.0, 2.0, 3.0};
        assertEquals(2.0, Arrays.average(array), 0);
    }

    @Test
    public void smallestElementReturnsMaxValueForEmptyArray() {
        assertEquals(Integer.MAX_VALUE, Arrays.smallestElement(new int[]{}));
    }

    @Test
    public void smallestElementReturnsCorrectSmallestValue() {
        int[] array = {3, 2, 1, 4, 5};
        assertEquals(1, Arrays.smallestElement(array));
    }

    @Test
    public void reverseReturnsReversedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, Arrays.reverse(array));
    }

    @Test
    public void reverseReturnsEmptyArrayForEmptyArray() {
        assertArrayEquals(new int[]{}, Arrays.reverse(new int[]{}));
    }

    @Test
    public void evenNumbersReturnsEvenNumbersOnly() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, Arrays.evenNumbers(array));
    }

    @Test
    public void evenNumbersReturnsEmptyArrayForNoEvenNumbers() {
        int[] array = {1, 3, 5, 7};
        assertArrayEquals(new int[]{}, Arrays.evenNumbers(array));
    }
}

import org.junit.Test;
import java.util.*;
import java.util.stream.IntStream;
import static org.junit.Assert.assertEquals;

