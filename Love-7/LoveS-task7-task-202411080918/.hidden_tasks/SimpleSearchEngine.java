import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class SimpleSearchEngine {
    private HashMap<String, List<String>> wordIndex = new HashMap<>();

    public SimpleSearchEngine(String[] fileNames) {
        for (String fileName : fileNames) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        word = word.toLowerCase();
                        wordIndex.computeIfAbsent(word, k -> new ArrayList<>()).add(fileName);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> search(String keyword) {
        return wordIndex.getOrDefault(keyword.toLowerCase(), new ArrayList<>());
    }
}