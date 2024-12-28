
public class GameState {

    private Room currentRoom;
    private RepairTool holdingRepairTool;
    private int objectiveAmount;
    private int completedObjectives;
    private boolean failed;


    public GameState(Room startingRoom) {
        this.currentRoom = startingRoom;
        objectiveAmount = 0;
        completedObjectives = 0;
        holdingRepairTool = null;
        failed = false;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public RepairTool getHoldingRepairTool() {
        return holdingRepairTool;
    }

    public void setHoldingRepairTool(RepairTool newRepairTool) {
        holdingRepairTool = newRepairTool;
    }

    public void dropHoldingRepairTool() {
        holdingRepairTool = null;
    }

    public int getObjectiveAmount() {
        return objectiveAmount;
    }

    public void addObjectiveAmount() {
        objectiveAmount++;
    }

    public int getCompletedObjectives() {
        return completedObjectives;
    }

    public void addCompletedObjectives() {
        completedObjectives++;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public boolean isFailed() {
        return failed;
    }


}