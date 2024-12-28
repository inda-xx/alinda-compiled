package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("Alice", 1001);
    }

    @Test
    public void testInitialBalanceIsZero() {
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDepositValidAmount() {
        assertTrue(account.deposit(100));
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDepositInvalidAmount() {
        assertFalse(account.deposit(-50));
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawValidAmount() {
        account.deposit(100);
        boolean withdrawn = account.withdraw(50);
        assertTrue(withdrawn);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        account.deposit(100);
        boolean withdrawn = account.withdraw(150);
        assertFalse(withdrawn);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInvalidAmount() {
        assertFalse(account.withdraw(-30));
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testTransactionHistory() {
        account.deposit(200);
        account.withdraw(100);
        account.deposit(50);
        
        List<String> expectedTransactions = new ArrayList<>();
        expectedTransactions.add("Account created with initial balance: $0.0");
        expectedTransactions.add("Deposited: $200.0");
        expectedTransactions.add("Withdrew: $100.0");
        expectedTransactions.add("Deposited: $50.0");

        account.showTransactionHistory();  // Check printed values manually if needed
        
        assertEquals(expectedTransactions, ((ArrayList<String>)account.transactions));
    }

    @Test
    public void testReachGoalBalance() {
        account.deposit(100);
        account.reachGoalBalance(250);

        assertTrue(account.getBalance() >= 250);
    }

    @Test
    public void testReachGoalBalanceWithIncrement() {
        account.reachGoalBalance(200, 40);

        assertTrue(account.getBalance() >= 200);
    }
}

// TreasureHuntTest.java

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

