package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceGameTest {
    private ArrayList<Dice> diceList;
    private Random random;

    @Before
    public void setUp() {
        random = new Random();
        diceList = new ArrayList<>();
    }

    @Test
    public void testRollDiceSequence_withFiveRolls() {
        List<Dice> sequence = DiceGame.rollDiceSequence(5);
        assertEquals(5, sequence.size());
        for (Dice dice : sequence) {
            assertTrue(dice.getValue() >= 1 && dice.getValue() <= 6);
        }
    }

    @Test
    public void testRollDiceSequence_withZeroRolls() {
        List<Dice> sequence = DiceGame.rollDiceSequence(0);
        assertEquals(0, sequence.size());
    }

    @Test
    public void testRollDiceSequence_withNegativeRolls() {
        List<Dice> sequence = DiceGame.rollDiceSequence(-5);
        assertEquals(0, sequence.size());
    }

    @Test
    public void testMaxConsecutiveDiceRolls_withNormalList() {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        diceList.add(dice1);
        diceList.add(dice2);
        diceList.add(dice3);
        dice1.value = 3;
        dice2.value = 6;
        dice3.value = 4;
        assertEquals(10, DiceGame.maxConsecutiveDiceRolls(diceList));
    }

    @Test
    public void testMaxConsecutiveDiceRolls_withEmptyList() {
        assertEquals(0, DiceGame.maxConsecutiveDiceRolls(diceList));
    }

    @Test
    public void testMaxConsecutiveDiceRolls_withSingleDice() {
        diceList.add(new Dice());
        assertEquals(0, DiceGame.maxConsecutiveDiceRolls(diceList));
    }

    @Test
    public void testRemoveDice_withSix() {
        for (int i = 0; i < 5; i++) {
            diceList.add(new Dice());
        }
        diceList.get(2).value = 6;
        List<Dice> filtered = DiceGame.removeDice(diceList, 6);
        assertFalse(filtered.contains(6));
    }

    @Test
    public void testRemoveDice_withNoMatchingValue() {
        for (int i = 0; i < 5; i++) {
            diceList.add(new Dice());
        }
        List<Dice> filtered = DiceGame.removeDice(diceList, 7);
        assertEquals(5, filtered.size());
    }
}