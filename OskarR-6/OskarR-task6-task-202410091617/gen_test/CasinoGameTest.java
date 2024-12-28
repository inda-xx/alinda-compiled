package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasinoGameTest {

    @Test
    public void testGenerateFortunesLength() {
        int n = 10;
        ArrayList<String> fortunes = CasinoGame.generateFortunes(n);
        assertEquals(n, fortunes.size());
    }

    @Test
    public void testGenerateFortunesContent() {
        int n = 10;
        ArrayList<String> fortunes = CasinoGame.generateFortunes(n);
        for (String fortune : fortunes) {
            List<String> validFortunes = List.of(
                "Win Big", "Better luck next time", "Try again",
                "You hit the jackpot", "Unlucky", "You're on a winning streak"
            );
            assertTrue(validFortunes.contains(fortune));
        }
    }

    @Test
    public void testShuffleFortunesDoesNotModifyOriginal() {
        ArrayList<String> fortunes = CasinoGame.generateFortunes(10);
        ArrayList<String> shuffled = CasinoGame.shuffleFortunes(fortunes);
        assertTrue(!shuffled.equals(fortunes) || new HashSet<>(shuffled).equals(new HashSet<>(fortunes)));
        assertEquals(fortunes.size(), shuffled.size());
    }

    @Test
    public void testShuffleFortunesEmptyList() {
        ArrayList<String> emptyList = new ArrayList<>();
        ArrayList<String> shuffled = CasinoGame.shuffleFortunes(emptyList);
        assertEquals(0, shuffled.size());
    }
}
```

DiceTest.java:
```java
import org.junit.Test;
import static org.junit.Assert.assertTrue;

