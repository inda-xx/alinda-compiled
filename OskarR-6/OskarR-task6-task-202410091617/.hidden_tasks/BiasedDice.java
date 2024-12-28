import java.util.Random;

public class BiasedDice extends Dice {
    private Random random;

    /**
     * Constructor for BiasedDice which rolls the dice with a bias towards higher numbers.
     */
    public BiasedDice() {
        random = new Random();
        int roll = random.nextInt(100);
        
        // Introducing bias where 60% of the times the dice rolls a 4, 5, or 6
        if (roll < 20) { // 20% chance
            super.value = 6;
        } else if (roll < 40) { // 20% chance
            super.value = 5;
        } else if (roll < 60) { // 20% chance
            super.value = 4;
        } else { // 40% chance to roll between 1 to 3
            super.value = random.nextInt(3) + 1;
        }
    }
}