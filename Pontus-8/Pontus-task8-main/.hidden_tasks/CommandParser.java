public class CommandParser {
    public static void parse(String command, GameState state) {
        String[] words = command.split(" ");
        
        if (words[0].equalsIgnoreCase("go") && words.length > 1) {
            Room nextRoom = state.getCurrentRoom().go(words[1]);
            if (nextRoom != null) {
                state.setCurrentRoom(nextRoom);
                state.getCurrentRoom().lookAround();
                state.decrementTime();
            }
        } else if (words[0].equalsIgnoreCase("look")) {
            state.getCurrentRoom().lookAround();
        } else if (words[0].equalsIgnoreCase("hint")) {
            System.out.println(state.getCurrentRoom().provideHint());
        } else {
            printHelpMessage();
        }
    }

    public static void printHelpMessage() {
        System.out.println("You can use commands: 'go [direction]', 'look', 'hint'. Try to find the restroom!");
    }
}