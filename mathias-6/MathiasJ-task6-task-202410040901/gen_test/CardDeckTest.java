package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardDeckTest {

    @Test
    public void testGetDeepCopy() {
        CardDeck originalDeck = new CardDeck();
        CardDeck copiedDeck = originalDeck.getDeepCopy();

        assertNotSame(originalDeck, copiedDeck);
        assertEquals(originalDeck.cards.size(), copiedDeck.cards.size());

        for (int i = 0; i < originalDeck.cards.size(); i++) {
            assertNotSame(originalDeck.cards.get(i), copiedDeck.cards.get(i));
            assertEquals(originalDeck.cards.get(i).suit, copiedDeck.cards.get(i).suit);
            assertEquals(originalDeck.cards.get(i).rank, copiedDeck.cards.get(i).rank);
        }
    }
}