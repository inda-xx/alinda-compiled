package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("Alice", 12345678, 100.0);
    }

    @Test
    public void testDefaultConstructor() {
        BankAccount newAccount = new BankAccount("Bob", 87654321);
        assertEquals(0.0, newAccount.getBalance(), 0);
    }

    @Test
    public void testDepositValidAmount() {
        assertTrue(account.deposit(50));
        assertEquals(150.0, account.getBalance(), 0);
    }

    @Test
    public void testDepositInvalidAmount() {
        assertFalse(account.deposit(-50));
        assertEquals(100.0, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawValidAmount() {
        assertTrue(account.withdraw(30));
        assertEquals(70.0, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawInvalidAmount() {
        assertFalse(account.withdraw(-10));
        assertEquals(100.0, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        assertFalse(account.withdraw(150));
        assertEquals(100.0, account.getBalance(), 0);
    }

    @Test
    public void testTransactionHistory() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        account.deposit(50);
        account.withdraw(20);
        account.showTransactionHistory();

        String output = out.toString().trim();
        String expectedOutput = "Transaction history for account 12345678:\n" +
                                "Account created with initial balance: $100.0\n" +
                                "Deposited: $50.0\n" +
                                "Withdrew: $20.0";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testReachGoalBalanceDefaultIncrement() {
        account.reachGoalBalance(200);
        assertEquals(200.0, account.getBalance(), 0);
    }

    @Test
    public void testReachGoalBalanceSpecifiedIncrement() {
        account.reachGoalBalance(250, 25);
        assertEquals(250.0, account.getBalance(), 0);
    }

    @Test
    public void testReachGoalBalanceZeroIncrement() {
        double initialBalance = account.getBalance();
        account.reachGoalBalance(200, 0);
        assertEquals(initialBalance, account.getBalance(), 0);
    }

    @Test
    public void testReachGoalBalanceNegativeIncrement() {
        double initialBalance = account.getBalance();
        account.reachGoalBalance(200, -50);
        assertEquals(initialBalance, account.getBalance(), 0);
    }
}