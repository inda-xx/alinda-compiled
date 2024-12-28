package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceGameTest {

    @Test
    public void testRollDiceSequence() {
        ArrayList<Dice> result = DiceGame.rollDiceSequence(5);
        assertEquals(5, result.size());
    }

    @Test
    public void testRollDiceSequenceZero() {
        ArrayList<Dice> result = DiceGame.rollDiceSequence(0);
        assertEquals(0, result.size());
    }

    @Test
    public void testMaxConsecutiveDiceRolls() {
        ArrayList<Dice> diceList = createDiceList(new int[]{1, 2, 3, 4, 5});
        int result = DiceGame.maxConsecutiveDiceRolls(diceList);
        assertEquals(9, result); // 4 + 5 = 9 is the highest consecutive sum
    }

    @Test
    public void testMaxConsecutiveDiceRollsSingleElement() {
        ArrayList<Dice> diceList = createDiceList(new int[]{4});
        int result = DiceGame.maxConsecutiveDiceRolls(diceList);
        assertEquals(0, result);
    }

    @Test
    public void testMaxConsecutiveDiceRollsEmptyList() {
        ArrayList<Dice> diceList = new ArrayList<>();
        int result = DiceGame.maxConsecutiveDiceRolls(diceList);
        assertEquals(0, result);
    }

    @Test
    public void testRemoveDice() {
        ArrayList<Dice> diceList = createDiceList(new int[]{2, 3, 4, 3, 5});
        ArrayList<Dice> result = DiceGame.removeDice(diceList, 3);
        List<Integer> values = getDiceValues(result);
        assertFalse(values.contains(3));
        assertEquals(3, result.size());
    }

    @Test
    public void testRemoveDiceNoMatching() {
        ArrayList<Dice> diceList = createDiceList(new int[]{2, 4, 5});
        ArrayList<Dice> result = DiceGame.removeDice(diceList, 3);
        assertEquals(3, result.size());
    }

    @Test
    public void testRemoveDiceEmptyList() {
        ArrayList<Dice> diceList = new ArrayList<>();
        ArrayList<Dice> result = DiceGame.removeDice(diceList, 3);
        assertEquals(0, result.size());
    }

    private ArrayList<Dice> createDiceList(int[] values) {
        ArrayList<Dice> diceList = new ArrayList<>();
        for (int value : values) {
            Dice dice = new Dice();
            dice.value = value; // Direct access to emulate behavior
            diceList.add(dice);
        }
        return diceList;
    }

    private List<Integer> getDiceValues(ArrayList<Dice> diceList) {
        List<Integer> values = new ArrayList<>();
        for (Dice dice : diceList) {
            values.add(dice.getValue());
        }
        return values;
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

