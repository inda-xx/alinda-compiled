package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileWordReaderTest {

    private static final String FILE_NAME = "testfile.txt";

    @Before
    public void setup() throws Exception {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            writer.println("Java programming language");
            writer.println("Java is robust");
        }
    }

    @Test
    public void testGetWords() {
        FileWordReader reader = new FileWordReader(FILE_NAME);
        List<String> words = reader.getWords();
        assertEquals(6, words.size());
        assertEquals("Java", words.get(0));
        assertEquals("programming", words.get(1));
        assertEquals("language", words.get(2));
    }

    @Test
    public void testEmptyFile() throws Exception {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            writer.print("");
        }
        FileWordReader reader = new FileWordReader(FILE_NAME);
        List<String> words = reader.getWords();
        assertEquals(0, words.size());
    }
}
```

File: `WordCounterTest.java`

```java
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

