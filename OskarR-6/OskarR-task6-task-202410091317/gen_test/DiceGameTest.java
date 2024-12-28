package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceGameTest {

    private Dice dice1;
    private Dice dice2;
    private Dice dice3;
    private Dice dice4;
    private ArrayList<Dice> sequence;
    
    @Before
    public void setUp() {
        // Create normal dice with specific values using a subclass to override the value for testing purposes
        dice1 = createFixedDice(4);
        dice2 = createFixedDice(5);
        dice3 = createFixedDice(2);
        dice4 = createFixedDice(6);
        sequence = new ArrayList<>(Arrays.asList(dice1, dice2, dice3, dice4));
    }
    
    private Dice createFixedDice(int fixedValue) {
        Dice dice = new Dice();
        dice.value = fixedValue;  // Manually set value (acceptable for unit tests)
        return dice;
    }

    @Test
    public void testRollDiceSequence() {
        List<Dice> rolledDice = DiceGame.rollDiceSequence(5);
        assertEquals(5, rolledDice.size());
        for (Dice dice : rolledDice) {
            assertTrue(dice.getValue() >= 1 && dice.getValue() <= 6);
        }
    }

    @Test
    public void testMaxConsecutiveDiceRolls() {
        assertEquals(11, DiceGame.maxConsecutiveDiceRolls(sequence));
    }

    @Test
    public void testMaxConsecutiveDiceRollsWithSingleDice() {
        List<Dice> singleDice = Arrays.asList(createFixedDice(3));
        assertEquals(0, DiceGame.maxConsecutiveDiceRolls(new ArrayList<>(singleDice)));
    }

    @Test
    public void testMaxConsecutiveDiceRollsEmpty() {
        assertEquals(0, DiceGame.maxConsecutiveDiceRolls(new ArrayList<>()));
    }

    @Test
    public void testRemoveDice() {
        ArrayList<Dice> modifiedSequence = DiceGame.removeDice(sequence, 5);
        assertEquals(3, modifiedSequence.size());
        for (Dice dice : modifiedSequence) {
            assertTrue(dice.getValue() != 5);
        }
    }

    @Test
    public void testRemoveDiceWithNoMatchingValue() {
        ArrayList<Dice> modifiedSequence = DiceGame.removeDice(sequence, 7);
        assertEquals(4, modifiedSequence.size());
        assertEquals(sequence, modifiedSequence);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

