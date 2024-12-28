import java.util.List;
import java.util.ArrayList;

public class PrimeNumberExplorer {

    // Method to calculate prime numbers between start and end using an array.
    public static int[] calculatePrimes(int start, int end) {
        if (start > end) {
            return new int[0]; // Return empty array if start is greater than end
        }
        
        ArrayList<Integer> primesList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primesList.add(i);
            }
        }
        
        // Convert ArrayList to array
        int[] primesArray = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primesArray[i] = primesList.get(i);
        }
        
        return primesArray;
    }
    
    // Method to calculate prime numbers between start and end using an ArrayList.
    public static ArrayList<Integer> calculatePrimesList(int start, int end) {
        ArrayList<Integer> primesList = new ArrayList<>();
        if (start > end) {
            return primesList; // Return empty ArrayList if start is greater than end
        }
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primesList.add(i);
            }
        }
        
        return primesList;
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true; // 2 and 3 are prime numbers
        
        if (number % 2 == 0 || number % 3 == 0) return false;
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        
        return true;
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        int[] primesArray = calculatePrimes(10, 30);
        System.out.println("Primes in array form: " + Arrays.toString(primesArray));

        ArrayList<Integer> primesList = calculatePrimesList(10, 30);
        System.out.println("Primes in list form: " + primesList);
    }
}