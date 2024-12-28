package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class DataProcessorTest {

    private DataProcessor dataProcessor;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        dataProcessor = new DataProcessor();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void processNumbersPrintsCorrectMultiplesOfFive() {
        dataProcessor.processNumbers();
        String[] expectedOutput = {"5", "10", "15", "20", "25", "30", "35", "40", "45"};
        String[] actualOutput = outContent.toString().trim().split("\n");
        assertEquals(expectedOutput.length, actualOutput.length);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i].trim());
        }
    }

    @Test
    public void calculateFactorialHandlesZero() {
        int result = dataProcessor.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void calculateFactorialHandlesPositiveNumbers() {
        int result = dataProcessor.calculateFactorial(5);
        assertEquals(120, result);

        result = dataProcessor.calculateFactorial(3);
        assertEquals(6, result);
    }

    @Test
    public void calculateFactorialHandlesNegativeNumbers() {
        int result = dataProcessor.calculateFactorial(-5);
        assertEquals(-1, result);
    }

    @Test
    public void processDataHandlesEmptyArray() {
        int[] data = {};
        dataProcessor.processData(data);
        assertEquals("", outContent.toString().trim());
    }

    @Test
    public void processDataWithThresholdPrintsCorrectly() {
        int[] data = {1, 2, 5, 7, 10};
        dataProcessor.processData(data, 5);
        String[] expectedOutput = {
                "7", "10", "Sum of filtered numbers: 17"
        };
        String[] actualOutput = outContent.toString().trim().split("\n");
        assertEquals(expectedOutput.length, actualOutput.length);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i].trim(), actualOutput[i].trim());
        }
    }
    
    @Test
    public void processDataWithZeroThresholdPrintsAllAboveZero() {
        int[] data = {-10, 0, 10, 20, 5};
        dataProcessor.processData(data);
        String[] expectedOutput = {
                "10", "20", "5", "Sum of filtered numbers: 35"
        };
        String[] actualOutput = outContent.toString().trim().split("\n");
        assertEquals(expectedOutput.length, actualOutput.length);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i].trim(), actualOutput[i].trim());
        }
    }

    @Test
    public void calculateFactorialHandlesLargeNumberPerformance() {
        int number = 20; // Large enough to test performance, but avoid overflow
        int expectedFactorial = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
        assertEquals(expectedFactorial, dataProcessor.calculateFactorial(number));
    }
}