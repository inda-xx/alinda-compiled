import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private static GameState state;
    private static Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        generateRoomsFromFile("rooms.txt");
        printWelcomeMessage();

        // Main game loop
        while (true) {
            String command = getCommand();
            CommandParser.parse(command, state);
            if (state.hasWon() || state.hasLost()) {
                break;
            }
        }
        
        if (state.hasWon()) {
            System.out.println("Congratulations! You found the restroom in time!");
        } else {
            System.out.println("You couldn't reach the restroom in time!");
        }
    }

    private static String getCommand() {
        System.out.print(PROMPT);
        String command = scanner.nextLine();
        return command.replaceFirst(PROMPT, "");
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to The Colossal KTH Adventure!");
        state.getCurrentRoom().lookAround();
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
                    Room fromRoom = worldModel.get(data[1]);
                    Room toRoom = worldModel.get(data[3]);
                    if (fromRoom != null && toRoom != null) {
                        fromRoom.addExit(data[2], toRoom);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error generating rooms from file: " + e.getMessage());
            System.exit(1);
        }

        state = new GameState(worldModel.get("MainHall"));
    }
}