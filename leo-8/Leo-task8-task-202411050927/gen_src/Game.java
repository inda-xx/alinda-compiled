// Game.java
import java.util.Scanner;
import java.util.HashMap;

public class Game {
    private static GameState state;
    private static Scanner scanner;
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        generateRoomsFromFile();
    }

    private static String getCommand() {
        return null;
    }

    private static void printWelcomeMessage() {
    }

    private static void generateRoomsFromFile() {
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
import java.util.Map;
import java.util.HashMap;

class Room {
    private Map<String, Room> exits;
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

    private static void handleGoCommand(String[] args, GameState state) {
    }

    public static void printHelpMessage() {
    }
}