import java.util.List;
import java.util.ArrayList;

public class BankAccount {
    private double balance; // Current balance of the account
    private String accountHolder; // Name of the account holder
    private int accountNumber; // Unique account number
    private ArrayList<String> transactions; // Log of transactions

    // Constructor without initial balance, default balance is zero
    public BankAccount(String accountHolder, int accountNumber) {
        this(accountHolder, accountNumber, 0.0);
    }

    // Constructor with initial balance
    public BankAccount(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        transactions = new ArrayList<>();
        transactions.add("Account created with initial balance: $" + initialBalance);
    }

    // Method to deposit money into the account
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: $" + amount);
            return true;
        } else {
            System.out.println("Invalid deposit amount.");
            return false;
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add("Withdrew: $" + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to display transaction history using a for loop
    public void showTransactionHistory() {
        System.out.println("Transaction history for account " + accountNumber + ":");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Method to reach a goal balance using a while loop
    public void reachGoalBalance(double goal) {
        double increment = 50; // Fixed increment amount
        while (balance < goal) {
            deposit(increment);
            System.out.println("Deposited: $" + increment + ". Current balance: $" + balance);
        }
        System.out.println("Goal of $" + goal + " reached.");
    }

    // Overloaded method to reach a goal balance with specified increment
    public void reachGoalBalance(double goal, double increment) {
        while (balance < goal && increment > 0) {
            deposit(increment);
            System.out.println("Deposited: $" + increment + ". Current balance: $" + balance);
        }
        System.out.println("Goal of $" + goal + " reached.");
    }

    public static void main(String[] args) {
        // Example usage
        BankAccount myAccount = new BankAccount("John Doe", 12345);
        myAccount.deposit(100);
        myAccount.withdraw(30);
        myAccount.deposit(50);
        myAccount.reachGoalBalance(500);
        myAccount.showTransactionHistory();
    }
}