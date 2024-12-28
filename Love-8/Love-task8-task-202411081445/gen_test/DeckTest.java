package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck;

    @Before
    public void setup() {
        deck = Deck.getInstance();
    }

    @Test
    public void testSingletonInstance() {
        Deck anotherDeck = Deck.getInstance();
        assertSame(deck, anotherDeck);
    }

    @Test
    public void testDeckSizeAfterInitialization() {
        assertEquals(52, deck.cardsRemaining());
    }

    @Test
    public void testDealCardReducesDeckSize() {
        Card card = deck.dealCard();
        assertNotNull(card);
        assertEquals(51, deck.cardsRemaining());
    }

    @Test
    public void testDealCardFromEmptyDeck() {
        for (int i = 0; i < 52; i++) {
            deck.dealCard();
        }
        assertNull(deck.dealCard());
    }

    @Test
    public void testShufflePreservesDeckSize() {
        deck.shuffle();
        assertEquals(52, deck.cardsRemaining());
    }
}
```

PlayerTest.java
```
import org.junit.Test;
import static org.junit.Assert.*;

