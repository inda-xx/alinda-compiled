package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasinoGameTest {
    
    @Test
    public void testGenerateFortunes() {
        ArrayList<String> fortunes = CasinoGame.generateFortunes(3);
        assertEquals(3, fortunes.size());
        for (String fortune : fortunes) {
            assertTrue(List.of("Win Big", "Better luck next time", "Try again", 
                               "You hit the jackpot", "Unlucky", "You're on a winning streak")
                               .contains(fortune));
        }
    }

    @Test
    public void testShuffleFortunes() {
        ArrayList<String> originalFortunes = new ArrayList<>(Arrays.asList("Win Big", "Try again", "Unlucky"));
        ArrayList<String> shuffledFortunes = CasinoGame.shuffleFortunes(originalFortunes);
        
        assertEquals(originalFortunes.size(), shuffledFortunes.size());
        assertTrue(shuffledFortunes.containsAll(originalFortunes));
        assertNotEquals(originalFortunes, shuffledFortunes);  // Ensure the order is shuffled
    }
}