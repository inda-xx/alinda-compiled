import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        game.checkRunningStatus();
        game.trackLaps(5);
        game.trackProgress(500);
        game.trackProgress(5.5);
    }

    // Simulates the character running until an obstacle is encountered
    public void checkRunningStatus() {
        int distanceCovered = 0;
        boolean running = true;
        Random random = new Random();

        while (running) {
            distanceCovered++;
            boolean obstacleAppears = random.nextInt(100) < 5; // 5% chance of an obstacle
            if (obstacleAppears) {
                running = false;
                System.out.println("Obstacle encountered! Run stopped.");
            }
        }
        System.out.println("Total distance covered: " + distanceCovered);
    }

    // Tracks the number of laps completed
    public void trackLaps(int totalLaps) {
        for (int lap = 1; lap <= totalLaps; lap++) {
            System.out.println("Starting lap: " + lap);
            // Simulate lap time or conditions
            System.out.println("Completed lap: " + lap);
        }
    }

    // Overloaded methods to track progress based on distance
    public void trackProgress(int distance) {
        System.out.println("Tracking progress based on distance: " + distance + " units.");
        // Logic for distance-based tracking can be added here
    }

    // Overloaded methods to track progress based on time
    public void trackProgress(double time) {
        System.out.println("Tracking progress based on time: " + time + " hours.");
        // Logic for time-based tracking can be added here
    }
}