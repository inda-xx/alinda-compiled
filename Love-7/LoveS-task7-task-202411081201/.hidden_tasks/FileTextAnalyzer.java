import java.util.Map;
import java.util.HashMap;

public class FileTextAnalyzer {
    private HashMap<String, Integer> wordOccurrences;
    
    public FileTextAnalyzer(String filename) {
        wordOccurrences = new HashMap<>();
        
        FileWordSplitter fileWordSplitter = new FileWordSplitter(filename);
        for (String word : fileWordSplitter.getWords()) {
            word = word.toLowerCase();
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
        }
    }

    public int occurrencesOf(String word) {
        return wordOccurrences.getOrDefault(word.toLowerCase(), 0);
    }
    
    public int uniqueWordCount() {
        return wordOccurrences.size();
    }
    
    public double frequencyOf(String word) {
        int occurrences = occurrencesOf(word);
        int totalWords = wordOccurrences.values().stream().mapToInt(Integer::intValue).sum();
        return (double) occurrences / totalWords;
    }
}