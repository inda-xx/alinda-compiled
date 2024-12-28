package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testAddCardIncreasesScore() {
        Player player = new Player();
        Card card = new Card("Ten", "Hearts", 10);
        player.addCard(card);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testAddCardWithNull() {
        Player player = new Player();
        player.addCard(null);
        assertEquals(0, player.getScore());
        assertTrue(player.getHand().isEmpty());
    }

    @Test
    public void testClearHandResetsScore() {
        Player player = new Player();
        player.addCard(new Card("Five", "Clubs", 5));
        player.addCard(new Card("Queen", "Clubs", 10));
        player.clearHand();
        assertEquals(0, player.getScore());
        assertTrue(player.getHand().isEmpty());
    }

    @Test
    public void testGetHandReturnsCopy() {
        Player player = new Player();
        Card card = new Card("Ace", "Diamonds", 1);
        player.addCard(card);
        
        List<Card> hand = player.getHand();
        assertEquals(1, hand.size());

        hand.clear();
        
        assertEquals(1, player.getHand().size());
    }
}

