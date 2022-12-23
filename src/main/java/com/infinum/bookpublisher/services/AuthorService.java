package com.infinum.bookpublisher.services;

import com.infinum.bookpublisher.domain.Author;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AuthorService {
    List<Author> listAllAuthors();
    Author createAuthor(Author author);
    Author deleteAuthor(Author author);
    Author fetch(Long id);
    Optional<Author> findById(Long id);
}
