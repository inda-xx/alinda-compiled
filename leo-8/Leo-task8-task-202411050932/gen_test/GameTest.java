package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Room startRoom;
    private Room northRoom;
    private Room southRoom;
    private GameState state;

    @Before
    public void setUp() {
        startRoom = new Room("You are in the starting room.");
        northRoom = new Room("You are in the north room.");
        southRoom = new Room("You are in the south room.");

        startRoom.addExit("north", northRoom);
        startRoom.addExit("south", southRoom);

        state = new GameState(startRoom);
    }

    @Test
    public void testRoomNavigation() {
        // Testing move to the north room
        CommandParser.parse("go north", state);
        assertEquals(northRoom, state.getCurrentRoom());

        // Testing move back to the starting room
        CommandParser.parse("go south", state);
        assertEquals(startRoom, state.getCurrentRoom());

        // Testing move to the south room
        CommandParser.parse("go south", state);
        assertEquals(southRoom, state.getCurrentRoom());

        // Invalid direction
        CommandParser.parse("go east", state);
        assertEquals(southRoom, state.getCurrentRoom()); // Should stay in the same room
    }

    @Test
    public void testLookCommand() {
        // Go to the north room
        CommandParser.parse("go north", state);
        assertEquals("You are in the north room.", state.getCurrentRoom().getDescription());

        // Look around in the north room
        CommandParser.parse("look", state); // Should print description of the north room

        // Go back to the start room and look around
        CommandParser.parse("go south", state);
        assertEquals("You are in the starting room.", state.getCurrentRoom().getDescription());

        // Look around in the starting room
        CommandParser.parse("look", state); // Should print description of the starting room
    }

    @Test
    public void testInvalidCommand() {
        CommandParser.parse("bycicle", state);
        // The system should print "Unknown command."
    }
}

import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

