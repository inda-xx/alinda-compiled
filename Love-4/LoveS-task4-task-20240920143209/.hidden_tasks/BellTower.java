public class BellTower {

    // Exercise 2.1: Ring the bell until dawn
    public void ringUntilDawn() {
        int tollCount = 0;
        while (tollCount < 10800) { // 10800 times representing until dawn
            System.out.println("Ding, dong!");
            tollCount += 1;
        }
    }

    // Exercise 2.2: Increase tolls hourly
    public void ringHourlyToll() {
        for (int hour = 1; hour <= 12; hour++) { // Simulating a 12-hour nightly cycle
            for (int toll = 0; toll < hour; toll++) {
                System.out.println("Ding dong at hour: " + hour);
            }
        }
    }

    // Exercise 3: Function Overloading for custom toll
    public void customToll(int duration) {
        System.out.println("Tolling for " + duration + " seconds.");
    }

    public void customToll(int duration, String message) {
        System.out.println("Tolling: " + message + " for " + duration + " seconds.");
    }

    // Exercise 4: Time Simulation
    public void timeSimulation(int seconds) {
        int whileCount = 0;
        while (seconds > 0 && !isDawn(seconds)) {
            System.out.println("Seconds remaining: " + seconds);
            seconds--;
            whileCount++;
        }
    }

    private boolean isDawn(int seconds) {
        return seconds <= 0;
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