import java.util.Map;
import java.util.HashMap;

/**
 * Representerar ett rum i spelet.
 * Varje rum har en beskrivning, storlek (bredd och höjd), och potentiella utgångar till andra rum.
 */
public class Room {
    private Map<String, Room> exits;
    private String description;
    private int width;
    private int height;

    /**
     * Skapar ett nytt rum med angiven beskrivning, bredd och höjd.
     * @param description rumsbeskrivning
     * @param width rummets bredd
     * @param height rummets höjd
     */
    public Room(String description, int width, int height) {
        this.description = description;
        this.width = width;
        this.height = height;
        this.exits = new HashMap<>();
    }

    /**
     * Lägger till en utgång från detta rum till ett annat rum i en specifik riktning.
     * @param direction riktningen för utgången (t.ex. "north", "south")
     * @param toRoom rummet som är anslutet i den angivna riktningen
     */
    public void addExit(String direction, Room toRoom) {
        exits.put(direction, toRoom);
    }

    /**
     * Flyttar spelaren till ett annat rum baserat på en angiven riktning.
     * @param direction riktningen som spelaren vill gå
     * @return nästa rum om utgången existerar, annars null om det inte finns en utgång i den riktningen
     */
    public Room go(String direction) {
        Room nextRoom = exits.get(direction);
        if (nextRoom == null) {
            System.out.println("Det finns ingen utgång i den riktningen.");
        }
        return nextRoom;
    }

    /**
     * Visar tillgängliga utgångar från rummet.
     * Exempel: "Available exits: north south"
     */
    public void printExits() {
        System.out.print("Available exits: ");
        for (String direction : exits.keySet()) {
            System.out.print(direction + " ");
        }
        System.out.println();
    }

    /**
     * Visar rummets beskrivning och listar alla tillgängliga utgångar.
     * Exempelvis: "You are in [rumsbeskrivning]. Available exits: [riktningar]"
     */
    public void lookAround() {
        System.out.println("You are in " + description);
        printExits();
    }

    /**
     * Hämtar rummets bredd.
     * @return rummets bredd i antal enheter
     */
    public int getWidth() {
        return width;
    }

    /**
     * Hämtar rummets höjd.
     * @return rummets höjd i antal enheter
     */
    public int getHeight() {
        return height;
    }

    /**
     * Hämtar rummets beskrivning.
     * @return en textbeskrivning av rummet
     */
    public String getDescription() {
        return description;
    }
}