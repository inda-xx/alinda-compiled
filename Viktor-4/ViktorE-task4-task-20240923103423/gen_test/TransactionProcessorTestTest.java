package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class TransactionProcessorTest {

    private TransactionProcessor transactionProcessor;

    @Before
    public void setUp() {
        transactionProcessor = new TransactionProcessor();
    }

    @Test
    public void testCalculateFeesWithPositiveTransactions() {
        double[] transactions = {100.0, 200.0, 50.0};
        double expectedFees = 6.0; // 3 transactions, 2.0 fee each
        assertEquals(expectedFees, transactionProcessor.calculateFees(transactions), 0.001);
    }

    @Test
    public void testCalculateFeesWithMixedTransactions() {
        double[] transactions = {100.0, -50.0, 20.0, 0.0};
        double expectedFees = 4.0; // 2 positive transactions
        assertEquals(expectedFees, transactionProcessor.calculateFees(transactions), 0.001);
    }

    @Test
    public void testCalculateFeesWithBonusRate() {
        double[] transactions = {100.0, 200.0, 50.0};
        double bonusRate = 0.1; // reducing fees by 10%
        double expectedFees = 5.4; // 6.0 minus 10%
        assertEquals(expectedFees, transactionProcessor.calculateFees(transactions, bonusRate), 0.001);
    }

    @Test
    public void testCalculateFeesWithLimit() {
        double[] transactions = {100.0, 200.0, 50.0};
        int maxTransactions = 2;
        double expectedFees = 4.0; // only 2 transactions processed
        assertEquals(expectedFees, transactionProcessor.calculateFees(transactions, maxTransactions), 0.001);
    }

    @Test
    public void testDetectOverload() {
        int[] dailyTransactions = {500, 750, 1200, 950};
        assertTrue(transactionProcessor.detectOverload(dailyTransactions));
    }

    @Test
    public void testDetectNoOverload() {
        int[] dailyTransactions = {500, 750, 900, 950};
        assertFalse(transactionProcessor.detectOverload(dailyTransactions));
    }

    @Test
    public void testCalculateFeesWithEmptyTransactions() {
        double[] transactions = {};
        double expectedFees = 0.0;
        assertEquals(expectedFees, transactionProcessor.calculateFees(transactions), 0.001);
    }

    @Test(expected = IllegalArgumentException.