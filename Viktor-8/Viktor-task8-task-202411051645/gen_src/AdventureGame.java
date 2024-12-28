// AdventureGame.java
import java.util.Map;
import java.util.HashMap;

public class AdventureGame {

    private static GameState gameState;
    private static final String PROMPT = "> ";
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        generateRoomsFromFile("rooms.txt");
        printWelcomeMessage();

        while (true) {
            String command = getCommand();
            CommandParser.parse(command, gameState);
        }
    }

    private static String getCommand() {
        return null;
    }

    private static void printWelcomeMessage() {
    }

    private static void generateRoomsFromFile(String filename) {
    }
}

// GameState.java
class GameState {
    private Room currentRoom;

    public GameState(Room startingRoom) {
    }

    public Room getCurrentRoom() {
        return null;
    }

    public void setCurrentRoom(Room currentRoom) {
    }
}

// Room.java
class Room {

    private Map<String, Room> exits = new HashMap<>();
    private String description;

    public Room(String description) {
    }

    public void addExit(String direction, Room toRoom) {
    }

    public Room go(String direction) {
        return null;
    }

    public void printExits() {
    }

    public void lookAround() {
    }
}

// CommandParser.java
class CommandParser {

    public static void parse(String command, GameState state) {
    }

    public static void printHelpMessage() {
    }
}