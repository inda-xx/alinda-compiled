import java.util.Set;

public class GameState {
    private Room currentRoom;
    private int timeLeft;
    private static final int MAX_TIME = 10;
    private Room restroom;

    public GameState(Room startingRoom) {
        this.currentRoom = startingRoom;
        this.timeLeft = MAX_TIME;
        this.restroom = startingRoom;  // Set your restroom endpoint here
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void decrementTime() {
        timeLeft--;
        if (timeLeft <= 0) {
            System.out.println("Time has run out!");
        }
    }

    public boolean hasWon() {
        return currentRoom.equals(restroom) && timeLeft > 0;
    }

    public boolean hasLost() {
        return timeLeft <= 0 && !hasWon();
    }
}