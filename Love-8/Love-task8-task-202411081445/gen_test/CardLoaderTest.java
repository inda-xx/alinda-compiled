package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardLoaderTest {

    private static final String TEST_FILE_PATH = "test_cards.txt";

    @Test
    public void testLoadCardsFromValidFile() {
        CardLoader loader = new CardLoader();
        List<Card> cards = loader.loadCardsFromFile(TEST_FILE_PATH);
        assertNotNull(cards);
        assertFalse(cards.isEmpty());
    }

    @Test
    public void testLoadCardsFromEmptyFile() {
        CardLoader loader = new CardLoader();
        List<Card> cards = loader.loadCardsFromFile("empty.txt");
        assertNotNull(cards);
        assertTrue(cards.isEmpty());
    }

    @Test
    public void testLoadCardsFromInvalidFile() {
        CardLoader loader = new CardLoader();
        List<Card> cards = loader.loadCardsFromFile("non_existent.txt");
        assertNotNull(cards);
        assertTrue(cards.isEmpty());
    }

    @Test
    public void testLoadCardsWithInvalidFormat() {
        CardLoader loader = new CardLoader();
        List<Card> cards = loader.loadCardsFromFile("invalid_format.txt");
        assertNotNull(cards);
        // Check that no cards are loaded if the format is incorrect
        assertTrue(cards.isEmpty());
    }
}
```

GameTest.java
```
import org.junit.Test;
import static org.junit.Assert.*;

