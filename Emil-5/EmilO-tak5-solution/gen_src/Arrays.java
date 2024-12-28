public class Arrays {

    /**
     * Calculate and return the integer average of the given integer array.
     * The result is rounded down if necessary.
     * 
     * @param array An array of integers
     * @return The integer average of the array elements
     */
    public static int average(int[] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        
        int sum = 0;

        for (int i : array) {
          sum += i;
        }
    
        return sum / array.length;
    }

    /**
     * Calculate and return the double average of the given double array.
     * 
     * @param array An array of doubles
     * @return The average of the array elements
     */
    public static double average(double[] array) {
        if(array == null || array.length == 0){
            return 0;
        }

        double sum = 0;

        for (double i : array) {
          sum += i;
        }
    
        return sum / array.length;
    }

    /**
     * Find and return the smallest element in the given integer array.
     * If the array is empty, return Integer.MAX_VALUE.
     * 
     * @param array An array of integers
     * @return The smallest integer in the array or Integer.MAX_VALUE if empty
     */
    public static int smallestElement(int[] array) {
        int smallestElement = Integer.MAX_VALUE;

        for (int i : array){
            if(i < smallestElement){
                smallestElement = i;
            }
        }

        return smallestElement;
    }

    /**
     * Create and return a reversed copy of the given integer array.
     * The original array is not modified.
     * 
     * @param array An array of integers
     * @return A new array with elements in reverse order of input array
     */
    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - i - 1] = array[i];
        }

        return reversedArray;
    }

    /**
     * Extract and return an array containing all even numbers from the given array.
     * 
     * @param array An array of integers
     * @return A new array containing only even integers from the input array
     */
    public static int[] evenNumbers(int[] array) {
        int size = 0;
        
        //Count the number of even number in the array
        for (int i : array) {
            if (i % 2 == 0){
                ++size;
            }
        }

        int[] evenNumbers = new int[size];
        int index = 0;

        for (int i : array) {
            if (i % 2 == 0){
                evenNumbers[index] = i;
                ++index;
            }
        }

        return evenNumbers;
    }
}