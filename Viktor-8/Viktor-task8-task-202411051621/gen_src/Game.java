// File: Game.java

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private static GameState state;
    private static Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        generateRoomsFromFile("rooms.txt");
        printWelcomeMessage();

        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
        }
    }

    private static String getCommand() {
        // Implementation of getting command
        return ""; // Placeholder return
    }

    private static void printWelcomeMessage() {
        // Implementation of printing welcome message
    }

    private static void generateRoomsFromFile(String filename) {
        // Implementation of room generation from file
    }
}

// File: GameState.java

public class GameState {
    public GameState(Room startingRoom) {
        // Constructor implementation
    }

    public Room getCurrentRoom() {
        // Implementation of getting current room
        return null; // Placeholder return
    }
}

// File: Room.java

public class Room {
    public Room(String name, String description) {
        // Constructor implementation
    }

    public void lookAround() {
        // Implementation of looking around in the room
    }

    public void addExit(String direction, Room room) {
        // Implementation of adding an exit to the room
    }
}

// File: CommandParser.java

public class CommandParser {
    public static void parse(String command, GameState state) {
        // Implementation of command parsing
    }

    public static void printHelpMessage() {
        // Implementation of printing help message
    }
}