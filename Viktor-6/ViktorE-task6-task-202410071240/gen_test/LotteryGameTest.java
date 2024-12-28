package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LotteryGameTest {

    @Test
    public void testTicketLengthWithDifferentConfigurations() {
        LotteryGame game = new LotteryGame(1, 100, 10);
        ArrayList<Integer> ticket = game.generateTicket();
        assertEquals(10, ticket.size(), "Ticket should have 10 numbers");
    }
    
    @Test
    public void testUniqueNumbers() {
        LotteryGame game = new LotteryGame(1, 20, 5);
        ArrayList<Integer> ticket = game.generateTicket();
        long uniqueCount = ticket.stream().distinct().count();
        assertEquals(ticket.size(), uniqueCount, "All numbers should be unique");
    }
    
    @Test
    public void testRanges() {
        LotteryGame game = new LotteryGame(10, 20, 5);
        ArrayList<Integer> ticket = game.generateTicket();
        for (int number : ticket) {
            assertTrue(number >= 10 && number <= 20, "Number should be in range 10-20");
        }
    }
}

**SixFortyNineGameTest.java:**

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

