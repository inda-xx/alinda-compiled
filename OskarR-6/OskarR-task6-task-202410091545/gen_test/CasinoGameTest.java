package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasinoGameTest {

    @Test
    public void testGenerateFortunes() {
        ArrayList<String> fortunes = CasinoGame.generateFortunes(5);
        assertEquals(5, fortunes.size());
        for (String fortune : fortunes) {
            assertNotNull(fortune);
            assertFalse(fortune.isEmpty());
        }
    }

    @Test
    public void testGenerateFortunesZero() {
        ArrayList<String> fortunes = CasinoGame.generateFortunes(0);
        assertEquals(0, fortunes.size());
    }

    @Test
    public void testShuffleFortunes() {
        ArrayList<String> original = new ArrayList<>(Arrays.asList("Win Big", "Try again"));
        ArrayList<String> shuffled = CasinoGame.shuffleFortunes(original);
        assertEquals(original.size(), shuffled.size());
        assertTrue(shuffled.containsAll(original));
        assertNotSame(original, shuffled);
    }

    @Test
    public void testShuffleFortunesEmpty() {
        ArrayList<String> original = new ArrayList<>();
        ArrayList<String> shuffled = CasinoGame.shuffleFortunes(original);
        assertEquals(0, shuffled.size());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

