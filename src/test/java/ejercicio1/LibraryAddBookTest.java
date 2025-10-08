package ejercicio1;

import org.ejercicio1.Book;
import org.ejercicio1.Library;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryAddBookTest {

    @Test
    public void testAddBook(){
    Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        assertTrue(library.addBook(book1));
        assertTrue(library.addBook(book2));
        assertEquals(2, library.size());
    }

    @Test
    void testBookListIsNotNullAfterCreation() {
        Library library = new Library();

        assertNotNull(library.getBook(), "Book list should not be null after creation");
    }

    @Test
    void testBookListHasExpectedSizeAfterAddingBooks() {
        Library library = new Library();
        library.addBook(new Book("Book A", "Author A"));
        library.addBook(new Book("Book B", "Author B"));
        library.addBook(new Book("Book C", "Author C"));

        assertEquals(3, library.size(), "Library should contain 3 books");
    }
    @Test
    void testNoDuplicateBooks() {
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book duplicate = new Book("Harry Potter", "J.K. Rowling");

        library.addBook(book1);
        assertFalse(library.addBook(duplicate));  // should not add duplicate
        assertEquals(1, library.size());
    }


    @Test
    void testGetBookByInvalidPosition() {
        Library library = new Library();
        library.addBook(new Book("Book X", "Author X"));
        assertThrows(IndexOutOfBoundsException.class, () -> library.getBookByPosition(2));
    }

    @Test
    void testListRemainsAlphabeticallySorted() {
        Library library = new Library();
        library.addBook(new Book("Zorro", "Author Z"));
        library.addBook(new Book("Alice in Wonderland", "Lewis Carroll"));
        library.addBook(new Book("Moby Dick", "Herman Melville"));

        List<Book> books = library.getBook();

        assertEquals("Alice in Wonderland", books.get(1).getTitle());
        assertEquals("Moby Dick", books.get(2).getTitle());
        assertEquals("Zorro", books.get(0).getTitle());
    }
}