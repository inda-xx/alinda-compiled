package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomUtilsTest {

    @Test
    public void testGenerateRandomNumbers() {
        ArrayList<Integer> result = RandomUtils.generateRandomNumbers(5);
        assertEquals(5, result.size());
        for (int num : result) {
            assertTrue(num >= 0 && num <= 9);
        }
    }

    @Test
    public void testGenerateRandomNumbersZero() {
        ArrayList<Integer> result = RandomUtils.generateRandomNumbers(0);
        assertEquals(0, result.size());
    }

    @Test
    public void testShuffleNumbers() {
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> shuffled = RandomUtils.shuffleNumbers(original);
        assertEquals(original.size(), shuffled.size());
        assertTrue(shuffled.containsAll(original));
    }

    @Test
    public void testShuffleNumbersEmpty() {
        ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Integer> shuffled = RandomUtils.shuffleNumbers(original);
        assertEquals(0, shuffled.size());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

