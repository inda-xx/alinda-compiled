import java.util.List;
import java.util.ArrayList;

public class LibrarySystem {
    private Library library;

    public LibrarySystem() {
        this.library = new Library();
    }

    public ArrayList<Book> loadBooksFromFile(String filename) {
        ArrayList<Book> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 4) {
                    String title = details[0].trim();
                    String author = details[1].trim();
                    int yearPublished = Integer.parseInt(details[2].trim());
                    String isbn = details[3].trim();
                    Book book = new Book(title, author, yearPublished, isbn);
                    books.add(book);
                    library.addBook(book);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing book details: " + e.getMessage());
        }
        return books;
    }

    public void displayLibraryMenu() {
        System.out.println("Welcome to the Library Management System");
        System.out.println("1. Add a book");
        System.out.println("2. List all books");
        System.out.println("3. Find a book by title");
        System.out.println("4. Update book details");
        System.out.println("5. Exit");
    }
}