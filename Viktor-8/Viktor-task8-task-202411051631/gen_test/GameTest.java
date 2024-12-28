package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Before
    public void setup() throws IOException {
        // Prepare a temporary rooms.txt file for testing
        try (PrintWriter writer = new PrintWriter(new FileWriter("rooms.txt"))) {
            writer.println("Room;start;This is the starting room.");
            writer.println("Room;room1;This is room 1.");
            writer.println("Exit;start;north;room1");
        }
    }

    @Test
    public void testGenerateRoomsFromFile() {
        // Initialize rooms using method
        Game.main(null);

        // Validate initial state
        GameState state = getStateViaReflection();
        Room currentRoom = state.getCurrentRoom();
        assertEquals("This is the starting room.", getDescriptionViaReflection(currentRoom));
    }

    @Test
    public void testUnknownCommand() {
        // Simulate an unknown command
        ByteArrayInputStream in = new ByteArrayInputStream("unknown".getBytes());
        System.setIn(in);

        // Catch the console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Game.main(null);

        // Check if unknown command message was printed
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Unknown command: unknown"));
    }

    @Test
    public void testCommand_go_valid() {
        // Simulate valid 'go north' command
        ByteArrayInputStream in = new ByteArrayInputStream("go north".getBytes());
        System.setIn(in);

        // Prepare to capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Game.main(null);

        // Validate that room changed
        GameState state = getStateViaReflection();
        Room currentRoom = state.getCurrentRoom();
        assertEquals("This is room 1.", getDescriptionViaReflection(currentRoom));
    }

    @Test
    public void testCommand_go_invalid() {
        // Simulate invalid 'go south' command
        ByteArrayInputStream in = new ByteArrayInputStream("go south".getBytes());
        System.setIn(in);

        // Prepare to capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Game.main(null);

        // Validate that room didn't change and error message displayed
        GameState state = getStateViaReflection();
        Room currentRoom = state.getCurrentRoom();
        assertEquals("This is the starting room.", getDescriptionViaReflection(currentRoom));
        assertTrue(out.toString().contains("You can't go that way!"));
    }

    @Test
    public void testCommand_look() {
        // Simulate 'look' command
        ByteArrayInputStream in = new ByteArrayInputStream("look".getBytes());
        System.setIn(in);

        // Prepare to capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Game.main(null);

        // Validate that room description is printed
        assertTrue(out.toString().contains("This is the starting room."));
    }

    // Helper method to retrieve GameState via reflection
    private GameState getStateViaReflection() {
        try {
            var field = Game.class.getDeclaredField("state");
            field.setAccessible(true);
            return (GameState) field.get(Game.class);
        } catch (Exception e) {
            fail("Failed to retrieve state: " + e.getMessage());
            return null;
        }
    }

    // Helper method to get room description via reflection
    private String getDescriptionViaReflection(Room room) {
        try {
            var field = Room.class.getDeclaredField("description");
            field.setAccessible(true);
            return (String) field.get(room);
        } catch (Exception e) {
            fail("Failed to get room description: " + e.getMessage());
            return null;
        }
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

