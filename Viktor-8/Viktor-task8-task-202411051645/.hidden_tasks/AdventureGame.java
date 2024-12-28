import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
        System.out.print(PROMPT);
        return scanner.nextLine().trim();
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to the Adventure Game!");
        gameState.getCurrentRoom().lookAround();
        CommandParser.printHelpMessage();
    }

    private static void generateRoomsFromFile(String filename) {
        HashMap<String, Room> worldModel = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data[0].equals("Room")) {
                    worldModel.put(data[1], new Room(data[2]));
                } else if (data[0].equals("Exit")) {
                    worldModel.get(data[1]).addExit(data[2], worldModel.get(data[3]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error generating rooms from file: " + e.getMessage());
            System.exit(1);
        }

        gameState = new GameState(worldModel.get("Start"));
    }
}

class GameState {
    private Room currentRoom;

    public GameState(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}

class Room {

    private Map<String, Room> exits = new HashMap<>();
    private String description;

    public Room(String description) {
        this.description = description;
    }

    public void addExit(String direction, Room toRoom) {
        exits.put(direction, toRoom);
    }

    public Room go(String direction) {
        Room newRoom = exits.get(direction);
        if (newRoom == null) {
            System.out.println("You can't go that way!");
            printExits();
        }
        return newRoom;
    }

    public void printExits() {
        System.out.print("Exits: ");
        for (String direction : exits.keySet()) {
            System.out.print(direction + " ");
        }
        System.out.println();
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }
}

class CommandParser {

    public static void parse(String command, GameState state) {
        // Implement command parsing logic here
    }

    public static void printHelpMessage() {
        System.out.println("Available commands: look, go [direction], help");
    }
}