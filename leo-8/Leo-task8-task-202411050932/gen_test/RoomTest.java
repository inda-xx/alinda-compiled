package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testAddExit() {
        Room room1 = new Room("First Room");
        Room room2 = new Room("Second Room");

        room1.addExit("north", room2);
        assertEquals(room2, room1.go("north"));
    }

    @Test
    public void testGoWithInvalidDirection() {
        Room room1 = new Room("First Room");
        assertNull(room1.go("west")); // No exits set up initially, should print "You can't go that way!"
    }

    @Test
    public void testDescriptions() {
        Room room = new Room("It's a dark, quiet room.");
        assertEquals("It's a dark, quiet room.", room.getDescription());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

