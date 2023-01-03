package com.infinum.bookpublisher.services;

import com.infinum.bookpublisher.dao.BookRepository;
import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.domain.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> listAllBooks() {
        return this.bookRepository.findAll();
    }

    public Optional<Book> findByISBN(String isbn) {
        return this.bookRepository.findByISBN(isbn);
    }

    public List<Book> findByTitle(String title) {
        return this.bookRepository.findBookByTitle(title);
    }

    public void addBook(Book book) {
        book.getAuthors().forEach(Author::increaseNumberOfPublishedBooks);
        this.bookRepository.save(book);
    }

    public Book removeBook(String isbn) {
        Book book = findByISBN(isbn).orElse(null);
        assert book != null;
        this.bookRepository.delete(book);
        return book;
    }

    public List<Book> findByGenre(Genre genre) {
        return this.bookRepository.findBookByGenreOrderByTitle(genre.toString());
    }
}
