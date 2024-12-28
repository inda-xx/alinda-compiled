public class CommandParser {
    public static void parse(String command, GameState state) {
        // Parsing logic here - For example, handle movement or actions.
        // Assume a simple command structure like "go north" or "look"
        String[] words = command.split(" ");
        if (words.length == 0) {
            return;
        }

        String action = words[0];
        if (action.equals("go") && words.length > 1) {
            String direction = words[1];
            Room nextRoom = state.getCurrentRoom().go(direction);
            if (nextRoom != null) {
                state.setCurrentRoom(nextRoom);
                nextRoom.lookAround();
            }
        } else if (action.equals("look")) {
            state.getCurrentRoom().lookAround();
        } else {
            System.out.println("Unknown command.");
        }
    }

    public static void printHelpMessage() {
        System.out.println("Available commands: go [direction], look");
    }
}