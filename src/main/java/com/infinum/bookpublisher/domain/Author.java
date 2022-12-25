package com.infinum.bookpublisher.domain;

import javax.persistence.*;

/**
 * Instances of class {@code Author} represent authors of books.
 * @author MatijaPav
 */
@Entity
@Table(name = "author")
public class Author {
    /**
     * Authors unique identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    /**
     * Authors name.
     */
    @Column(name = "name", length = 50)
    private String name;

    /**
     * Authors lastname.
     */
    @Column(name = "lastname", length = 50)
    private String lastName;

    @Column(name = "num_of_published_books")
    private int numberOfPublishedBooks;

    public Author(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.numberOfPublishedBooks = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfPublishedBooks() {
        return numberOfPublishedBooks;
    }

    public void setNumberOfPublishedBooks(int numberOfPublishedBooks) {
        this.numberOfPublishedBooks = numberOfPublishedBooks;
    }

}
