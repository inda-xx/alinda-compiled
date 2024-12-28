package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTests {

    // Test for checking room setup from file
    @Test
    public void testGenerateRoomsFromFileValidData() throws Exception {
        String filename = "testRooms.txt";
        FileWriter writer = new FileWriter(filename);
        writer.write("Room;MainHall;Main hall of the house\n");
        writer.write("Room;Restroom;The Restroom\n");
        writer.write("Exit;MainHall;north;Restroom\n");
        writer.close();

        Game game = new Game();
        game.generateRoomsFromFile(filename);

        GameState state = game.getState();
        assertNotNull(state);
        Room mainHall = state.getCurrentRoom();
        assertEquals("Main hall of the house", mainHall.getDescription());

        Room restroom = mainHall.go("north");
        assertEquals("The Restroom", restroom.getDescription());

        // Delete the test file after testing
        new File(filename).delete();
    }

    @Test(expected = RuntimeException.class)
    public void testGenerateRoomsFromFileMissingRoom() throws Exception {
        String filename = "testRooms.txt";
        FileWriter writer = new FileWriter(filename);
        writer.write("Room;MainHall;Main hall of the house\n");
        writer.write("Exit;MainHall;north;NonExistingRoom\n");
        writer.close();

        Game game = new Game();
        game.generateRoomsFromFile(filename);
    }
    
    // Tests for command parser
    @Test
    public void testCommandParserGoValidDirection() {
        Room room = new Room("A room");
        Room nextRoom = new Room("Next room");
        room.addExit("north", nextRoom);

        GameState state = new GameState(room);
        CommandParser.parse("go north", state);
        assertEquals(nextRoom, state.getCurrentRoom());
    }

    @Test
    public void testCommandParserGoInvalidDirection() {
        Room room = new Room("A room");

        GameState state = new GameState(room);
        CommandParser.parse("go south", state);
        assertEquals(room, state.getCurrentRoom());
    }

    @Test
    public void testCommandParserLook() {
        Room room = new Room("A room");

        GameState state = new GameState(room);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CommandParser.parse("look", state);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("A room"));
    }

    @Test
    public void testCommandParserHint() {
        Room room = new Room("A room");
        GameState state = new GameState(room);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CommandParser.parse("hint", state);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("You feel like you're close!"));
    }

    // Test for game state transitions
    @Test
    public void testGameStateWinCondition() {
        Room restroom = new Room("Restroom");
        
        GameState state = new GameState(restroom);
        state.setCurrentRoom(restroom);
        
        assertTrue(state.hasWon());
        assertFalse(state.hasLost());
    }

    @Test
    public void testGameStateLoseCondition() {
        Room startRoom = new Room("Start Room");
        GameState state = new GameState(startRoom);

        for (int i = 0; i < GameState.MAX_TIME; i++) {
            state.decrementTime();
        }

        assertFalse(state.hasWon());
        assertTrue(state.hasLost());
    }

    // Test edge cases and invalid inputs
    @Test
    public void testRoomGoInvalidDirection() {
        Room room = new Room("Sample Room");
        Room result = room.go("west");
        assertNull(result);
    }

    @Test
    public void testRoomAddExitAndMove() {
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        room1.addExit("east", room2);

        Room result = room1.go("east");
        assertEquals(room2, result);
    }

    // Test Room description and exits
    @Test
    public void testRoomDescriptionAndExits() {
        Room room = new Room("Test Room");
        room.addExit("north", new Room("North Room"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        room.lookAround();
        
        String output = outputStream.toString();
        assertTrue(output.contains("Test Room"));
        assertTrue(output.contains("north"));
    }

    // Helper method to reset System.out
    private void resetSystemOut() {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }
}