// Room.java
import java.util.Map;
import java.util.HashMap;

public class Room {
    private Map<String, Room> exits;
    private String description;

    public Room(String description) {
        // Constructor logic
    }

    public void addExit(String direction, Room toRoom) {
        // Method logic
    }

    public Room go(String direction) {
        // Method logic
        return null;
    }

    public void printExits() {
        // Method logic
    }

    public void lookAround() {
        // Method logic
    }
}