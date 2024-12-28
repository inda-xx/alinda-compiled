// Room.java
import java.util.Map;
import java.util.HashMap;

public class Room {
    private Map<String, Room> exits;
    private String description;

    public Room(String description) {
        // Constructor
    }

    public void addExit(String direction, Room toRoom) {
        // Adds an exit direction to another room
    }

    public Room go(String direction) {
        // Goes to the room in the specified direction, if possible
        return null;
    }

    public void printExits() {
        // Prints available exit directions
    }

    public void lookAround() {
        // Prints the room's description and exits
    }
}