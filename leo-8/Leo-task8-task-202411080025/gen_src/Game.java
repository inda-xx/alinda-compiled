// File: Game.java
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
        }
    }

    private static String getCommand() {
        return null;
    }

    private static void printWelcomeMessage() {
    }

    private static void generateRoomsFromFile() {
    }
}

// The following classes and methods are assumed to be defined elsewhere,
// but their declarations are not provided in the given code and thus
// are not included here:
class GameState {
    public GameState(Room startRoom, Enemy[] enemies) {}
}

class Room {
    public Room(String description) {}
    public void addExit(String direction, Room room) {}
    public void lookAround() {}
}

class Enemy {
}