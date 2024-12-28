package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HigherLowerGameTest {

    @Test
    public void generateRandomSequenceGeneratesCorrectSize() {
        List<Integer> result = HigherLowerGame.generateRandomSequence(10);
        assertEquals(10, result.size());
    }

    @Test
    public void generateRandomSequenceNumbersAreWithinRange() {
        List<Integer> result = HigherLowerGame.generateRandomSequence(50);
        for (Integer number : result) {
            assertTrue(number >= 0 && number < 100);
        }
    }

    @Test
    public void generateRandomSequenceWithZero() {
        List<Integer> result = HigherLowerGame.generateRandomSequence(0);
        assertTrue(result.isEmpty());
    }

    @Test
    public void removeNumbersAboveThresholdRemovesCorrectly() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        List<Integer> result = HigherLowerGame.removeNumbersAboveThreshold(numbers, 35);
        assertEquals(new ArrayList<>(Arrays.asList(10, 20, 30)), result);
    }

    @Test
    public void removeNumbersAboveThresholdKeepsAllBelowThreshold() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        List<Integer> result = HigherLowerGame.removeNumbersAboveThreshold(numbers, 100);
        assertEquals(numbers, result);
    }

    @Test
    public void removeNumbersAboveThresholdRemovesAllIfNeeded() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        List<Integer> result = HigherLowerGame.removeNumbersAboveThreshold(numbers, 9);
        assertTrue(result.isEmpty());
    }

    @Test
    public void removeNumbersAboveThresholdWithEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = HigherLowerGame.removeNumbersAboveThreshold(numbers, 100);
        assertTrue(result.isEmpty());
    }

    @Test
    public void generateRandomNumbersGeneratesCorrectSizeInChild() {
        NumberGame game = new NumberGame();
        List<Integer> result = game.generateRandomNumbers(10, 100);
        assertEquals(10, result.size());
    }

    // Testing EnhancedHigherLowerGame would require more elaborate setup
    // and handling of user input, which might involve using a mock framework.
}