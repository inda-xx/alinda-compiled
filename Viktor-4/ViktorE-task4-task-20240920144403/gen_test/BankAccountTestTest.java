package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(12345);
    }

    @Test
    public void accountInitializationWithZeroBalance() {
        assertEquals(0, account.balance, 0.001);
        assertTrue(account.isActive);
    }

    @Test
    public void accountInitializationWithPositiveBalance() {
        account = new BankAccount(12345, 100);
        assertEquals(100, account.balance, 0.001);
        assertTrue(account.isActive);
    }

    @Test
    public void accountInitializationWithZeroBalanceCheckActiveStatus() {
        account = new BankAccount(12345, 0);
        assertFalse(account.isBalancePositive());
    }

    @Test
    public void depositPositiveAmount() {
        account.deposit(50);
        assertEquals(50, account.balance, 0.001);
    }

    @Test
    public void depositZeroAmount() {
        account.deposit(0);
        assertEquals(0, account.balance, 0.001);
    }

    @Test
    public void depositNegativeAmount() {
        account.deposit(-20);
        assertEquals(0, account.balance, 0.001);
    }

    @Test
    public void withdrawWithSufficientBalance() {
        account.deposit(100);
        assertTrue(account.withdraw(50));
        assertEquals(50, account.balance, 0.001);
    }

    @Test
    public void withdrawWithInsufficientBalance() {
        assertFalse(account.withdraw(50));
        assertEquals(0, account.balance, 0.001);
    }

    @Test
    public void withdrawWithZeroAmount() {
        account.deposit(100);
        assertFalse(account.withdraw(0));
        assertEquals(100, account.balance, 0.001);
    }

    @Test
    public void withdrawWithNegativeAmount() {
        account.deposit(100);
        assertFalse(account.withdraw(-20));
        assertEquals(100, account.balance, 0.001);
    }

    @Test
    public void withdrawExactBalanceAmount() {
        account.deposit(100);
        assertTrue(account.withdraw(100));
        assertEquals(0, account.balance, 0.001);
    }

    @Test
    public void accountToStringTest() {
        account.deposit(200);
        assertEquals("Account Number: 12345, Balance: 200.00, Active: true", account.toString());
    }

    @Test
    public void inactiveAccountReactivation() {
        account = new BankAccount(12345, 50);
        account.isActive = false;
        account.reactivateAccount();
        assertTrue(account.isActive);
        assertEquals(100, account.balance, 0.001);
    }

    @Test
    public void inactiveAccountReactivationWithSufficientInitialBalance() {
        account = new BankAccount(12345, 150);
        account.isActive = false;
        account.reactivateAccount();
        assertTrue(account.isActive);
        assertEquals(150, account.balance, 0.001);
    }
}