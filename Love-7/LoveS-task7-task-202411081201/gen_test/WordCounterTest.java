package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordCounterTest {

    @Test
    public void testCountWords() {
        WordCounter counter = new WordCounter();
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");

        counter.countWords(words);

        assertEquals(2, counter.getOccurrencesOf("apple"));
        assertEquals(1, counter.getOccurrencesOf("banana"));
        assertEquals(0, counter.getOccurrencesOf("grape"));
    }

    @Test
    public void testFrequencyOfWord() {
        WordCounter counter = new WordCounter();
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apple");
        words.add("banana");

        counter.countWords(words);
        int totalWords = words.size();

        assertEquals(2.0 / 3, counter.getFrequencyOf("apple", totalWords), 0.01);
        assertEquals(1.0 / 3, counter.getFrequencyOf("banana", totalWords), 0.01);
        assertEquals(0.0, counter.getFrequencyOf("grape", totalWords), 0.01);
    }
}
```

File: `FileWordSplitterTest.java`

```java
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.io.PrintWriter;
import static org.junit.Assert.assertEquals;

