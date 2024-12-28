public class Player {
    private int score;
    private Room currentRoom;

    public Player(Room startingRoom) {
        this.score = 0;
        this.currentRoom = startingRoom;
    }

    public int getScore() {
        return score;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void addScore(int points) {
        this.score += points;
    }
}