package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileReaderWithMapTest {

    private FileReaderWithMap fileReaderWithMap;

    @Before
    public void setUp() throws IOException {
        File file = File.createTempFile("testFile", ".txt");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("apple banana apple orange apple banana");
        }
        
        fileReaderWithMap = new FileReaderWithMap(file.getAbsolutePath());
        
        file.deleteOnExit();
    }

    @Test
    public void countWordCorrectly() {
        assertEquals(3, fileReaderWithMap.getWordCount("apple"));
        assertEquals(2, fileReaderWithMap.getWordCount("banana"));
        assertEquals(1, fileReaderWithMap.getWordCount("orange"));
    }

    @Test
    public void frequencyCalculationIsCorrect() {
        assertEquals(3.0/6.0, fileReaderWithMap.getFrequency("apple"), 0.0001);
        assertEquals(1.0/6.0, fileReaderWithMap.getFrequency("orange"), 0.0001);
        assertEquals(0.0, fileReaderWithMap.getFrequency("nonexistent"), 0.0001);
    }

    @Test
    public void handlesEmptyFilesCorrectly() throws IOException {
        File emptyFile = File.createTempFile("emptyTest", ".txt");
        fileReaderWithMap = new FileReaderWithMap(emptyFile.getAbsolutePath());
        
        assertEquals(0, fileReaderWithMap.getWordCount("anything"));
        assertEquals(0.0, fileReaderWithMap.getFrequency("anything"), 0.0001);
        
        emptyFile.deleteOnExit();
    }

    @Test
    public void handlesLargeFilesWithoutErrors() throws IOException {
        File largeFile = File.createTempFile("largeTest", ".txt");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(largeFile))) {
            for (int i = 0; i < 100000; i++) {
                writer.write("word ");
            }
        }
        
        fileReaderWithMap = new FileReaderWithMap(largeFile.getAbsolutePath());
        assertEquals(100000, fileReaderWithMap.getWordCount("word"));
        
        largeFile.deleteOnExit();
    }
}