package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TextAnalyzerTest {

    private static final String FILE_NAME = "testfile.txt";

    @Before
    public void setup() throws Exception {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            writer.println("apple banana apple grape");
            writer.println("banana grape pineapple");
        }
    }

    @Test
    public void testTotalWords() {
        TextAnalyzer analyzer = new TextAnalyzer(FILE_NAME);
        assertEquals(7, analyzer.totalWords());
    }

    @Test
    public void testUniqueWordCount() {
        TextAnalyzer analyzer = new TextAnalyzer(FILE_NAME);
        assertEquals(4, analyzer.uniqueWordCount());
    }

    @Test
    public void testTopFrequentWords() {
        TextAnalyzer analyzer = new TextAnalyzer(FILE_NAME);
        List<Map.Entry<String, Integer>> topWords = analyzer.topFrequentWords(2);
        assertEquals("apple", topWords.get(0).getKey());
        assertEquals(2, (int) topWords.get(0).getValue());
        assertEquals("banana", topWords.get(1).getKey());
        assertEquals(2, (int) topWords.get(1).getValue());
    }
}
```

File: `FileWordReaderTest.java`

```java
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.io.PrintWriter;
import static org.junit.Assert.assertEquals;

