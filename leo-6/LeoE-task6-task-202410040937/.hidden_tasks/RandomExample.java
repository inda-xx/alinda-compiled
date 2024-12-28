import java.util.Random;

public class RandomExample {

    /**
     * Demonstrates the usage of the Random class for generating random numbers.
     * The Random class provides various methods to generate random numbers.
     * - nextInt(int bound): Provides a random integer from 0 (inclusive) to the specified bound (exclusive).
     * - nextDouble(): Provides a random double value between 0.0 and 1.0.
     * - nextBoolean(): Provides a random boolean value.
     * - nextLong(): Provides a random long value.
     * - nextFloat(): Provides a random float value.
     */
    public void demonstrateRandom() {
        Random random = new Random();
        int randomInt = random.nextInt(10); // Generates a random integer between 0 and 9
        double randomDouble = random.nextDouble(); // Generates a random double between 0.0 and 1.0
        boolean randomBoolean = random.nextBoolean(); // Generates a random boolean

        System.out.println("Random Integer: " + randomInt);
        System.out.println("Random Double: " + randomDouble);
        System.out.println("Random Boolean: " + randomBoolean);
    }

    public static void main(String[] args) {
        RandomExample example = new RandomExample();
        example.demonstrateRandom();
    }
}