package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void testShouldHit() {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("6", "Hearts"));
        
        assertTrue(dealer.shouldHit());

        dealer.receiveCard(new Card("10", "Spades"));
        
        assertFalse(dealer.shouldHit());
    }
}