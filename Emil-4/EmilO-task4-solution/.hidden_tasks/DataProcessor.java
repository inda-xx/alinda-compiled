public class DataProcessor {
    
    /**
     * Process numbers from 1 to 50, printing only the multiples of 5.
     * Stop processing if a number greater than 45 and a multiple of 5 is encountered.
     */
    public void processNumbers() {
        int number = 1;
        while (number <= 50) {
            if (number % 5 == 0) {
                System.out.println(number);
                if (number > 45) {
                    break;
                }
            }
            number++;
        }
    }

    /**
     * Calculate the factorial of a given number.
     * If the number is negative, return -1 as an error code.
     * 
     * @param number the number to compute the factorial for
     * @return the factorial of the number, or -1 if number is negative
     */
    public int calculateFactorial(int number) {
        if (number < 0) {
            return -1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Process an array of integers, printing elements greater than a threshold.
     * 
     * @param data the array of integers to process
     */
    public void processData(int[] data) {
        processData(data, 0);
    }

    /**
     * Process an array of integers, printing elements greater than a given threshold.
     * Also prints the sum of the filtered numbers.
     * 
     * @param data the array of integers to process
     * @param threshold the threshold to compare against
     */
    public void processData(int[] data, int threshold) {
        int sum = 0;
        int i = 0;
        while (i < data.length) {
            if (data[i] > threshold) {
                System.out.println(data[i]);
                sum += data[i];
            }
            i++;
        }
        System.out.println("Sum of filtered numbers: " + sum);
    }
}