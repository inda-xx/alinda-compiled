package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void testShuffleAndDraw() {
        List<Card> cards = Arrays.asList(
            new Card("Ace", "Spades", 1),
            new Card("Two", "Spades", 2),
            new Card("Three", "Spades", 3)
        );
        Deck deck = new Deck(cards);
        assertEquals(3, deck.remainingCards());

        Card drawnCard = deck.drawCard();
        assertNotNull(drawnCard);
        assertEquals(2, deck.remainingCards());
    }

    @Test
    public void testDrawFromEmptyDeck() {
        List<Card> cards = new ArrayList<>();
        Deck deck = new Deck(cards);
        assertNull(deck.drawCard());
    }

    @Test
    public void testRemainingCards() {
        List<Card> cards = Arrays.asList(
            new Card("Ace", "Hearts", 1),
            new Card("King", "Hearts", 10)
        );
        Deck deck = new Deck(cards);
        assertEquals(2, deck.remainingCards());
        deck.drawCard();
        assertEquals(1, deck.remainingCards());
    }
}

