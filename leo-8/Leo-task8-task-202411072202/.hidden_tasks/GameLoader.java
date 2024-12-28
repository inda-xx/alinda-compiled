import java.util.List;
import java.util.ArrayList;

public class GameLoader {
    public static void main(String[] args) {
        String playerFileName = "players.csv";
        String enemyFileName = "enemies.csv";
        List<Player> players = loadPlayersFrom(playerFileName);
        List<Enemy> enemies = loadEnemiesFrom(enemyFileName);

        System.out.println("Players loaded:");
        for (Player player : players) {
            System.out.println(player);
        }

        System.out.println("Enemies loaded:");
        for (Enemy enemy : enemies) {
            System.out.println(enemy);
        }
    }

    private static List<Player> loadPlayersFrom(String fileName) {
        List<Player> players = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // Skip the header line
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0].trim();
                String name = data[1].trim();
                int health = Integer.parseInt(data[2].trim());
                int attackPower = Integer.parseInt(data[3].trim());
                players.add(new Player(id, name, health, attackPower));
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number from file " + fileName + ": " + e.getMessage());
        }
        return players;
    }

    private static List<Enemy> loadEnemiesFrom(String fileName) {
        List<Enemy> enemies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // Skip the header line
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0].trim();
                String name = data[1].trim();
                int health = Integer.parseInt(data[2].trim());
                int attackPower = Integer.parseInt(data[3].trim());
                enemies.add(new Enemy(id, name, health, attackPower));
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number from file " + fileName + ": " + e.getMessage());
        }
        return enemies;
    }
}