package com.infinum.bookpublisher.services;

import com.infinum.bookpublisher.dao.AuthorRepository;
import com.infinum.bookpublisher.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> listAllAuthors() {
        return this.authorRepository.findByOrderById();
    }

    public Author createAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    public Author deleteAuthor(Long authorId) {
        Author author = fetch(authorId).orElse(null);
        assert author != null;
        this.authorRepository.delete(author);
        return author;
    }

    public Optional<Author> fetch(Long authorId) {
        return this.authorRepository.findAuthorById(authorId);
    }

    public Author findAuthor(String fullname){
        fullname = fullname.trim();
        String name = fullname.split("\\s+")[0];
        String lastname = fullname.split("\\s+")[1];
        return this.authorRepository.findByNameAndLastName(name, lastname).orElse(null);
    }


    public void incrementTheNumberOfPublishedBooks(Author author){
        author.setNumberOfPublishedBooks(author.getNumberOfPublishedBooks() + 1);
    }
}
