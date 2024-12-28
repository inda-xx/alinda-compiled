package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SixFortyNineGameTest {

    @Test
    public void testTicketLength() {
        SixFortyNineGame game = new SixFortyNineGame();
        ArrayList<Integer> ticket = game.generateTicket();
        assertEquals(6, ticket.size(), "Ticket should have 6 numbers");
    }
    
    @Test
    public void testUniqueNumbers() {
        SixFortyNineGame game = new SixFortyNineGame();
        ArrayList<Integer> ticket = game.generateTicket();
        long uniqueCount = ticket.stream().distinct().count();
        assertEquals(ticket.size(), uniqueCount, "All numbers should be unique");
    }
    
    @Test
    public void testRanges() {
        SixFortyNineGame game = new SixFortyNineGame();
        ArrayList<Integer> ticket = game.generateTicket();
        for (int number : ticket) {
            assertTrue(number >= 1 && number <= 49, "Number should be in range 1-49");
        }
    }
}

**ModifyCollectionTest.java:**

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

