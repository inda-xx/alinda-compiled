package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class TreasureHuntTest {

    private TreasureHunt treasureHunt;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        treasureHunt = new TreasureHunt();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testTryUnlockDoorValid() {
        assertTrue(treasureHunt.tryUnlockDoor(21)); // Multiple of 3 and not 7
        assertTrue(treasureHunt.tryUnlockDoor(7));  // Multiple of 7 and not 3
    }

    @Test
    public void testTryUnlockDoorInvalid() {
        assertFalse(treasureHunt.tryUnlockDoor(14)); // Multiple of both 7 and not 3
        assertFalse(treasureHunt.tryUnlockDoor(35)); // Multiple of both 3 and not 7
    }

    @Test
    public void testDodgeTraps() {
        treasureHunt.dodgeTraps();
        assertTrue(outContent.toString().contains("Trap avoided at step: 100"));
        assertTrue(outContent.toString().contains("Treasure found at step: 5000"));
    }

    @Test
    public void testPrintTreasureMap() {
        treasureHunt.printTreasureMap(3);
        String expected = "* * * \n* * * \n* * * \n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testCalculateRewardWithoutMultiplier() {
        assertEquals(20, treasureHunt.calculateReward(10));
    }

    @Test
    public void testCalculateRewardWithMultiplier() {
        assertEquals(15.0, treasureHunt.calculateReward(10, 1.5), 0.001);
    }

    @Test
    public void testTrapCountdown() {
        treasureHunt.trapCountdown(6);
        assertTrue(outContent.toString().contains("Countdown: 6 seconds remaining..."));
        assertTrue(outContent.toString().contains("## Suspense Builds ##"));
    }
}