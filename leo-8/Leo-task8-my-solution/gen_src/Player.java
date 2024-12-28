import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Representerar spelaren i spelet.
 * Spelaren har ett namn, poäng, en position och ett aktuellt rum.
 */
public class Player {
    private String name;
    private int score;
    private int positionX, positionY;
    private Room currentRoom;

    /**
     * Skapar en ny spelare med angivet namn, poäng och startposition.
     * @param name spelarens namn
     * @param score spelarens startpoäng
     * @param positionX spelarens startposition på X-axeln
     * @param positionY spelarens startposition på Y-axeln
     */
    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
        this.currentRoom = null;
    }

    /**
     * Lägger till poäng till spelarens nuvarande poäng och visar den uppdaterade poängen.
     * @param points antal poäng att lägga till
     */
    public void addScore(int points) {
        this.score += points;
        System.out.println("Din poäng har uppdaterats! Aktuell poäng: " + this.score);
    }

    /**
     * Hämtar spelarens aktuella poäng.
     * @return spelarens poäng
     */
    public int getScore() {
        return score;
    }

    /**
     * Uppdaterar högsta poäng i filen scores.txt om spelarens nuvarande poäng
     * är högre än det tidigare högsta poänget.
     * Visar även meddelande om spelaren har satt nytt rekord.
     */
    public void updateHighScore() {
        try (BufferedReader br = new BufferedReader(new FileReader("scores.txt"))) {
            String line = br.readLine();
            int highScore = (line != null) ? Integer.parseInt(line) : 0;

            if (this.score > highScore) {
                System.out.println("Grattis! Du har satt ett nytt högsta poäng!");
                try (PrintWriter pw = new PrintWriter(new FileWriter("scores.txt"))) {
                    pw.println(this.score);
                }
            } else {
                System.out.println("Högsta poäng: " + highScore);
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Fel vid läsning eller uppdatering av högsta poäng: " + e.getMessage());
        }
    }

    /**
     * Skapar en ny spelare från data i en angiven fil.
     * Filen ska innehålla namn, poäng, X-position och Y-position på separata rader.
     * @param filePath sökvägen till filen som innehåller spelarens data
     * @return en ny instans av Player eller null om ett fel inträffade
     */
    public static Player fromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String name = br.readLine();
            int score = Integer.parseInt(br.readLine());
            int positionX = Integer.parseInt(br.readLine());
            int positionY = Integer.parseInt(br.readLine());
            return new Player(name, score, positionX, positionY);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Fel vid läsning av spelardata från fil: " + e.getMessage());
            return null;
        }
    }

    /**
     * Flyttar spelaren inom det aktuella rummet baserat på angivna förskjutningar.
     * Om flytten ligger utanför rummets gränser visas ett varningsmeddelande.
     * @param deltaX antal steg att flytta på X-axeln
     * @param deltaY antal steg att flytta på Y-axeln
     */
    public void move(int deltaX, int deltaY) {
        int newX = positionX + deltaX;
        int newY = positionY + deltaY;

        if (currentRoom != null && newX >= 0 && newX < currentRoom.getWidth() &&
            newY >= 0 && newY < currentRoom.getHeight()) {
            positionX = newX;
            positionY = newY;
            System.out.println("Spelaren har flyttat till position (" + positionX + ", " + positionY + ")");
        } else {
            System.out.println("Du kan inte flytta utanför rummets gränser.");
        }
    }

    /**
     * Hämtar spelarens nuvarande rum.
     * @return spelarens aktuella rum
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Sätter spelarens aktuella rum.
     * @param room rummet som spelaren ska placeras i
     */
    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    /**
     * Hämtar spelarens aktuella X-position.
     * @return spelarens X-position
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * Hämtar spelarens aktuella Y-position.
     * @return spelarens Y-position
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * Uppdaterar spelarens poäng med ett specifikt värde.
     * @param deltaScore poäng att lägga till eller dra ifrån
     */
    public void updateScore(int deltaScore) {
        this.score += deltaScore;
    }

    /**
     * Hämtar spelarens namn.
     * @return spelarens namn
     */
    public String getName() {
        return name;
    }
}