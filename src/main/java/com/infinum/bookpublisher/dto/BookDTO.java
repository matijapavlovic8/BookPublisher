package com.infinum.bookpublisher.dto;

import com.infinum.bookpublisher.domain.Genre;

public class BookDTO {
    private String ISBN;
    private String title;
    private Genre genre;
    private String authors;

    public BookDTO(String ISBN, String title, Genre genre, String authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.genre = genre;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthors() {
        return authors;
    }

    public String getISBN() {
        return ISBN;
    }
}
