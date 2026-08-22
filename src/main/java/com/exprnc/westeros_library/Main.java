package com.exprnc.westeros_library;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Main {

    static void main() {
        var library = new WesterosLibrary();
        var firstBook = new Book("first book", "first author", 1);
        library.addBook(firstBook, 1);
        library.addBook(new Book("second book", "second author", 2), 2);
        var thirdBook = new Book("third book", "third author", 3);
        library.addBook(thirdBook, 3);
        library.addBook(new Book("fourth book", "fourth author", 4), 4);
        library.removeBook(thirdBook.getTitle(), thirdBook.getAuthor(), thirdBook.getYear());
        library.findBook(firstBook.getTitle(), firstBook.getAuthor(), firstBook.getYear())
                .ifPresent(shelfNum -> log.info("Founded shelf number: {}", shelfNum));
        library.printAllBooks();
    }

}
