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
        System.out.print(PROMPT);
        String command = scanner.nextLine();
        command = command.replaceFirst(PROMPT, "");
        return command;
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to The Colossal KTH Adventure, the exciting new text based adventure game.");
        state.getCurrentRoom().lookAround();
        CommandParser.printHelpMessage();
    }

    private static void generateRoomsFromFile() {
        HashMap<String, Room> worldModel = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("rooms.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split(";");
                
                if (data[0].equals("Room"))
                    worldModel.put(data[1], new Room(data[2]));
                else if (data[0].equals("Exit"))
                    worldModel.get(data[1]).addExit(data[2], worldModel.get(data[3]));

                line = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error generating rooms from file: " + e.getMessage());
            System.exit(1);
        }

        state = new GameState(worldModel.get("start"));
    }
}

class GameState {
    private Room currentRoom;

    public GameState(Room startingRoom) {
        currentRoom = startingRoom;
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
        System.out.print("There are exits in the directions: ");
        for (String direction : exits.keySet())
            System.out.print(direction + " ");
        System.out.println();
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }
}

class CommandParser {

    public static void parse(String command, GameState state) {
        String[] args = command.split(" ");
        if (args[0].equals("go")) {
            handleGoCommand(args, state);
        } else {
            printHelpMessage();
        }
    }

    private static void handleGoCommand(String[] args, GameState state) {
        if (args.length > 1) {
            Room newRoom = state.getCurrentRoom().go(args[1]);
            if (newRoom != null) {
                state.setCurrentRoom(newRoom);
                newRoom.lookAround();
            }
        } else {
            System.out.println("Go where?");
        }
    }

    public static void printHelpMessage() {
        System.out.println("Commands:");
        System.out.println("go [direction] - Move to the room in the specified direction.");
        System.out.println("look - Look around in the current room.");
    }
}