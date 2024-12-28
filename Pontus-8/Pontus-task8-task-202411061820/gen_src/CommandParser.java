import java.util.Map;
import java.util.HashMap;

public class CommandParser {
    private static final Map<String, Command> commands = new HashMap<>();

    static {
        // Initialization block for commands map
    }

    public static void parse(String commandLine, GameState state) {
        // Method signature for parse
    }

    private static void executeGo(String[] words, GameState state) {
        // Method signature for executeGo
    }

    public static void printHelpMessage() {
        // Method signature for printHelpMessage
    }

    private enum Command {
        GO, LOOK, HELP
    }
}