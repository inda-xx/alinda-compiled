import java.util.List;
import java.util.Map;
import java.util.Set;

public class TextAnalyzer {
    private FileWordReader reader;
    private WordCounter counter;

    public TextAnalyzer(String fileName) {
        this.reader = new FileWordReader(fileName);
        this.counter = new WordCounter();
        counter.countWords(reader.getWords());
    }

    public int totalWords() {
        return reader.getWords().size();
    }

    public List<Map.Entry<String, Integer>> topFrequentWords(int n) {
        return counter.getWordCounts().entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(n)
            .collect(Collectors.toList());
    }

    public int uniqueWordCount() {
        return counter.getWordCounts().size();
    }
}