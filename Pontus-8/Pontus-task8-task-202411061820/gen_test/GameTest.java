package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testRoomCreationFromValidFile() throws IOException {
        // Given
        String roomData = "Room;Living Room;A cozy living room.\n" +
                          "Room;Kitchen;A kitchen with modern appliances.\n" +
                          "Exit;Living Room;n;Kitchen\n" +
                          "Exit;Kitchen;s;Living Room\n";
        
        // When
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("testRooms.txt"))) {
            writer.write(roomData);
        }

        // Using reflection to access private method for testing
        Game game = new Game();
        Method method = Game.class.getDeclaredMethod("generateRoomsFromFile");
        method.setAccessible(true);

        // Validating side-effects is tricky without changing the design. 
        // Assume it modifies `state` variable correctly.
        method.invoke(game);

        GameState state = (GameState) getField(Game.class, "state", game);

        // Then
        assertNotNull(state);
        assertEquals("A cozy living room.", state.getCurrentRoom().getDescription());

        // Clean up
        new File("testRooms.txt").delete();
    }

    @Test
    public void testRoomCreationFromInvalidFile() throws IOException {
        // Preparing an invalid rooms file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("invalidRooms.txt"))) {
            writer.write("Invalid;Data\n");
        }

        // Capture System.out and System.err for validation
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        Game game = new Game();
        Method method = Game.class.getDeclaredMethod("generateRoomsFromFile");
        method.setAccessible(true);

        try {
            method.invoke(game);
            fail("Expected an exception due to invalid data.");
        } catch (InvocationTargetException e) {
            // Expected exception due to invalid file data
            assertTrue(errContent.toString().contains("Error generating rooms from file"));
        }

        // Clean-up
        new File("invalidRooms.txt").delete();
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testCommandParserGoValidRoom() {
        Room livingRoom = new Room("A cozy living room");
        Room kitchen = new Room("A kitchen with modern appliances");
        livingRoom.addExit("north", kitchen);

        GameState state = new GameState(livingRoom);
        CommandParser.parse("go north", state);

        assertEquals(kitchen, state.getCurrentRoom());
    }

    @Test
    public void testCommandParserGoInvalidRoom() {
        Room livingRoom = new Room("A cozy living room");
        GameState state = new GameState(livingRoom);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CommandParser.parse("go north", state);

        assertEquals(livingRoom, state.getCurrentRoom());
        assertTrue(outContent.toString().contains("You can't go that way!"));
        System.setOut(null);
    }

    @Test
    public void testCommandParserInvalidCommand() {
        Room livingRoom = new Room("A cozy living room");
        GameState state = new GameState(livingRoom);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CommandParser.parse("dance", state);

        assertTrue(outContent.toString().contains("Unknown command."));
        System.setOut(null);
    }

    @Test
    public void testRoomLookAround() {
        Room livingRoom = new Room("A cozy living room.");
        Room kitchen = new Room("A kitchen filled with modern appliances.");
        livingRoom.addExit("north", kitchen);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        livingRoom.lookAround();

        assertTrue(outContent.toString().contains("A cozy living room."));
        assertTrue(outContent.toString().contains("There are exits in the directions: north"));
        System.setOut(null);
    }

    @Test
    public void testPlayerInitializationAndScoreAddition() {
        Room livingRoom = new Room("A cozy living room.");
        Player player = new Player(livingRoom);

        assertEquals(0, player.getScore());
        assertEquals(livingRoom, player.getCurrentRoom());

        player.addScore(10);
        assertEquals(10, player.getScore());
    }

    private static Object getField(Class<?> clazz, String fieldName, Object instance) {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(instance);
        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot access field: " + fieldName, e);
        }
    }
}