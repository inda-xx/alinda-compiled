import java.util.List;
import java.util.ArrayList;

public class StringCollections {

    /**
     * Stores a list of strings in an array.
     * @param words The list of strings to store.
     * @return An array containing the strings.
     */
    public static String[] storeUsingArray(String[] words) {
        // Print each word in the array using a for loop
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        // Return the array
        return words;
    }

    /**
     * Stores a list of strings in an ArrayList.
     * @param words The list of strings to store.
     * @return An ArrayList containing the strings.
     */
    public static ArrayList<String> storeUsingArrayList(String[] words) {
        // Initialize the ArrayList
        ArrayList<String> wordList = new ArrayList<>();
        
        // Add each string from the array to the ArrayList
        for (String word : words) {
            wordList.add(word);
        }
        
        // Use a foreach loop to print each word in the ArrayList
        for (String word : wordList) {
            System.out.println(word);
        }
        
        // Return the ArrayList
        return wordList;
    }

    /**
     * Displays the contents of both a String array and an ArrayList.
     * @param array The String array to display.
     * @param arrayList The ArrayList to display.
     */
    public static void displayBothCollections(String[] array, ArrayList<String> arrayList) {
        System.out.println("Array contents:");
        // Loop through the array and print each element
        for (String s : array) {
            System.out.println(s);
        }
        
        System.out.println("ArrayList contents:");
        // Loop through the ArrayList and print each element
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    /**
     * Compares sizes of a String array and an ArrayList.
     * @param array The String array to compare.
     * @param arrayList The ArrayList to compare.
     * @return True if the sizes are equal, false otherwise.
     */
    public static boolean areSizesEqual(String[] array, ArrayList<String> arrayList) {
        // Compare the length of the array and the size of the ArrayList
        return array.length == arrayList.size();
    }
}