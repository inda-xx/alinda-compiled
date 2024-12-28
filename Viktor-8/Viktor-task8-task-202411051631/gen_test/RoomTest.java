package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testAddExitAndGo() {
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        room1.addExit("east", room2);

        // Test valid direction
        assertEquals(room2, room1.go("east"));

        // Test invalid direction
        assertNull(room1.go("west"));
    }

    @Test
    public void testLookAround() {
        Room room1 = new Room("You see a forest.");

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        room1.lookAround();

        // Ensure description is printed
        assertTrue(out.toString().contains("You see a forest."));
    }

    @Test
    public void testPrintExits() {
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        
        room1.addExit("east", room2);

        // Capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        room1.printExits();

        // Ensure exits are printed
        assertTrue(out.toString().contains("east"));
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

