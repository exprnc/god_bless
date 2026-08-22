package com.exprnc.westeros_library;

import java.util.Objects;

class Book {

    private final String title;
    private final String author;
    private final int year;

    Book(String title, String author, int year) {
        Objects.requireNonNull(title);
        Objects.requireNonNull(author);
        this.title = title;
        this.author = author;
        this.year = year;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }
    
    int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        var book = (Book) obj;
        return Objects.equals(title, book.title)
                && Objects.equals(author, book.author)
                && year == book.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

}
