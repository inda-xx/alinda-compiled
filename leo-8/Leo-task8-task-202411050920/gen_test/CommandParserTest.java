package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandParserTest {

    @Mock
    private GameState mockState;
    @Mock
    private Room mockRoom;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        System.setOut(new PrintStream(outContent));
        when(mockState.getCurrentRoom()).thenReturn(mockRoom);
    }

    @Test
    public void testParseValidCommand() {
        Room newRoom = new Room("Next Room");
        when(mockRoom.go("north")).thenReturn(newRoom);

        CommandParser.parse("north", mockState);

        verify(mockState).setCurrentRoom(newRoom);
        assertTrue(outContent.toString().contains("Next Room"));
    }

    @Test
    public void testParseInvalidCommand() {
        when(mockRoom.go("invalid")).thenReturn(null);

        CommandParser.parse("invalid", mockState);

        assertTrue(outContent.toString().contains("You can't go that way!"));
        verify(mockRoom).printExits();
    }
}

