package com.infinum.bookpublisher.services.impl;

import com.infinum.bookpublisher.DAO.AuthorRepository;
import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AuthorServiceJpa implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> listAllAuthors() {
        return this.authorRepository.findByOrderById();
    }

    @Override
    public Author createAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    @Override
    public Author deleteAuthor(Long authorId) {
        Author author = fetch(authorId);
        this.authorRepository.delete(author);
        return author;
    }

    @Override
    public Author fetch(Long authorId) {
        return this.authorRepository.findAuthorById(authorId).orElseThrow(IllegalArgumentException::new);
    }

}
