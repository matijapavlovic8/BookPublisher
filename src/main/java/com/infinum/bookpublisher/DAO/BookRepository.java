package com.infinum.bookpublisher.DAO;

import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String> {
    Optional<Book> findByISBN(String s);
    List<Book> findBookByTitle(String title);
    List<Book> findBookByGenreOrderByTitle(Genre genre);
}
