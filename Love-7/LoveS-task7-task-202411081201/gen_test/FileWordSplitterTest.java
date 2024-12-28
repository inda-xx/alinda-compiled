package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileWordSplitterTest {

    private static final String FILE_NAME = "testfile.txt";

    @Before
    public void setup() throws Exception {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            writer.println("Splitting words example");
            writer.println("Using Java");
        }
    }

    @Test
    public void testGetWords() {
        FileWordSplitter splitter = new FileWordSplitter(FILE_NAME);
        ArrayList<String> words = splitter.getWords();
        assertEquals(4, words.size());
        assertEquals("Splitting", words.get(0));
        assertEquals("words", words.get(1));
        assertEquals("example", words.get(2));
        assertEquals("Using", words.get(3));
    }

    @Test
    public void testEmptyFile() throws Exception {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            writer.print("");
        }
        FileWordSplitter splitter = new FileWordSplitter(FILE_NAME);
        ArrayList<String> words = splitter.getWords();
        assertEquals(0, words.size());
    }
}
```

These test files ensure comprehensive coverage, testing edge cases and potential failure points such as file not found scenarios, empty files, and correct word counting functionality.