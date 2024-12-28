import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Room {
    private String name;
    private String description;
    private Map<String, Room> exits = new HashMap<>();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addExit(String direction, Room toRoom) {
        exits.put(direction, toRoom);
    }

    public Room go(String direction) {
        Room newRoom = exits.get(direction);
        if (newRoom == null) {
            System.out.println("You can't go that way!");
            printExits();
        }
        return newRoom;
    }

    public void printExits() {
        System.out.print("There are exits in the directions: ");
        for (String direction : exits.keySet())
            System.out.print(direction + " ");
        System.out.println();
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }
}