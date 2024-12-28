package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void testCardCreation() {
        Card card = new Card("A", "Hearts");
        assertEquals("A", card.getValue());
        assertEquals("Hearts", card.getSuit());
        assertEquals("A of Hearts", card.toString());
    }
}

