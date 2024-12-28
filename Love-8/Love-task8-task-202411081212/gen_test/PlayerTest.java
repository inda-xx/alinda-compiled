package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testAddCard() {
        Player player = new Player("TestPlayer");
        Card card = new Card("A", "Spades");
        player.addCard(card);
        assertEquals(1, player.getHand().size());
        assertEquals(card, player.getHand().get(0));
    }

    @Test
    public void testCalculateScore_NoAces() {
        Player player = new Player("TestPlayer");
        player.addCard(new Card("2", "Hearts"));
        player.addCard(new Card("K", "Diamonds"));
        assertEquals(12, player.calculateScore());
    }

    @Test
    public void testCalculateScore_WithAces() {
        Player player = new Player("TestPlayer");
        player.addCard(new Card("A", "Spades"));
        player.addCard(new Card("A", "Clubs"));
        player.addCard(new Card("8", "Diamonds"));
        assertEquals(20, player.calculateScore());
    }

    @Test
    public void testClearHand() {
        Player player = new Player("TestPlayer");
        player.addCard(new Card("A", "Spades"));
        player.clearHand();
        assertTrue(player.getHand().isEmpty());
    }
}

