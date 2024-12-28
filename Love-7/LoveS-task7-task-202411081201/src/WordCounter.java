import java.util.HashMap;
import java.util.ArrayList;

public class WordCounter {
    private HashMap<String, Integer> wordCounts = new HashMap<>();

    public void countWords(ArrayList<String> words) {
        for  (String word : words) {
            word = word.toLowerCase();
            wordCounts.merge(word, 1, Integer::sum);
        }
    }

    public HashMap<String, Integer> getWordCounts() {
        return wordCounts;
    }
}