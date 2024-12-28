public class CommandParser {
    public static void parse(String command, GameState state) {
        if (command.equalsIgnoreCase("help")) {
            printHelpMessage();
        } else if (command.startsWith("go")) {
            String direction = command.substring(3);
            Room nextRoom = state.getCurrentRoom().go(direction);
            if (nextRoom != null) {
                state.setCurrentRoom(nextRoom);
                nextRoom.lookAround();
            }
        } else {
            System.out.println("Invalid command. Type 'help' for a list of commands.");
        }
    }

    public static void printHelpMessage() {
        System.out.println("Available commands:");
        System.out.println("go <direction> - Move in the specified direction");
        System.out.println("help - Show this help message");
    }
}