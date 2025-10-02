package ejercicio1;



import org.ejercicio1.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class LibraryRemoveBookTest {

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("Harry Potter", "J.K. Rowling");
        library.addBook("The Lord of the Rings", "J.R.R. Tolkien");
        assertTrue(library.removeBook("Harry Potter"));
        assertFalse(library.getBookList().contains("Harry Potter"));
        assertEquals(1, library.getBookList().size());
    }

    @Test
    public void testRemoveNonExistentBook() {
        Library library = new Library();
        library.addBook("Book A", "Author A");
        assertFalse(library.removeBook("Book B"));
        assertEquals(1, library.getBookList().size());
    }
}