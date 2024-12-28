// Game.java
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private static GameState state;
    private static Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        generateRoomsFromFile();
        printWelcomeMessage();

        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
        }
    }

    private static String getCommand() {
        // Implementation detail removed
        return null; 
    }

    private static void printWelcomeMessage() {
        // Implementation detail removed
    }

    private static void generateRoomsFromFile() {
        // Implementation detail removed
    }
}

// GameState, Room, CommandParser, and any other necessary classes should be defined in their respective files with appropriate method signatures.