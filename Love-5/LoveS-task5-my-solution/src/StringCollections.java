import java.util.ArrayList;

public class StringCollections {

    public static String[] storeUsingArray(String[] words) {

        String[] storeWords = new String[words.length];
        
        for (int i = 0; i < words.length; i++){
            storeWords[i] = words[i];
        }
        // Printar varje ord i array:en
        //for (int i = 0; i < storeWords.length; i++) {
        //    System.out.println(storeWords[i]);
        //}
        
        return words;
    }


    public static ArrayList<String> storeUsingArrayList(String[] words) {

        
        ArrayList<String> wordList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            wordList.add(words[i]);
        }
        //for (String word : wordList) {
        //    System.out.println(word);
        //}
        return wordList;
    }

    public static void displayBothCollections(String[] array, ArrayList<String> arrayList) {
        System.out.println("Array Content:");
        for (String word : array) {
            System.out.println(word);
        }

        System.out.println("ArrayList Content:");
        for (String word : arrayList) {
            System.out.println(word);
        }
    }

    public static boolean areSizesEqual(String[] array, ArrayList<String> arrayList) {

        return (array.length == arrayList.size());
    }

    public static void main(String[] args) {
        
        String[] testOrd = {"Hej", "Trevligt", "Att", "Råkas"};

        displayBothCollections(storeUsingArray(testOrd), storeUsingArrayList(testOrd));
        System.out.println(areSizesEqual(storeUsingArray(testOrd), storeUsingArrayList(testOrd)));
    
    }



}