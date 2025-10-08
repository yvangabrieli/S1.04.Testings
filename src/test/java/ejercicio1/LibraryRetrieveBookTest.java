package ejercicio1;

import org.ejercicio1.Book;
import org.ejercicio1.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class LibraryRetrieveBookTest {
    @Test
    void testGetBookByPosition() {
        Library library = new Library();
        Book bookA = new Book("Book A", "Author A");
        Book bookB = new Book("Book B", "Author B");

        library.addBook(bookA);
        library.addBook(bookB);

        Assertions.assertEquals("bookA", library.getBookByPosition(0));
        Assertions.assertEquals("Book B", library.getBookByPosition(1).getTitle());
    }



    @Test
    void testInvalidBookCreation() {
        assertThrows(IllegalArgumentException.class, () -> new Book("", "Author"));
        assertThrows(IllegalArgumentException.class, () -> new Book("Title", null));
    }


}
