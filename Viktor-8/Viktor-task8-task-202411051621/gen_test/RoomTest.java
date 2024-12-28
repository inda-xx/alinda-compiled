package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testRoomInitialization() {
        Room room = new Room("Test Room", "This is a test room.");
        assertEquals("Test Room", room.getName());
        assertEquals("This is a test room.", room.getDescription());
    }

    @Test
    public void testAddAndUseExit() {
        Room room1 = new Room("Room1", "Room 1 Description");
        Room room2 = new Room("Room2", "Room 2 Description");
        room1.addExit("north", room2);

        Room movedRoom = room1.go("north");
        assertNotNull(movedRoom);
        assertEquals("Room2", movedRoom.getName());
    }

    @Test
    public void testInvalidDirectionLeadsToNull() {
        Room room1 = new Room("Room1", "Room Description");
        Room result = room1.go("south");
        assertNull(result);
    }

    @Test
    public void testExitsDescription() {
        Room room1 = new Room("Room1", "Room Description");
        Room room2 = new Room("Room2", "Room 2 Description");
        room1.addExit("east", room2);

        room1.printExits();  // Just check if it runs without errors
    }

    @Test
    public void testLookAroundPrintsRoomDescriptionAndExits() {
        Room room = new Room("RoomX", "Room X Description");
        room.lookAround(); // Just check if it runs without errors
    }
}