public class CommandParser {

    public static void parse(String command, GameState state) {
        String[] parts = command.split(" ");
        String action = parts[0];
        String target = parts.length > 1 ? parts[1] : "";

        switch (action) {
            case "go":
                Room newRoom = state.getCurrentRoom().go(target);
                if (newRoom != null)
                    state.setCurrentRoom(newRoom);
                break;
            case "look":
                state.getCurrentRoom().lookAround();
                break;
            default:
                System.out.println("Unknown command: " + command);
                printHelpMessage();
                break;
        }
    }

    public static void printHelpMessage() {
        System.out.println("Available commands: go [direction], look");
    }
}