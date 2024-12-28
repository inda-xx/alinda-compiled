import java.util.Map;
import java.util.HashMap;

public class WordCounter {
    private HashMap<String, Integer> wordCounts;

    public WordCounter(FileWordReader fileWordReader) {
        wordCounts = new HashMap<>();
        for (String word : fileWordReader.getWords()) {
            word = word.toLowerCase();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
    }

    public int totalWordCount() {
        return wordCounts.values().stream().mapToInt(Integer::intValue).sum();
    }

    public int uniqueWordCount() {
        return wordCounts.size();
    }

    public double wordFrequency(String word) {
        word = word.toLowerCase();
        return wordCounts.getOrDefault(word, 0) / (double) totalWordCount();
    }
}