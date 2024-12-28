package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomTheoryTest {

    @Test
    public void testGetPlayerOutcomeWin() {
        RandomTheory theory = new RandomTheory();
        assertEquals("Win", theory.getPlayerOutcome(85, 70));
    }

    @Test
    public void testGetPlayerOutcomeLose() {
        RandomTheory theory = new RandomTheory();
        assertEquals("Lose", theory.getPlayerOutcome(65, 70));
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

