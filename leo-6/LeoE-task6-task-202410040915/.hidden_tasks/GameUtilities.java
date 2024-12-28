import java.util.ArrayList;
import java.util.Random;

public class GameUtilities {

    private final Random random = new Random();

    /**
     * Task 3.1: Simulate dice roll.
     * 
     * Dice roll to modify player movement on a grid.
     */
    public int rollDice() {
        // Simulate a 6-sided dice roll
        return random.nextInt(6) + 1;
    }

    /**
     * Task 3.2: Scoring system with Ternary Operator.
     */
    public String evaluateScore(int score, int threshold) {
        return score >= threshold ? "Power Move Unlocked" : "Shield Guard Enabled";
    }

    public static void main(String[] args) {
        GameUtilities gameUtils = new GameUtilities();
        int diceRoll = gameUtils.rollDice();
        System.out.println("Dice rolled: " + diceRoll);
        
        String scoreOutcome = gameUtils.evaluateScore(95, 100);
        System.out.println("Score evaluation: " + scoreOutcome);
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isDead() {
        return this.health <= 0;
    }
}