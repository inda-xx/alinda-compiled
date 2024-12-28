// Game.java
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
        // method body
        return null;
    }

    private static void printWelcomeMessage() {
        // method body
    }
    
    private static void generateRoomsFromFile() {
        // method body
    }
}

class GameState {
    // placeholder class definition
} 

class CommandParser {
    public static void parse(String command, GameState state) {
        // method body
    }

    public static void printHelpMessage() {
        // method body
    }
}

class Room {
    public Room(String description) {
        // constructor body
    }
  
    public void addExit(String direction, Room room) {
        // method body
    }

    public void lookAround() {
        // method body
    }
}