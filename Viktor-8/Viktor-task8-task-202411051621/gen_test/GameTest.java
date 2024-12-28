package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private GameState state;
    private Room room1;
    private Room room2;

    @Before
    public void setUp() {
        room1 = new Room("Room1", "Room 1 Description");
        room2 = new Room("Room2", "Room 2 Description");
        room1.addExit("east", room2);

        HashMap<String, Room> worldModel = new HashMap<>();
        worldModel.put(room1.getName(), room1);
        worldModel.put(room2.getName(), room2);

        state = new GameState(room1);
    }

    @Test
    public void testInitialRoomSetup() {
        assertEquals("Room1", state.getCurrentRoom().getName());
    }

    @Test
    public void testGoToAnotherRoom() {
        CommandParser.parse("go east", state);
        assertEquals("Room2", state.getCurrentRoom().getName());
    }

    @Test
    public void testInvalidRoomDirection() {
        CommandParser.parse("go west", state);
        assertEquals("Room1", state.getCurrentRoom().getName());
    }

    @Test
    public void testInvalidCommand() {
        CommandParser.parse("dance", state);
        assertEquals("Room1", state.getCurrentRoom().getName());
    }

    @Test
    public void testHelpCommand() {
        CommandParser.parse("help", state);
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

