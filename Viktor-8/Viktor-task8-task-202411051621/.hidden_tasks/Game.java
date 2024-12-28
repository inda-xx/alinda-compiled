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
        System.out.print(PROMPT);
        String command = scanner.nextLine();
        return command.replaceFirst(PROMPT, "");
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to The Colossal KTH Adventure, the exciting new text-based adventure game.");
        state.getCurrentRoom().lookAround();
        CommandParser.printHelpMessage();
    }

    private static void generateRoomsFromFile(String filename) {
        HashMap<String, Room> worldModel = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data[0].equals("Room"))
                    worldModel.put(data[1], new Room(data[1], data[2]));
                else if (data[0].equals("Exit"))
                    worldModel.get(data[1]).addExit(data[2], worldModel.get(data[3]));
            }
        } catch (IOException e) {
            System.err.println("Error generating rooms from file: " + e.getMessage());
            System.exit(1);
        }

        state = new GameState(worldModel.entrySet().iterator().next().getValue()); // Assuming the first room read is the starting room
    }
}