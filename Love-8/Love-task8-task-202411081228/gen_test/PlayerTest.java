package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testCalculateTotal_WithVariousCards() {
        Player player = new Player();
        player.receiveCard(new Card("5", "Hearts"));
        player.receiveCard(new Card("King", "Spades"));
        
        assertEquals(15, player.calculateTotal());

        player.receiveCard(new Card("Ace", "Diamonds"));
        
        assertEquals(16, player.calculateTotal());

        player.receiveCard(new Card("2", "Clubs"));
        
        assertEquals(18, player.calculateTotal());
    }
    
    @Test
    public void testCalculateTotal_WithMultipleAces() {
        Player player = new Player();
        player.receiveCard(new Card("Ace", "Hearts"));
        player.receiveCard(new Card("Ace", "Spades"));
        
        assertEquals(12, player.calculateTotal());

        player.receiveCard(new Card("9", "Diamonds"));
        
        assertEquals(21, player.calculateTotal());

        player.receiveCard(new Card("5", "Clubs"));
        
        assertEquals(16, player.calculateTotal());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

