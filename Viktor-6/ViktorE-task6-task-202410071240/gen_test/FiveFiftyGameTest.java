package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FiveFiftyGameTest {

    @Test
    public void testTicketLength() {
        FiveFiftyGame game = new FiveFiftyGame();
        ArrayList<Integer> ticket = game.generateTicket();
        assertEquals(5, ticket.size(), "Ticket should have 5 numbers");
    }
    
    @Test
    public void testUniqueNumbers() {
        FiveFiftyGame game = new FiveFiftyGame();
        ArrayList<Integer> ticket = game.generateTicket();
        long uniqueCount = ticket.stream().distinct().count();
        assertEquals(ticket.size(), uniqueCount, "All numbers should be unique");
    }
    
    @Test
    public void testRanges() {
        FiveFiftyGame game = new FiveFiftyGame();
        ArrayList<Integer> ticket = game.generateTicket();
        for (int number : ticket) {
            assertTrue(number >= 1 && number <= 50, "Number should be in range 1-50");
        }
    }
}

**LotteryGameTest.java:**

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

