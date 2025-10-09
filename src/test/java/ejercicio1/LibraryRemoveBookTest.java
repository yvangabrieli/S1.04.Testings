package ejercicio1;



import org.ejercicio1.Book;
import org.ejercicio1.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class LibraryRemoveBookTest {
    @Test
    void testRemoveBookByTitle() {
        Library library = new Library();
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("The Godfather", "Mario Puzo"));

        Assertions.assertTrue(library.removeBookByTitle("The Alchemist"));
        Assertions.assertEquals(1, library.size());
        Assertions.assertFalse(library.removeBookByTitle("Unknown Book"));
    }

}