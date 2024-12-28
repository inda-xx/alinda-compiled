package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TextAnalyzerTest {

    private static final String TEST_FILE_PATH = "test_file.txt";

    @Test
    public void testTotalWords() throws IOException {
        // Setup
        createTestFile("hello world hello");
        TextAnalyzer analyzer = new TextAnalyzer(TEST_FILE_PATH);

        // Execute & Verify
        int totalWords = analyzer.totalWords();
        assertEquals(3, totalWords);
    }

    @Test
    public void testUniqueWordCount() throws IOException {
        // Setup
        createTestFile("hello world hello");
        TextAnalyzer analyzer = new TextAnalyzer(TEST_FILE_PATH);

        // Execute & Verify
        int uniqueWords = analyzer.uniqueWordCount();
        assertEquals(2, uniqueWords); // "hello" and "world"
    }

    @Test
    public void testTopFrequentWords() throws IOException {
        // Setup
        createTestFile("hello world hello java java java");
        TextAnalyzer analyzer = new TextAnalyzer(TEST_FILE_PATH);

        // Execute
        List<Map.Entry<String, Integer>> topWords = analyzer.topFrequentWords(2);

        // Verify
        assertEquals(2, topWords.size());
        assertEquals("java", topWords.get(0).getKey());
        assertEquals(3, (int) topWords.get(0).getValue());
        assertEquals("hello", topWords.get(1).getKey());
        assertEquals(2, (int) topWords.get(1).getValue());
    }

    @Test
    public void testEmptyFile() throws IOException {
        // Setup
        createTestFile("");
        TextAnalyzer analyzer = new TextAnalyzer(TEST_FILE_PATH);

        // Execute & Verify
        assertEquals(0, analyzer.totalWords());
        assertEquals(0, analyzer.uniqueWordCount());
        assertTrue(analyzer.topFrequentWords(1).isEmpty());
    }

    @Test(expected = IOException.class)
    public void testFileNotFound() throws IOException {
        TextAnalyzer analyzer = new TextAnalyzer("non_existent_file.txt");
    }

    @Test
    public void testTopFrequentWordsWithNGreaterThanUniqueWords() throws IOException {
        // Setup
        createTestFile("one two two three three three");
        TextAnalyzer analyzer = new TextAnalyzer(TEST_FILE_PATH);

        // Execute
        List<Map.Entry<String, Integer>> topWords = analyzer.topFrequentWords(10);

        // Verify
        assertEquals(3, topWords.size());
        Set<String> expectedKeys = new HashSet<>();
        expectedKeys.add("three");
        expectedKeys.add("two");
        expectedKeys.add("one");

        for (Map.Entry<String, Integer> entry : topWords) {
            assertTrue(expectedKeys.contains(entry.getKey()));
            expectedKeys.remove(entry.getKey());
        }
    }

    private void createTestFile(String content) throws IOException {
        File file = new File(TEST_FILE_PATH);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(content);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}