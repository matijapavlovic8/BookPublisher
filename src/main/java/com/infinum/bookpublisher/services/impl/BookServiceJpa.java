package com.infinum.bookpublisher.services.impl;

import com.infinum.bookpublisher.DAO.BookRepository;
import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceJpa implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> listAllBooks() {
        return null;
    }

    @Override
    public Optional<Book> findByISBN(String isbn) {
        return Optional.empty();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return this.bookRepository.findBookByTitle(title);
    }

    @Override
    public Book addBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public Book removeBook(String isbn) {
        Book book = findByISBN(isbn).orElseThrow(IllegalArgumentException::new);
        this.bookRepository.delete(book);
        return book;
    }
}
