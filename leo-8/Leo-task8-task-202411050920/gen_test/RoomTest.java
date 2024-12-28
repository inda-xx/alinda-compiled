package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    private Room room1;
    private Room room2;

    @Before
    public void setUp() {
        room1 = new Room("Room 1");
        room2 = new Room("Room 2");
    }

    @Test
    public void testAddAndGo() {
        room1.addExit("north", room2);
        Room result = room1.go("north");
        assertEquals(room2, result);

        result = room1.go("south"); // Invalid direction
        assertNull(result);
    }

    @Test
    public void testLookAround() {
        room1.addExit("north", room2);
        String expectedDescription = "Room 1\nThere are exits in the directions: north \n";
        room1.lookAround();
        assertEquals(expectedDescription, outContent.toString().trim());
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setupStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}