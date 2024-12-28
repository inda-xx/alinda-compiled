package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileTextAnalyzerTest {

    private static final String FILE_NAME = "testfile.txt";

    @Before
    public void setup() throws Exception {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            writer.println("Hello world");
            writer.println("hello World");
        }
    }

    @Test
    public void testWordOccurrences() {
        FileTextAnalyzer analyzer = new FileTextAnalyzer(FILE_NAME);
        assertEquals(2, analyzer.occurrencesOf("hello"));
        assertEquals(2, analyzer.occurrencesOf("world"));
        assertEquals(0, analyzer.occurrencesOf("missing"));
    }

    @Test
    public void testUniqueWordCount() {
        FileTextAnalyzer analyzer = new FileTextAnalyzer(FILE_NAME);
        assertEquals(2, analyzer.uniqueWordCount());
    }

    @Test
    public void testFrequencyOfWord() {
        FileTextAnalyzer analyzer = new FileTextAnalyzer(FILE_NAME);
        assertEquals(0.5, analyzer.frequencyOf("hello"), 0.01);
        assertEquals(0.5, analyzer.frequencyOf("world"), 0.01);
        assertEquals(0.0, analyzer.frequencyOf("missing"), 0.01);
    }

    @Test
    public void testFileNotFound() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            new FileTextAnalyzer("invalidfile.txt");
        });
        assertTrue(exception.getMessage().contains("An error occurred while reading the file"));
    }
}
```

File: `TextAnalyzerTest.java`

```java
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.io.PrintWriter;
import static org.junit.Assert.assertEquals;

