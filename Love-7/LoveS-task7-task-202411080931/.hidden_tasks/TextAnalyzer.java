public class TextAnalyzer {
    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : "hamlet.txt";
        try {
            FileWordReader fileWordReader = new FileWordReader(filename);
            WordCounter wordCounter = new WordCounter(fileWordReader);

            System.out.println("Total Word Count: " + wordCounter.totalWordCount());
            System.out.println("Unique Word Count: " + wordCounter.uniqueWordCount());
            System.out.println("Frequency of 'prince': " + wordCounter.wordFrequency("prince"));
            System.out.println("Frequency of 'hamlet': " + wordCounter.wordFrequency("hamlet"));
        } catch (Exception e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}