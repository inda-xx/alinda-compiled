Game.java
```java
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
        // Method to get command from user
    }

    private static void printWelcomeMessage() {
        // Method to print welcome message
    }

    private static void generateRoomsFromFile() {
        // Method to generate rooms from a file
    }
}
```

CommandParser.java (assuming this is an existing class given that it's referenced in Game.java)
```java
public class CommandParser {
    public static void parse(String command, GameState state) {
        // Method to parse commands
    }
  
    public static void printHelpMessage() {
        // Method to print help message
    }
}
```

GameState.java (assuming this is an existing class in the project)
```java
public class GameState {
    // Class GameState
    public GameState(Room room) {
        // Constructor
    }

    public Room getCurrentRoom() {
        // Method to get the current room
    }
}
```

Room.java (assuming this is an existing class in the project)
```java
import java.util.Map;

public class Room {
    public Room(String description) {
        // Constructor
    }

    public void addExit(String direction, Room room) {
        // Method to add an exit to the room
    }

    public void lookAround() {
        // Method for looking around the room
    }
}
```