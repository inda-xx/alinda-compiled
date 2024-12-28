package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameUtilitiesTest {

    @Test
    public void testRollDiceWithinRange() {
        GameUtilities utils = new GameUtilities();
        for (int i = 0; i < 100; i++) {
            int result = utils.rollDice();
            assertTrue(result >= 1 && result <= 6);
        }
    }

    @Test
    public void testEvaluateScorePowerMoveUnlocked() {
        GameUtilities utils = new GameUtilities();
        assertEquals("Power Move Unlocked", utils.evaluateScore(100, 100));
    }

    @Test
    public void testEvaluateScoreShieldGuardEnabled() {
        GameUtilities utils = new GameUtilities();
        assertEquals("Shield Guard Enabled", utils.evaluateScore(95, 100));
    }
}

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.*;

