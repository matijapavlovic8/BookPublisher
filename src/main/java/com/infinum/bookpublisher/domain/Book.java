package com.infinum.bookpublisher.domain;

import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.Genre;
import lombok.NoArgsConstructor;

import java.util.Collection;
import jakarta.persistence.*;

/**
 * Instances of class {@code Book} represent books in the publishing service.
 * @author MatijaPav
 */
@Entity
@Table(name = "book")
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Books unique international standard book number.
     */
    @Column(name = "isbn", nullable = false, unique = true)
    private String ISBN;

    /**
     * Title of the book.
     */
    @Column(name = "title")
    private String title;

    /**
     * Genre of the book.
     */
    @Column(name = "genre")
    private String genre;

    /**
     * List of books authors.
     */
    @ManyToMany (
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    @JoinTable(
        name = "authors",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Collection<Author> authors;


    public Book(String isbn, String title, String genre, Collection<Author> authors){
        this.ISBN = isbn;
        this.title = title;
        this.genre = genre;
        this.authors = authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return new Genre(genre);
    }

    public void setGenre(Genre genre) {
        this.genre = genre.toString();
    }

    public Collection<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<Author> authors) {
        this.authors = authors;
    }
}
