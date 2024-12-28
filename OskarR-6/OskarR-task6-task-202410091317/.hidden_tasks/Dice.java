import java.util.Random;

public class Dice {
    protected int value;
    protected Random random;

    /**
     * Creates a standard dice with a roll range of 1 to 6.
     */
    public Dice() {
        random = new Random();
        roll();
    }

    /**
     * Rolls the dice and sets its value between 1 and 6.
     */
    public void roll() {
        value = random.nextInt(6) + 1;  // Generates a number from 1 to 6
    }

    /**
     * Gets the value of the dice.
     * @return the value of the dice.
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Dice Roll: " + value;
    }
}