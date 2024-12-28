import java.util.Map;
import java.util.HashMap;

public class CommandParser {
    private static final Map<String, Command> commands = new HashMap<>();

    static {
        commands.put("go", Command.GO);
        commands.put("look", Command.LOOK);
        commands.put("help", Command.HELP);
        // Additional commands can be added here
    }

    public static void parse(String commandLine, GameState state) {
        String[] words = commandLine.split(" ");
        String commandWord = words[0];
        
        Command command = commands.get(commandWord);
        if (command != null) {
            switch (command) {
                case GO:
                    executeGo(words, state);
                    break;
                case LOOK:
                    state.getCurrentRoom().lookAround();
                    break;
                case HELP:
                    printHelpMessage();
                    break;
                default:
                    System.out.println("Command not implemented.");
            }
        } else {
            System.out.println("Unknown command.");
        }
    }

    private static void executeGo(String[] words, GameState state) {
        if (words.length < 2) {
            System.out.println("Go where?");
            return;
        }
        Room newRoom = state.getCurrentRoom().go(words[1]);
        if (newRoom != null) {
            state.setCurrentRoom(newRoom);
            newRoom.lookAround();
        }
    }

    public static void printHelpMessage() {
        System.out.println("Available commands: go <direction>, look, help");
    }

    private enum Command {
        GO, LOOK, HELP
    }
}