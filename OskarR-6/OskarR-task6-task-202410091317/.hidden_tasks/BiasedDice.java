public class BiasedDice extends Dice {

    /**
     * Creates a biased dice with a 50% chance to roll a 6.
     */
    public BiasedDice() {
        super();
    }

    /**
     * Rolls the dice with a bias: 50% chance of rolling a 6, otherwise 1-5.
     */
    @Override
    public void roll() {
        value = (random.nextBoolean()) ? 6 : random.nextInt(5) + 1;  // Bias logic using ternary operator
    }

    @Override
    public String toString() {
        return "Biased Dice Roll: " + value;
    }
}