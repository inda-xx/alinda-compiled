import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Representerar en fiende i spelet.
 * En fiende har en typ, hälsa, position inom ett rum och kan interagera med spelaren.
 */
public class Enemy {
    private String type;
    private int health;
    private int positionX, positionY;
    private Room currentRoom;

    /**
     * Skapar en ny fiende med angiven typ, hälsa och position.
     * @param type fiendens typ (t.ex., "Bugg", "Examinator")
     * @param health fiendens startvärde på hälsa
     * @param positionX fiendens X-position i rummet
     * @param positionY fiendens Y-position i rummet
     */
    public Enemy(String type, int health, int positionX, int positionY) {
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
        this.currentRoom = null;
    }

    /**
     * Skapar en ny fiende genom att läsa fiendedata från en fil.
     * Filen ska innehålla typ, hälsa, X-position och Y-position på separata rader.
     * @param filePath sökvägen till filen som innehåller fiendens data
     * @return en ny instans av Enemy eller null om ett fel inträffar
     */
    public static Enemy fromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String type = br.readLine();
            int health = Integer.parseInt(br.readLine());
            int positionX = Integer.parseInt(br.readLine());
            int positionY = Integer.parseInt(br.readLine());
            return new Enemy(type, health, positionX, positionY);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Fel vid läsning av fiendedata från fil: " + e.getMessage());
            return null;
        }
    }

    /**
     * Interagerar med spelaren om spelaren befinner sig i samma rum och på samma position som fienden.
     * Om fiendens hälsa minskar till 0 eller mindre, besegras fienden och spelaren får bonuspoäng.
     * @param player spelaren som interagerar med fienden
     * @return true om en interaktion äger rum, annars false
     */
    public boolean interact(Player player) {
        if (currentRoom == player.getCurrentRoom() &&
            positionX == player.getPositionX() && positionY == player.getPositionY()) {

            player.updateScore(-10); // Spelaren förlorar poäng vid interaktion
            this.health -= 10;       // Fienden tar skada

            if (this.health <= 0) {
                player.addScore(10); // Spelaren får poäng för att ha besegrat fienden
                System.out.println("Du har besegrat " + this.type + "! +10 poäng.");
            }

            return true;
        }
        return false;
    }

    /**
     * Hämtar fiendens typ.
     * @return fiendens typ
     */
    public String getType() {
        return type;
    }

    /**
     * Hämtar fiendens aktuella hälsa.
     * @return fiendens hälsa
     */
    public int getHealth() {
        return health;
    }

    /**
     * Hämtar fiendens aktuella X-position.
     * @return fiendens X-position
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * Hämtar fiendens aktuella Y-position.
     * @return fiendens Y-position
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * Hämtar det aktuella rummet där fienden befinner sig.
     * @return fiendens aktuella rum
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Sätter fiendens aktuella rum.
     * @param room rummet där fienden ska placeras
     */
    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }
}