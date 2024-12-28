package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberExplorerTest {

    @Test
    public void testCalculatePrimesWithRangeContainingPrimes() {
        int[] expected = {11, 13, 17, 19, 23, 29};
        int[] result = PrimeNumberExplorer.calculatePrimes(10, 30);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesListWithRangeContainingPrimes() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(11, 13, 17, 19, 23, 29));
        ArrayList<Integer> result = PrimeNumberExplorer.calculatePrimesList(10, 30);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesWithSinglePrimeNumber() {
        int[] expected = {17};
        int[] result = PrimeNumberExplorer.calculatePrimes(17, 17);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesListWithSinglePrimeNumber() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(17));
        ArrayList<Integer> result = PrimeNumberExplorer.calculatePrimesList(17, 17);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesWithRangeContainingNoPrimes() {
        int[] expected = {};
        int[] result = PrimeNumberExplorer.calculatePrimes(14, 16);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesListWithRangeContainingNoPrimes() {
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> result = PrimeNumberExplorer.calculatePrimesList(14, 16);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesWithNegativeAndPositiveRange() {
        int[] expected = {2, 3, 5, 7, 11, 13};
        int[] result = PrimeNumberExplorer.calculatePrimes(-10, 14);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesListWithNegativeAndPositiveRange() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13));
        ArrayList<Integer> result = PrimeNumberExplorer.calculatePrimesList(-10, 14);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesWithStartGreaterThanEnd() {
        int[] expected = {};
        int[] result = PrimeNumberExplorer.calculatePrimes(30, 10);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesListWithStartGreaterThanEnd() {
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> result = PrimeNumberExplorer.calculatePrimesList(30, 10);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculatePrimesPerformanceForLargeRange() {
        long start = System.currentTimeMillis();
        PrimeNumberExplorer.calculatePrimes(1, 10000);
        long end = System.currentTimeMillis();
        long duration = end - start;
        // Adjust this threshold as per requirement, e.g., 1000 milliseconds
        assert(duration < 1000);
    }

    @Test
    public void testCalculatePrimesListPerformanceForLargeRange() {
        long start = System.currentTimeMillis();
        PrimeNumberExplorer.calculatePrimesList(1, 10000);
        long end = System.currentTimeMillis();
        long duration = end - start;
        // Adjust this threshold as per requirement, e.g., 1000 milliseconds
        assert(duration < 1000);
    }
}