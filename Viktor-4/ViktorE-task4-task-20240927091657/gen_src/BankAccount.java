import java.util.ArrayList;

public class BankAccount {
    private double balance; // Current balance of the account
    private String accountHolder; // Name of the account holder
    private int accountNumber; // Unique account number
    private ArrayList<String> transactions; // Log of transactions

    // Constructor without initial balance, default balance is zero
    public BankAccount(String accountHolder, int accountNumber) {
        // TODO: Implement this constructor.
    }

    // Constructor with initial balance
    public BankAccount(String accountHolder, int accountNumber, double initialBalance) {
        // TODO: Implement this constructor.
    }

    // Method to deposit money into the account
    public boolean deposit(double amount) {
        // TODO: Implement this method.
        return false;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        // TODO: Implement this method.
        return false;
    }

    // Method to get the current balance
    public double getBalance() {
        // TODO: Implement this method.
        return 0.0;
    }

    // Method to display transaction history using a for loop
    public void showTransactionHistory() {
        // TODO: Implement this method.
    }

    // Method to reach a goal balance using a while loop
    public void reachGoalBalance(double goal) {
        // TODO: Implement this method.
    }

    // Overloaded method to reach a goal balance with specified increment
    public void reachGoalBalance(double goal, double increment) {
        // TODO: Implement this method.
    }

    public static void main(String[] args) {
        // TODO: Implement example usage.
    }
}