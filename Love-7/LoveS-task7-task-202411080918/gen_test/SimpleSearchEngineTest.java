package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleSearchEngineTest {

    private SimpleSearchEngine searchEngine;

    @Before
    public void setUp() throws IOException {
        // Setup temporary files for testing
        File file1 = File.createTempFile("test1", ".txt");
        File file2 = File.createTempFile("test2", ".txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
            writer.write("Hello world\nThis is a test file.");
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            writer.write("Another test file\nHello there.");
        }

        // Initialize search engine with the test files
        searchEngine = new SimpleSearchEngine(new String[]{file1.getAbsolutePath(), file2.getAbsolutePath()});
        
        file1.deleteOnExit();
        file2.deleteOnExit();
    }

    @Test
    public void searchFindsWordsInSingleFile() {
        List<String> result = searchEngine.search("hello");
        assertEquals(2, result.size());
    }

    @Test
    public void searchReturnsEmptyListForNonExistingWords() {
        List<String> result = searchEngine.search("nonexistent");
        assertTrue(result.isEmpty());
    }

    @Test
    public void searchIsCaseInsensitive() {
        List<String> result1 = searchEngine.search("WORLD");
        List<String> result2 = searchEngine.search("world");
        assertEquals(result1, result2);
    }
    
    @Test
    public void handlesEmptyFilesWithoutErrors() throws IOException {
        File file = File.createTempFile("emptyTest", ".txt");
        
        searchEngine = new SimpleSearchEngine(new String[]{file.getAbsolutePath()});
        List<String> result = searchEngine.search("anything");
        assertTrue(result.isEmpty());
        
        file.deleteOnExit();
    }

    @Test
    public void handlesLargeFilesEfficiently() throws IOException {
        File largeFile = File.createTempFile("largeTest", ".txt");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(largeFile))) {
            for (int i = 0; i < 100000; i++) {
                writer.write("word" + i + " ");
            }
        }
        
        long startTime = System.currentTimeMillis();
        searchEngine = new SimpleSearchEngine(new String[]{largeFile.getAbsolutePath()});
        long duration = System.currentTimeMillis() - startTime;
        
        // Assert if the processing was reasonably fast (e.g., less than 2 seconds)
        assertTrue(duration < 2000);
        
        largeFile.deleteOnExit();
    }
}

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

