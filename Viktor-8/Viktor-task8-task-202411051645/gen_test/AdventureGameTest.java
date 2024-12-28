package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdventureGameTest {

    private GameState gameState;
    private Room startRoom, secondRoom;

    @Before
    public void setUp() {
        startRoom = new Room("Start Room");
        secondRoom = new Room("Second Room");
        startRoom.addExit("north", secondRoom);
        gameState = new GameState(startRoom);
    }

    @Test
    public void testInitialRoomSetup() {
        assertEquals("Start Room", gameState.getCurrentRoom().lookAround());
    }
    
    @Test
    public void testAddExitAndGo() {
        Room northRoom = startRoom.go("north");
        assertEquals("Second Room", northRoom.lookAround());
    }
    
    @Test
    public void testNonExistentExit() {
        assertNull(startRoom.go("south"));
    }
    
    @Test
    public void testRoomDescription() {
        assertEquals("Start Room", startRoom.lookAround());
    }
    
    @Test
    public void testRoomExits() {
        assertNotNull(startRoom.go("north"));
        assertNull(startRoom.go("east"));
    }

    @Test
    public void testGenerateRoomsFromFileWithValidFile() {
        AdventureGame ag = new AdventureGame();
        ag.generateRoomsFromFile("valid_rooms.txt");
        assertTrue(ag.getGameState().getCurrentRoom().lookAround().contains("Start Room"));
    }

    @Test
    public void testGenerateRoomsFromFileWithInvalidFile() {
        AdventureGame ag = new AdventureGame();
        try {
            ag.generateRoomsFromFile("invalid_rooms.txt");
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Error generating rooms from file"));
        }
    }

    @Test
    public void testCommandParserLookCommand() {
        CommandParser.parse("look", gameState);
        assertEquals("Start Room", gameState.getCurrentRoom().lookAround());
    }

    @Test
    public void testCommandParserGoCommand() {
        CommandParser.parse("go north", gameState);
        assertEquals("Second Room", gameState.getCurrentRoom().lookAround());
    }

    @Test
    public void testCommandParserInvalidCommand() {
        CommandParser.parse("fly", gameState);
        assertEquals("Start Room", gameState.getCurrentRoom().lookAround());
    }

    @Test
    public void testHelpCommand() {
        CommandParser.printHelpMessage();
    }

    @Test
    public void testLookAround() {
        String description = startRoom.lookAround();
        assertTrue(description.contains("Start Room"));
    }

    @Test
    public void testRoomMultipleExits() {
        Room thirdRoom = new Room("Third Room");
        startRoom.addExit("east", thirdRoom);
        assertEquals("Second Room", startRoom.go("north").lookAround());
        assertEquals("Third Room", startRoom.go("east").lookAround());
    }

    @Test
    public void testPerformanceLargeNumberOfRooms() {
        HashMap<String, Room> largeWorldModel = new HashMap<>();
        Room lastRoom = null;

        for (int i = 0; i < 1000; i++) {
            Room room = new Room("Room " + i);
            largeWorldModel.put("Room" + i, room);
            if (lastRoom != null) {
                lastRoom.addExit("next", room);
            }
            lastRoom = room;
        }

        assertEquals(1000, largeWorldModel.size());
    }
}