public class BankAccount {
    private double balance;
    private int accountNumber;
    private boolean isActive;

    // Constructor that initializes account with accountNumber only
    public BankAccount(int accountNumber) {
        // TODO: Implement this constructor
    }

    // Constructor that initializes account with accountNumber and initialBalance
    public BankAccount(int accountNumber, double initialBalance) {
        // TODO: Implement this constructor
    }

    // Method to check if the balance is positive
    public boolean isBalancePositive() {
        // TODO: Implement this method
        return false;
    }

    // Method to deposit money
    public void deposit(double amount) {
        // TODO: Implement this method
    }

    // Method to withdraw money with up to three attempts
    public boolean withdraw(double amount) {
        // TODO: Implement this method
        return false;
    }

    // Method to print account details
    @Override
    public String toString() {
        // TODO: Implement this method
        return "";
    }

    // Method to reactivate account if balance exceeds threshold
    public void reactivateAccount() {
        // TODO: Implement this method
    }
}