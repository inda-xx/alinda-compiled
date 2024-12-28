package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class BellTowerTest {

    private BellTower bellTower;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        bellTower = new BellTower();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testRingUntilDawn() {
        bellTower.ringUntilDawn();
        String output = outContent.toString().trim();
        String[] lines = output.split("\n");
        assertEquals(10800, lines.length);
        assertEquals("Ding, dong!", lines[0]);
        assertEquals("Ding, dong!", lines[10799]);
    }

    @Test
    public void testRingHourlyToll() {
        bellTower.ringHourlyToll();
        String output = outContent.toString().trim();
        String[] lines = output.split("\n");

        int expectedLineCount = 0;
        for (int hour = 1; hour <= 12; hour++) {
            expectedLineCount += hour;
        }
        assertEquals(expectedLineCount, lines.length);

        int lineIndex = 0;
        for (int hour = 1; hour <= 12; hour++) {
            for (int toll = 0; toll < hour; toll++) {
                assertEquals("Ding dong at hour: " + hour, lines[lineIndex++]);
            }
        }
    }

    @Test
    public void testCustomTollSingleArgument() {
        bellTower.customToll(5);
        String output = outContent.toString().trim();
        assertEquals("Tolling for 5 seconds.", output);
    }

    @Test
    public void testCustomTollDoubleArgument() {
        bellTower.customToll(5, "Special occasion");
        String output = outContent.toString().trim();
        assertEquals("Tolling: Special occasion for 5 seconds.", output);
    }

    @Test
    public void testTimeSimulationWithPositiveSeconds() {
        bellTower.timeSimulation(5);
        String output = outContent.toString().trim();
        String[] lines = output.split("\n");
        assertEquals(5, lines.length);
        assertEquals("Seconds remaining: 5", lines[0]);
        assertEquals("Seconds remaining: 1", lines[4]);
    }

    @Test
    public void testTimeSimulationWithZeroSeconds() {
        bellTower.timeSimulation(0);
        String output = outContent.toString().trim();
        assertEquals("", output);
    }

    @Test
    public void testTimeSimulationWithNegativeSeconds() {
        bellTower.timeSimulation(-1);
        String output = outContent.toString().trim();
        assertEquals("", output);
    }
}