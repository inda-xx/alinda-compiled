import java.util.Set;
import java.util.Random;

public class Dice {
    protected int value;
    private Random random;

    /**
     * Constructor initializes the dice with a random value between 1 and 6.
     */
    public Dice() {
        random = new Random();
        roll(); // Sets a random value for the dice.
    }

    /**
     * Rolls the dice to obtain a new random value between 1 and 6.
     */
    public void roll() {
        value = random.nextInt(6) + 1;
    }

    /**
     * Gets the current value of the dice.
     * @return the value of the dice.
     */
    public int getValue() {
        return value;
    }
}