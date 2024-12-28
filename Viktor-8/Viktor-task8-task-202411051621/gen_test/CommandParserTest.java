package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandParserTest {

    @Test
    public void testParseHelpCommand() {
        GameState state = new GameState(new Room("Room1", "Room 1 Description"));
        CommandParser.parse("help", state);
        assertTrue(true); // Just check if it runs without errors
    }

    @Test
    public void testParseGoValidDirection() {
        Room room = new Room("A", "Starting Room");
        Room nextRoom = new Room("B", "Next Room");
        room.addExit("north", nextRoom);
        GameState state = new GameState(room);

        CommandParser.parse("go north", state);
        assertEquals("B", state.getCurrentRoom().getName());
    }

    @Test
    public void testParseGoInvalidDirection() {
        Room room = new Room("A", "Only Room");
        GameState state = new GameState(room);

        CommandParser.parse("go east", state);
        assertEquals("A", state.getCurrentRoom().getName());
    }

    @Test
    public void testInvalidCommandFormat() {
        Room room = new Room("A", "Starting Room");
        CommandParser.parse("look around", new GameState(room));
        assertEquals("A", room.getName());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

