package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomUtilTest {

    @Test
    public void testGenerateRandomNumbers() {
        ArrayList<Integer> randomNumbers = RandomUtil.generateRandomNumbers(5);
        assertEquals(5, randomNumbers.size());
        for (Integer number : randomNumbers) {
            assertTrue(number >= 1 && number <= 100);
        }
    }

    @Test
    public void testRemoveNumber() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 2, 5));
        RandomUtil.removeNumber(numbers, 2);
        assertEquals(4, numbers.size());
        assertFalse(numbers.contains(2));
    }

    @Test
    public void testRemoveNumberNoMatch() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        RandomUtil.removeNumber(numbers, 6);
        assertEquals(5, numbers.size());
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;

