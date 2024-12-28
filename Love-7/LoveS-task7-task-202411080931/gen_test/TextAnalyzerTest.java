package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TextAnalyzerTest {

    private FileWordReader fileWordReader;
    private WordCounter wordCounter;
    private String testFilePath = "test.txt";

    @Before
    public void setUp() throws IOException {
        Files.write(Paths.get(testFilePath), "Hello world. Hello Java!".getBytes());
        fileWordReader = new FileWordReader(testFilePath);
        wordCounter = new WordCounter(fileWordReader);
    }

    @Test
    public void testTotalWordCount() {
        assertEquals(4, wordCounter.totalWordCount());
    }

    @Test
    public void testUniqueWordCount() {
        assertEquals(3, wordCounter.uniqueWordCount());
    }

    @Test
    public void testWordFrequency() {
        assertEquals(0.5, wordCounter.wordFrequency("hello"), 0.001);
        assertEquals(0.25, wordCounter.wordFrequency("world"), 0.001);
        assertEquals(0.25,"Hello world. Hello Java! Word Frequency", wordCounter.wordFrequency("java"), 0.001);
        assertEquals(0.0, wordCounter.wordFrequency("python"), 0.001); // Non-existent word
    }

    @Test
    public void testEmptyFile() throws IOException {
        Files.write(Paths.get(testFilePath), "".getBytes());
        fileWordReader = new FileWordReader(testFilePath);
        wordCounter = new WordCounter(fileWordReader);
        assertEquals(0, wordCounter.totalWordCount());
        assertEquals(0, wordCounter.uniqueWordCount());
    }

    @Test
    public void testSpecialCharacters() throws IOException {
        Files.write(Paths.get(testFilePath), "A! B? C, D.".getBytes());
        fileWordReader = new FileWordReader(testFilePath);
        wordCounter = new WordCounter(fileWordReader);
        assertEquals(4, wordCounter.totalWordCount());
        assertEquals(4, wordCounter.uniqueWordCount());
    }

    @Test
    public void testNumbers() throws IOException {
        Files.write(Paths.get(testFilePath), "1 2 3 4 5 6".getBytes());
        fileWordReader = new FileWordReader(testFilePath);
        wordCounter = new WordCounter(fileWordReader);
        assertEquals(6, wordCounter.totalWordCount());
        assertEquals(6, wordCounter.uniqueWordCount());
    }

    @Test
    public void testFileReadingErrorHandling() {
        FileWordReader reader = new FileWordReader("nonexistentfile.txt");
        assertEquals(0, reader.getWords().size()); // Should gracefully handle file not found error and return no words
    }

    @Test
    public void testWordCounterPerformance() throws IOException {
        // Create a large file for performance test
        StringBuilder largeText = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            largeText.append("word ");
        }
        Files.write(Paths.get(testFilePath), largeText.toString().getBytes());

        fileWordReader = new FileWordReader(testFilePath);
        wordCounter = new WordCounter(fileWordReader);
        assertEquals(10000, wordCounter.totalWordCount());
        assertEquals(1, wordCounter.uniqueWordCount());
        assertEquals(1.0, wordCounter.wordFrequency("word"), 0.001);
    }

    @Test
    public void testEdgeCaseFileWithSingleWord() throws IOException {
        Files.write(Paths.get(testFilePath), "word".getBytes());
        fileWordReader = new FileWordReader(testFilePath);
        wordCounter = new WordCounter(fileWordReader);
        assertEquals(1, wordCounter.totalWordCount());
        assertEquals(1, wordCounter.uniqueWordCount());
        assertEquals(1.0, wordCounter.wordFrequency("word"), 0.001);
    }

    @Test
    public void testEdgeCaseFileWithLineBreaks() throws IOException {
        Files.write(Paths.get(testFilePath), "word1\nword2\nword3".getBytes());
        fileWordReader = new FileWordReader(testFilePath);
        wordCounter = new WordCounter(fileWordReader);
        assertEquals(3, wordCounter.totalWordCount());
        assertEquals(3, wordCounter.uniqueWordCount());
        assertEquals(0.333, wordCounter.wordFrequency("word1"), 0.001);
    }
}