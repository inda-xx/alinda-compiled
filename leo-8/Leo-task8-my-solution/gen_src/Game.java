import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Huvudklassen för spelet KTH Adventure.
 * Game hanterar spelets start, kommandobearbetning, samt inläsning av rum och fiender från filer.
 */
public class Game {
    private static GameState state;
    private static Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";
    private static Map<String, Room> rooms = new HashMap<>();

    /**
     * Programstart för spelet. Laddar spelresurser, skapar spelaren och startar huvudloopen.
     * @param args kommandoradsargument (används ej)
     */
    public static void main(String[] args) {
        generateRoomsFromFile();
        Player player = Player.fromFile("player_data.txt");
        Enemy[] enemies = loadEnemiesFromFile("enemies.txt");

        // Starta spelet om spelaren och fienderna har laddats korrekt
        if (player != null && enemies != null) {
            player.setCurrentRoom(rooms.get("start"));
            state = new GameState(player, enemies);
            printWelcomeMessage();
            printHelp();

            // Huvudloop för spelet
            while (true) {
                String command = getCommand();
                processCommand(command);
            }
        } else {
            System.out.println("Fel vid laddning av spelets resurser.");
        }
    }

    /**
     * Läser spelarens kommandon från konsolen.
     * @return spelarens inmatade kommando
     */
    private static String getCommand() {
        System.out.print(PROMPT);
        return scanner.nextLine().trim();
    }

    /**
     * Skriver ut välkomstmeddelandet i början av spelet.
     */
    private static void printWelcomeMessage() {
        System.out.println("Välkommen till KTH ADVENTURE!");
    }

    /**
     * Skriver ut hjälpmeddelande som förklarar kommandona för spelaren.
     */
    private static void printHelp() {
        System.out.println("\n--- SPELANVISNINGAR ---");
        System.out.println("Här är kommandona du kan använda för att navigera och interagera i spelet:");
        System.out.println("go <direction> - Flytta till ett annat rum i angiven riktning (north, south, east, west).");
        System.out.println("move <deltaX> <deltaY> - Flytta till en specifik position inom rummet.");
        System.out.println("look - Inspektera rummet och se vilka utgångar som finns.");
        System.out.println("quit - Avsluta spelet.");
        System.out.println("help - Visa denna hjälptext.");
        System.out.println("\nAnvänd kommandona för att interagera med världen och utforska KTH.");
    }

    /**
     * Laddar rum från filen rooms.txt och skapar alla rummen med deras respektive utgångar.
     */
    private static void generateRoomsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("rooms.txt"))) {
            String line;

            // Skapar alla rum utan att sätta utgångar
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(";");

                if (parts.length < 4) {
                    System.out.println("Ignorerar ogiltig rad i rooms.txt: " + line);
                    continue;
                }

                String roomName = parts[0];
                String description = parts[1];
                int width = Integer.parseInt(parts[2]);
                int height = Integer.parseInt(parts[3]);
                Room room = new Room(description, width, height);
                rooms.put(roomName, room);
            }

            // Lägg till utgångar för alla rum
            try (BufferedReader br2 = new BufferedReader(new FileReader("rooms.txt"))) {
                while ((line = br2.readLine()) != null) {
                    String[] parts = line.split(";");
                    if (parts.length < 5) continue;

                    Room room = rooms.get(parts[0]);
                    for (int i = 4; i < parts.length; i += 2) {
                        String direction = parts[i];
                        Room connectedRoom = rooms.get(parts[i + 1]);
                        room.addExit(direction, connectedRoom);
                    }
                }
            }
            System.out.println("Rummen har genererats framgångsrikt.");

        } catch (IOException e) {
            System.out.println("Fel vid läsning av rum från fil: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Felaktigt format på bredd eller höjd i rooms.txt: " + e.getMessage());
        }
    }

    /**
     * Laddar fiender från filen enemies.txt och kopplar dem till deras respektive rum.
     * @param filePath sökvägen till filen som innehåller fiendernas data
     * @return en array med fiender som finns i spelet, eller null om ett fel inträffar
     */
    private static Enemy[] loadEnemiesFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int enemyCount = Integer.parseInt(br.readLine().trim());
            Enemy[] enemies = new Enemy[enemyCount];

            for (int i = 0; i < enemyCount; i++) {
                String type = br.readLine();
                String healthStr = br.readLine();
                String posXStr = br.readLine();
                String posYStr = br.readLine();
                String roomName = br.readLine();

                if (type == null || healthStr == null || posXStr == null || posYStr == null || roomName == null) {
                    System.out.println("Ofullständig data för fiende " + (i + 1));
                    return null;
                }

                int health = Integer.parseInt(healthStr.trim());
                int positionX = Integer.parseInt(posXStr.trim());
                int positionY = Integer.parseInt(posYStr.trim());
                Room enemyRoom = rooms.get(roomName.trim());

                if (enemyRoom == null) {
                    System.out.println("Fel: Rummet " + roomName + " för fiende " + type + " hittades inte.");
                    return null;
                }

                Enemy enemy = new Enemy(type.trim(), health, positionX, positionY);
                enemy.setCurrentRoom(enemyRoom);
                enemies[i] = enemy;
            }
            System.out.println("Fiender laddades framgångsrikt.");
            return enemies;

        } catch (IOException | NumberFormatException e) {
            System.out.println("Fel vid läsning av fiendedata från fil: " + e.getMessage());
            return null;
        }
    }

    /**
     * Bearbetar och utför kommandon inmatade av spelaren.
     * @param command spelarens kommando att utföra
     */
    private static void processCommand(String command) {
        if (state.getPlayer().getScore() <= 0) {
            System.out.println("Din hälsa är noll eller lägre. Du har förlorat spelet.");
            state.getPlayer().updateHighScore();
            System.exit(0);
        }

        switch (command.toLowerCase()) {
            case "look":
                state.getCurrentRoom().lookAround();
                break;
            case "quit":
                System.out.println("Avslutar spelet...");
                System.exit(0);
                break;
            case "help":
                printHelp();
                break;
            default:
                if (command.startsWith("go ")) {
                    String direction = command.substring(3);
                    Room nextRoom = state.getCurrentRoom().go(direction);
                    if (nextRoom != null) {
                        state.getPlayer().setCurrentRoom(nextRoom);
                        System.out.println("Du gick till " + nextRoom.getDescription());
                    } else {
                        System.out.println("Ingen utgång i den riktningen.");
                    }
                } else if (command.startsWith("move ")) {
                    String[] moveCommand = command.split(" ");
                    if (moveCommand.length == 3) {
                        try {
                            int deltaX = Integer.parseInt(moveCommand[1]);
                            int deltaY = Integer.parseInt(moveCommand[2]);
                            state.getPlayer().move(deltaX, deltaY);
                        } catch (NumberFormatException e) {
                            System.out.println("Ogiltigt kommando för flytt.");
                        }
                    } else {
                        System.out.println("Använd formatet: move <deltaX> <deltaY>");
                    }
                } else {
                    System.out.println("Ogiltigt kommando. Skriv 'help' för att se tillgängliga kommandon.");
                }
                break;
        }
        state.update();
    }
}