import java.util.List;
import java.util.ArrayList;

public class FileWordSplitter {
    private ArrayList<String> words;
    
    public FileWordSplitter(String filename) {
        words = new ArrayList<>();
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitWords = line.split("\\s+");
                for (String word : splitWords) {
                    words.add(word);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    
    public ArrayList<String> getWords() {
        return words;
    }
}