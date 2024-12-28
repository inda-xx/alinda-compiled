package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    
    @Test
    public void testAddBookAndListBooks() {
        Library library = new Library();
        Book book = new Book("Title", "Author", 2020, "123-456-789");
        library.addBook(book);
        List<Book> books = library.listBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }
    
    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        Book book = new Book("Title", "Author", 2020, "123-456-789");
        library.addBook(book);
        Book found = library.findBookByTitle("Title");
        assertNotNull(found);
        assertEquals(book, found);
    }
    
    @Test
    public void testUpdateBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", 2020, "123-456-789");
        library.addBook(book);
        boolean updated = library.updateBook("Title", "NewTitle", 2021);
        assertTrue(updated);
        assertNull(library.findBookByTitle("Title"));
        Book updatedBook = library.findBookByTitle("NewTitle");
        assertNotNull(updatedBook);
        assertEquals(2021, updatedBook.getYearPublished());
    }

    @Test
    public void testUpdateNonExistentBook() {
        Library library = new Library();
        boolean updated = library.updateBook("NonExistentTitle", "NewTitle", 2021);
        assertFalse(updated);
    }
}
```

DeckTest.java
```
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

