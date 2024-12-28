package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void testDeck_IsSingleton() {
        Deck deck1 = Deck.getInstance();
        Deck deck2 = Deck.getInstance();

        assertSame(deck1, deck2);
    }

    @Test
    public void testDealCard_ReduceDeckSize() {
        Deck deck = Deck.getInstance();
        int initialSize = 52;

        for (int i = 0; i < initialSize; i++) {
            assertNotNull(deck.dealCard());
        }

        assertNull(deck.dealCard()); // No more cards
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

