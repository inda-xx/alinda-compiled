import java.util.Random;

public class Dice {
    private int value;
    private Random random;

    /**
     * Constructor that initializes a dice with a random value between 1 and 6.
     */
    public Dice() {
        random = new Random();
        value = random.nextInt(6) + 1;
    }

    /**
     * Returns the value of the dice.
     * @return the current value of the dice
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}