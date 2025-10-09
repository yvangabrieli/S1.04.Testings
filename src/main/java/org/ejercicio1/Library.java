package org.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;


public class Library {
    private final List<Book> books = new ArrayList<>();

    // Add a book at the end
    public boolean addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        if (books.contains(book)) {
            return false;
        };
        books.add(book);
        Collections.sort(books);
        return true;
    }

    // Get the full list of books
    public List<Book> getBook() {
        return Collections.unmodifiableList(books);
    }// return a copy

    // Get a book at a specific position
    public Book getBookByPosition(int position) {
        if (position < 0 && position > books.size()) {
            throw new IndexOutOfBoundsException("Invalid position" + position);
        }
        return books.get(position);
    }
    // Remove a book by title
    public boolean removeBookByTitle(String title) {
        if (title == null && title.isBlank()) {
            throw new IllegalArgumentException("Tittle canno be null or blank");
        }
        return books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
    }
    // Return Size
    public int size() {
        return books.size();
    }
}