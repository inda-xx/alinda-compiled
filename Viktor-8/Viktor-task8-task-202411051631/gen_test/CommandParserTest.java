package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandParserTest {

    @Test
    public void testParse_goValidCommand() {
        // Setup
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        room1.addExit("north", room2);
        GameState state = new GameState(room1);

        // Simulate 'go north'
        CommandParser.parse("go north", state);

        // Assert movement to new room
        assertEquals(room2, state.getCurrentRoom());
    }

    @Test
    public void testParse_goInvalidDirection() {
        // Setup
        Room room1 = new Room("Room 1");
        GameState state = new GameState(room1);

        // Simulate 'go south' - no such exit
        CommandParser.parse("go south", state);

        // Assert no room change
        assertEquals(room1, state.getCurrentRoom());
    }

    @Test
    public void testParse_lookCommand() {
        // Setup
        Room room1 = new Room("You are in a beautiful garden.");
        GameState state = new GameState(room1);

        // Capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Simulate 'look' command
        CommandParser.parse("look", state);

        // Assert correct room description printed
        assertTrue(out.toString().contains("You are in a beautiful garden."));
    }

    @Test
    public void testParse_unknownCommand() {
        // Setup a basic room
        Room room1 = new Room("Room 1");
        GameState state = new GameState(room1);

        // Capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Simulate unknown command
        CommandParser.parse("dance", state);

        // Assert appropriate error message displayed
        assertTrue(out.toString().contains("Unknown command: dance"));
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

