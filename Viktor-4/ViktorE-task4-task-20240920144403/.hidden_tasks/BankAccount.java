public class BankAccount {
    private double balance;
    private int accountNumber;
    private boolean isActive;

    // Constructor that initializes account with accountNumber only
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.isActive = true;
    }

    // Constructor that initializes account with accountNumber and initialBalance
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isActive = initialBalance > 0;
    }

    // Method to check if the balance is positive
    public boolean isBalancePositive() {
        return balance > 0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            return; // Ignore non-positive amounts
        }
        // Use a while loop to illustrate, though it's not essentially necessary
        while (amount > 0) {
            balance += amount;
            amount = 0; // Deposit only once, then break the loop
        }
        System.out.println("Balance after deposit: " + balance);
    }

    // Method to withdraw money with up to three attempts
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false; // Invalid withdrawal amount
        }
        for (int attempt = 0; attempt < 3; attempt++) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
                return true;
            }
        }
        System.out.println("Withdrawal unsuccessful after 3 attempts.");
        return false;
    }

    // Method to print account details
    @Override
    public String toString() {
        return String.format("Account Number: %d, Balance: %.2f, Active: %b", accountNumber, balance, isActive);
    }

    // Method to reactivate account if balance exceeds threshold
    public void reactivateAccount() {
        double threshold = 100;
        if (!isActive) {
            // Use a while loop to attempt deposits until threshold is met
            while (balance < threshold) {
                double needed = threshold - balance;
                deposit(needed);
            }
            isActive = true;
            System.out.println("Account reactivated.");
        }
    }
}