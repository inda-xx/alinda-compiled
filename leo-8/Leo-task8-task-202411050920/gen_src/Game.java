// Game.java
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private static GameState state;
    private static Scanner scanner;
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        // Main game loop
    }

    private static String getCommand() {
        // Method to get user command
        return null;
    }

    private static void printWelcomeMessage() {
        // Method to print the welcome message
    }

    private static void generateRoomsFromFile() {
        // Method to generate rooms from a file
    }
} 

// CommandParser.java
public class CommandParser {
    public static void parse(String command, GameState state) {
        // Method to parse user command
    }

    public static void printHelpMessage() {
        // Method to print help message
    }
}

// GameState.java
public class GameState {
    public GameState(Room startRoom) {
        // Constructor for GameState
    }

    public Room getCurrentRoom() {
        // Method to get the current room
        return null;
    }
}

// Room.java
public class Room {
    public Room(String description) {
        // Constructor for Room
    }

    public void lookAround() {
        // Method to look around in the room
    }

    public void addExit(String direction, Room room) {
        // Method to add an exit to the room
    }
}