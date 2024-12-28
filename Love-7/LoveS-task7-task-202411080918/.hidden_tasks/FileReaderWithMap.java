import java.util.Map;
import java.util.HashMap;

public class FileReaderWithMap {
    private HashMap<String, Integer> wordMap = new HashMap<>();
    private int totalWords = 0;

    public FileReaderWithMap(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase();
                    wordMap.merge(word, 1, Integer::sum);
                    totalWords++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getWordCount(String word) {
        return wordMap.getOrDefault(word.toLowerCase(), 0);
    }

    public double getFrequency(String word) {
        int count = getWordCount(word);
        return (totalWords == 0) ? 0 : (double) count / totalWords;
    }
}