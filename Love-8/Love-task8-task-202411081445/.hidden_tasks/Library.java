import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Library {
    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books.values());
    }

    public Book findBookByTitle(String title) {
        return books.get(title);
    }

    public boolean updateBook(String title, String newTitle, int newYear) {
        Book book = books.get(title);
        if (book != null) {
            book.setTitle(newTitle);
            book.setYearPublished(newYear);
            books.remove(title);
            books.put(newTitle, book);
            return true;
        }
        return false;
    }
}