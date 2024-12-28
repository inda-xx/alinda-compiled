package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Mock
    private GameState mockState;
    @Mock
    private Room mockRoom;
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        System.setOut(new PrintStream(outContent));
    }
    
    @Test
    public void testPrintWelcomeMessage() {
        when(mockState.getCurrentRoom()).thenReturn(mockRoom);
        
        Game game = new Game();
        Game.state = mockState;
        
        game.printWelcomeMessage();
        
        // Verify that lookAround and printHelpMessage were called
        verify(mockRoom, times(1)).lookAround();
        
        String expectedOutput = "Welcome to The Colossal KTH Adventure, the exciting new text-based adventure game.\n";
        assertTrue(outContent.toString().contains(expectedOutput));
    }

    @Test
    public void testGenerateRoomsFromFileValid() throws Exception {
        String testRoomsData = "Room;start;Starting Room\nExit;start;north;room1\nRoom;room1;Room 1\n";
        try (InputStream in = new ByteArrayInputStream(testRoomsData.getBytes())) {
            System.setIn(in);
            Game game = new Game();
            game.generateRoomsFromFile();
            
            GameState currentState = Game.state;
            assertNotNull(currentState);
            Room startRoom = currentState.getCurrentRoom();
            assertNotNull(startRoom);
            assertEquals("Starting Room", startRoom.description);
            Room northRoom = startRoom.go("north");
            assertNotNull(northRoom);
            assertEquals("Room 1", northRoom.description);
        } finally {
            System.setIn(System.in);
        }
    }

    @Test
    public void testGenerateRoomsFromFileInvalid() {
        String invalidData = "InvalidData";
        try (InputStream in = new ByteArrayInputStream(invalidData.getBytes())) {
            System.setIn(in);
            Game game = new Game();
            game.generateRoomsFromFile();
            fail("Expected IOException");
        } catch (Exception e) {
            assertTrue(e instanceof IOException);
        } finally {
            System.setIn(System.in);
        }
    }

    @Test
    public void testGetCommand() throws Exception {
        String expectedCommand = "north";
        try (InputStream input = new ByteArrayInputStream((Game.PROMPT + expectedCommand).getBytes())) {
            System.setIn(input);
            Game game = new Game();
            String command = game.getCommand();
            assertEquals(expectedCommand, command);
        } finally {
            System.setIn(System.in);
        }
    }
}

