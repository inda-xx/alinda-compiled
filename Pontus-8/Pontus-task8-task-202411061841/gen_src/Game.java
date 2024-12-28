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
        // Implementation details removed
    }

    private static void generateRoomsFromFile(String filename) {
        HashMap<String, Room> worldModel = new HashMap<>();
        // Implementation details removed
    }
}