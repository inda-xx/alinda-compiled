import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class WordCounter {
    private HashMap<String, Integer> wordCounts = new HashMap<>();

    public void countWords(ArrayList<String> words) {
        for (String word : words) {
            word = word.toLowerCase();
            wordCounts.merge(word, 1, Integer::sum);
        }
    }

    public HashMap<String, Integer> getWordCounts() {
        return wordCounts;
    }

    public int getOccurrencesOf(String word) {
        return wordCounts.getOrDefault(word.toLowerCase(), 0);
    }

    public double getFrequencyOf(String word, int totalWords) {
        int count = getOccurrencesOf(word);
        return (double) count / totalWords;
    }
}