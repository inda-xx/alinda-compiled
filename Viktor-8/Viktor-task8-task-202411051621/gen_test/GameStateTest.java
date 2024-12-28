package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {

    @Test
    public void testGetCurrentRoom() {
        Room room = new Room("Test Room", "A simple test room");
        GameState state = new GameState(room);
        assertEquals("Test Room", state.getCurrentRoom().getName());
    }

    @Test
    public void testSetCurrentRoom() {
        Room room1 = new Room("Room A", "First Room");
        Room room2 = new Room("Room B", "Second Room");
        GameState state = new GameState(room1);
        
        state.setCurrentRoom(room2);
        assertEquals("Room B", state.getCurrentRoom().getName());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

