package com.infinum.bookpublisher.services;

import com.infinum.bookpublisher.domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public interface BookService {
    List<Book> listAllBooks();
    Optional<Book> findByISBN(String isbn);
}
