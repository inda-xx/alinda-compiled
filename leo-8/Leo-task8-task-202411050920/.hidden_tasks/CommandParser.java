public class CommandParser {
    public static void parse(String command, GameState state) {
        // Basic command parsing logic, e.g., movement or interaction commands
        Room current = state.getCurrentRoom();
        Room nextRoom = current.go(command);
        if (nextRoom != null) {
            state.setCurrentRoom(nextRoom);
            nextRoom.lookAround();
        }
    }

    public static void printHelpMessage() {
        System.out.println("Type a direction to move (e.g., 'north', 'south').");
        System.out.println("Type 'exit' to quit the game.");
    }
}