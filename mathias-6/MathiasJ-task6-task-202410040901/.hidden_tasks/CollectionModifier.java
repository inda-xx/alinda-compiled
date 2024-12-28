import java.util.List;

public class CollectionModifier {

    public static void removeBankruptPlayers(List<String> players) {
        Iterator<String> iterator = players.iterator();
        
        while (iterator.hasNext()) {
            String player = iterator.next();
            // Assume a method isBankrupt(player) exists to check player's bank status
            if (isBankrupt(player)) {
                iterator.remove();
            }
        }
    }
    
    // Placeholder method for checking if a player is bankrupt
    private static boolean isBankrupt(String player) {
        // For demonstration, assume all players with a name length of 5 or shorter are bankrupt
        return player.length() <= 5;
    }
}

public abstract class Game {
    private String name;

    public void start() {
        System.out.println("Starting game: " + name);
    }

    public void end() {
        System.out.println("Ending game: " + name);
    }
}