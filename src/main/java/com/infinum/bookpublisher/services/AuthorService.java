package com.infinum.bookpublisher.services;

import com.infinum.bookpublisher.domain.Author;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface AuthorService {
    List<Author> listAllAuthors();
    Author createAuthor(Author author);
    Author deleteAuthor(Long authorId);
    Author fetch(Long id);
}
