package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void testShouldHit() {
        Dealer dealer = new Dealer();
        dealer.addCard(new Card("5", "Diamonds"));
        assertTrue(dealer.shouldHit());
        dealer.addCard(new Card("9", "Spades"));
        assertTrue(dealer.shouldHit());
        dealer.addCard(new Card("3", "Hearts"));
        assertFalse(dealer.shouldHit());
    }
}

