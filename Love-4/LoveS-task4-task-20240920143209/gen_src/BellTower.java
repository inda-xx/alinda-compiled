public class BellTower {

    // Exercise 2.1: Ring the bell until dawn
    public void ringUntilDawn() {
        // TODO: Implement this method.
    }

    // Exercise 2.2: Increase tolls hourly
    public void ringHourlyToll() {
        // TODO: Implement this method.
    }

    // Exercise 3: Function Overloading for custom toll
    public void customToll(int duration) {
        // TODO: Implement this method.
    }

    public void customToll(int duration, String message) {
        // TODO: Implement this method.
    }

    // Exercise 4: Time Simulation
    public void timeSimulation(int seconds) {
        // TODO: Implement this method.
    }

    private boolean isDawn(int seconds) {
        // TODO: Implement this method.
        return false;
    }

    public static void main(String[] args) {
        BellTower bellTower = new BellTower();

        // Test ringUntilDawn
        bellTower.ringUntilDawn();

        // Test ringHourlyToll
        bellTower.ringHourlyToll();

        // Test customToll overloads
        bellTower.customToll(5);
        bellTower.customToll(5, "Special occasion");

        // Test timeSimulation
        bellTower.timeSimulation(3600);
    }
}