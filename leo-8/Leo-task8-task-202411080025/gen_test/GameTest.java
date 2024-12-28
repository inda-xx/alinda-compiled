package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private GameState gameState;
    private Room initialRoom;
    private Player player;
    private Enemy[] enemies;

    @Before
    public void setUp() {
        // Setting up initial game conditions
        initialRoom = new Room("This is a starting room with one exit.");
        player = new Player("Hero", 0, 0, 0);
        enemies = new Enemy[0];
        gameState = new GameState(player, enemies);
    }

    @Test
    public void testRoomExitCreationAndTraversal() {
        Room nextRoom = new Room("This is the next room you enter.");
        initialRoom.addExit("north", nextRoom);

        Room result = initialRoom.go("north");

        assertEquals("The room traversed to should be the nextRoom", nextRoom, result);
    }

    @Test
    public void testRoomTraversalInvalidDirection() {
        initialRoom.addExit("north", new Room("North room"));

        Room result = initialRoom.go("south");

        assertNull("When going in an invalid direction, result should be null", result);
    }

    @Test
    public void testWelcomeMessageAndStartRoom() {
        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));

        Game.main(new String[]{});

        String expectedOutput = "Welcome to The Colossal KTH Adventure!\n";
        assertTrue("Welcome message should be printed at the start",
                outputContent.toString().contains(expectedOutput));
    }

    @Test
    public void testRoomExitsPrintCorrectly() {
        initialRoom.addExit("east", new Room("East room"));
        initialRoom.addExit("west", new Room("West room"));

        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));

        initialRoom.printExits();

        String expectedOutput = "There are exits in the directions: east west \n";
        assertEquals("The exits should be printed correctly", expectedOutput, outputContent.toString());
    }

    @Test
    public void testRoomDescriptionPrinting() {
        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));

        initialRoom.lookAround();

        String expectedOutput = "This is a starting room with one exit.\nThere are exits in the directions: \n";
        assertEquals("The room description should be printed with available exits", expectedOutput, outputContent.toString());
    }

    @Test
    public void testPlayerInitializationFromFile() {
        try {
            String playerData = "John,10,5,5\n";
            File tempFile = File.createTempFile("player", "txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            writer.write(playerData);
            writer.close();

            Player playerFromFile = Player.fromFile(tempFile.getAbsolutePath());

            assertNotNull("Player should be created successfully from file data", playerFromFile);
            assertEquals("The player's name should be John", "John", playerFromFile.getName());
            assertEquals("The player's score should be 10", 10, playerFromFile.getScore());
            assertEquals("The player's X position should be 5", 5, playerFromFile.getPositionX());
            assertEquals("The player's Y position should be 5", 5, playerFromFile.getPositionY());

            tempFile.delete();
        } catch (IOException e) {
            fail("Test setup failed due to IOException: " + e.getMessage());
        }
    }

    @Test
    public void testEnemyInitializationFromFile() {
        try {
            String enemyData = "Goblin,100,10,10\n";
            File tempFile = File.createTempFile("enemy", "txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            writer.write(enemyData);
            writer.close();

            Enemy enemyFromFile = Enemy.fromFile(tempFile.getAbsolutePath());

            assertNotNull("Enemy should be created successfully from file data", enemyFromFile);
            assertEquals("The enemy's type should be Goblin", "Goblin", enemyFromFile.getType());
            assertEquals("The enemy's health should be 100", 100, enemyFromFile.getHealth());

            tempFile.delete();
        } catch (IOException e) {
            fail("Test setup failed due to IOException: " + e.getMessage());
        }
    }
    
    @After
    public void tearDown() {
        System.setOut(null);
    }

    // Further tests would include additional GameState and Player logic validation, edge cases, null checks, and file I/O error handling.

}