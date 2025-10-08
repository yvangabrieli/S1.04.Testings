package org.ejercicio1;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;

    public Book(String title, String author) {
        if ((title == null) && title.isBlank()) {
            throw new IllegalArgumentException("The Title cannot be Blank or Empty");
        }
        if ((author == null) && author.isBlank()) {
            throw new IllegalArgumentException("The Author cannot be Blank or Empty");
        }
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return title;
    }

    @Override
    public String toString() {
        return "Title book: " + this.title + "\n Author: " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equalsIgnoreCase(book.title) && author.equalsIgnoreCase(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }

    @Override
    public int compareTo(Book other) {
        return this.title.toLowerCase().compareTo(other.title);
    }
}