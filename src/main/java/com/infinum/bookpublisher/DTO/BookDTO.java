package com.infinum.bookpublisher.DTO;

import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.Genre;

import java.util.Collection;

public class BookDTO {
    private String ISBN;
    private String title;
    private Genre genre;
    private Collection<Author> authors;

    public BookDTO(String ISBN, String title, Genre genre, Collection<Author> authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.genre = genre;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Collection<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<Author> authors) {
        this.authors = authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
