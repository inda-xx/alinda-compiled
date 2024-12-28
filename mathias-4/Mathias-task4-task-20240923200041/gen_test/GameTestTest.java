package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Game game;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        game = new Game();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCheckRunningStatusPerformance() {
        game.checkRunningStatus();
        String output = outContent.toString();
        assertTrue(output.contains("Obstacle encountered! Run stopped."));
        assertTrue(output.contains("Total distance covered:"));
    }

    @Test
    public void testTrackLapsWithValidInput() {
        game.trackLaps(3);
        String output = outContent.toString();
        for (int i = 1; i <= 3; i++) {
            assertTrue(output.contains("Starting lap: " + i));
            assertTrue(output.contains("Completed lap: " + i));
        }
    }

    @Test
    public void testTrackLapsWithZeroInput() {
        game.trackLaps(0);
        String output = outContent.toString().trim();
        assertEquals("", output); // No laps should result in no output.
    }

    @Test(expected = IllegalArgumentException.