import java.util.Scanner;

public class TransactionProcessor {

    public void processTransactions() {
        Scanner scanner = new Scanner(System.in);
        double sessionTotal = 0.0;
        while (true) {
            System.out.println("Enter transaction amount (type 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double transactionAmount = Double.parseDouble(input);
                if (transactionAmount > 0) {
                    System.out.println("Transaction allowed: " + transactionAmount);
                    sessionTotal += transactionAmount;
                } else {
                    System.out.println("Transaction not allowed: " + transactionAmount);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        System.out.println("Session Total: " + sessionTotal);
        scanner.close();
    }

    public double calculateFees(double[] transactions) {
        double totalFees = 0.0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                totalFees += 2.0; // Fixed fee per transaction
            }
        }
        return totalFees;
    }

    public double calculateFees(double[] transactions, double bonusRate) {
        double totalFees = 0.0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                totalFees += 2.0 * (1 - bonusRate);
            }
        }
        return totalFees;
    }

    public double calculateFees(double[] transactions, int maxTransactions) {
        double totalFees = 0.0;
        int count = 0;
        for (double transaction : transactions) {
            if (transaction > 0 && count < maxTransactions) {
                totalFees += 2.0;
                count++;
            }
        }
        return totalFees;
    }

    public boolean detectOverload(int[] transactions) {
        final int OVERLOAD_THRESHOLD = 1000;
        for (int dailyCount : transactions) {
            if (dailyCount > OVERLOAD_THRESHOLD) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TransactionProcessor tp = new TransactionProcessor();
        // Example usage
        tp.processTransactions();
        double[] sampleTransactions = {100, 200, 0, -10};
        System.out.println("Total fees: " + tp.calculateFees(sampleTransactions));
        System.out.println("Total fees with bonus: " + tp.calculateFees(sampleTransactions, 0.1));
        System.out.println("Total fees with limit: " + tp.calculateFees(sampleTransactions, 2));
        int[] dailyTransactions = {500, 750, 1200, 950};
        System.out.println("Overload detected: " + tp.detectOverload(dailyTransactions));
    }
}