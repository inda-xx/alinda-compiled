import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;


public class TextAnalyzer {
    private FileWordReader reader;
    private WordCounter counter;

    public TextAnalyzer(String filenName) {
        this.reader = new FileWordReader(filenName);
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