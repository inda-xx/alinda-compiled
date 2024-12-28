package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void testCardAttributes() {
        Card card = new Card("Jack", "Clubs", 10);
        assertEquals("Jack", card.getName());
        assertEquals("Clubs", card.getSuit());
        assertEquals(10, card.getValue());
    }

    @Test
    public void testCardToString() {
        Card card = new Card("Queen", "Spades", 10);
        assertEquals("Queen of Spades (Value: 10)", card.toString());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

