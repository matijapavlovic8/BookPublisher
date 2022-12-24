package com.infinum.bookpublisher.services;

import com.infinum.bookpublisher.domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BookService {
    List<Book> listAllBooks();
    Optional<Book> findByISBN(String isbn);
    List<Book> findByTitle(String title);
    Book addBook(Book book);
    Book removeBook(String isbn);


}
