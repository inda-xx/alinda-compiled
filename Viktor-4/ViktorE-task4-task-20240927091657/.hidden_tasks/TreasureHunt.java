import java.util.Map;

public class TreasureHunt {

    /**
     * Checks if a hintCode is valid. A valid hintCode is a number that is a multiple of 3 or 7,
     * but not both.
     *
     * @param hintCode the code to check
     * @return true if hintCode is valid, false otherwise
     */
    public boolean tryUnlockDoor(int hintCode) {
        boolean multipleOf3 = (hintCode % 3 == 0);
        boolean multipleOf7 = (hintCode % 7 == 0);
        return (multipleOf3 || multipleOf7) && !(multipleOf3 && multipleOf7);
    }

    /**
     * Simulates dodging traps through a cave until step 5000. Prints a message at each step
     * where a trap is located (every 100th step).
     */
    public void dodgeTraps() {
        int steps = 0;
        while (steps < 5000) {
            steps++;
            if (steps % 100 == 0) {
                System.out.println("Trap avoided at step: " + steps);
            }
        }
        System.out.println("Treasure found at step: " + steps);
    }

    /**
     * Prints a square treasure map of a given size using '*' characters.
     *
     * @param size the size of the square map
     */
    public void printTreasureMap(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Calculates the reward based on the number of goldCoins.
     *
     * @param goldCoins the number of gold coins
     * @return twice the number of gold coins as the reward
     */
    public int calculateReward(int goldCoins) {
        return 2 * goldCoins;
    }

    /**
     * Calculates the reward based on the number of goldCoins and a multiplier.
     *
     * @param goldCoins the number of gold coins
     * @param multiplier the multiplier for calculating the reward
     * @return the reward based on goldCoins and multiplier
     */
    public double calculateReward(int goldCoins, double multiplier) {
        return goldCoins * multiplier;
    }

    /**
     * Counts down from the given number of seconds, printing a warning every three ticks.
     *
     * @param seconds the starting point of the countdown
     */
    public void trapCountdown(int seconds) {
        while (seconds > 0) {
            System.out.println("Countdown: " + seconds + " seconds remaining...");
            if (seconds % 3 == 0) {
                System.out.println("## Suspense Builds ##");
            }
            seconds--;
        }
        System.out.println("Time's up! Proceed with caution!");
    }

    public static void main(String[] args) {
        TreasureHunt th = new TreasureHunt();
        
        // Test tryUnlockDoor
        System.out.println("Try unlock door with hintCode 21: " + th.tryUnlockDoor(21));
        
        // Test dodgeTraps
        th.dodgeTraps();
        
        // Test printTreasureMap
        th.printTreasureMap(5);
        
        // Test calculateReward methods
        System.out.println("Reward for 10 goldCoins: " + th.calculateReward(10));
        System.out.println("Reward for 10 goldCoins with multiplier 1.5: " + th.calculateReward(10, 1.5));

        // Test trapCountdown
        th.trapCountdown(10);
    }
}