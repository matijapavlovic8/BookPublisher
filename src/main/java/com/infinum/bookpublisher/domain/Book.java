package com.infinum.bookpublisher.domain;

import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.Genre;
import lombok.NoArgsConstructor;

import java.util.Collection;
import javax.persistence.*;

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
    private Genre genre;

    /**
     * List of books authors.
     */
    @ManyToMany
    @JoinTable(name = "book_authors", joinColumns = @JoinColumn(name = "book_id",
    referencedColumnName = "author_id"), inverseJoinColumns = @JoinColumn(name = "author_id",
    referencedColumnName = "book_id"))
    private Collection<Author> authors;

    public Book(String isbn, String title, Genre genre, Collection<Author> authors){
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
}
