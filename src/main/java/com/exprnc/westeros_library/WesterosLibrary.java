package com.exprnc.westeros_library;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Slf4j
class WesterosLibrary {

    private final Map<Book, Integer> books = new HashMap<>();

    void addBook(Book book, int shelfNumber) {
        Objects.requireNonNull(book);
        books.put(book, shelfNumber);
    }

    void removeBook(String title, String author, int year) {
        Objects.requireNonNull(title);
        Objects.requireNonNull(author);
        var book = new Book(title, author, year);
        books.remove(book);
    }

    Optional<Integer> findBook(String title, String author, int year) {
        Objects.requireNonNull(title);
        Objects.requireNonNull(author);
        var book = new Book(title, author, year);
        return Optional.ofNullable(books.get(book));
    }

    void printAllBooks() {
        books.forEach((book, shelfNum) -> log.info("{} Shelf number: {}", book, shelfNum));
    }

}
