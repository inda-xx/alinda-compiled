import java.util.List;
import java.util.ArrayList;

public class BankAccount {
    private double balance; // Current balance of the account
    private String accountHolder; // Name of the account holder
    private int accountNumber; // Unique account number
    private ArrayList<String> transactions; // Log of transactions

    // Constructor without initial balance, default balance is zero
    public BankAccount(String accountHolder, int accountNumber) 
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
    }

    // Constructor with initial balance
    public BankAccount(String accountHolder, int accountNumber, double initialBalance) 
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();

        if (initialBalance < 0) 
        {
            balance = 0;
        }
        else
        {
            balance = initialBalance;
        }                         
    }

    // Method to deposit money into the account
    public boolean deposit(double amount) {
        if (amount < 0) 
        {
            return false;
        }
        balance += amount;
        transactions.add("Deposit: " + amount + ", New balance: " + balance); //add transaction to log
        return true;        
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > balance) 
        {
            return false;
        }
        balance -= amount;
        transactions.add("Withdraw: " + -amount  + ", New balance: " + balance); //add transaction to log
        return true;
    }

    // Method to get the current balance
    public double getBalance() 
    {   
        return balance;
    }

    // Method to display transaction history using a for loop
    public void showTransactionHistory() 
    {
        System.out.println("History for account: " + accountNumber);
        for (String transaction : transactions) 
        {
            System.out.println(transaction);
        }
        System.out.println();
    }

    // Method to reach a goal balance using a while loop
    public void reachGoalBalance(double goal) 
    {
        while (balance < goal) 
        {
            balance += 50;
            transactions.add("deposit: " + 50  + ", New balance: " + balance); //add transaction to log
        }
    }

    // Overloaded method to reach a goal balance with specified increment
    public boolean reachGoalBalance(double goal, double increment) 
    {
        if (increment < 0) 
        {
            return false;
        }
        while (balance < goal) 
        {
            balance += increment;
            transactions.add("deposit: " + increment  + ", New balance: " + balance); //add transaction to log
        }
        return true;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Viktor", 12345);
        BankAccount account2 = new BankAccount("Charlie", 45321, 
                               5000);

        account1.deposit(50);
        account2.deposit(500);

        account1.withdraw(10);
        account2.withdraw(1000);

        account1.getBalance();
        account2.getBalance();

        account1.reachGoalBalance(600);
        account2.reachGoalBalance(7000, 500);

        account1.showTransactionHistory();
        account2.showTransactionHistory();
        
    }
}