package com.infinum.bookpublisher.DTO;

public class AuthorDTO {
    private long id;
    private String name;
    private String lastname;
    private int numberOfPublishedBooks;

    public AuthorDTO(long id, String name, String lastname, int numberOfPublishedBooks) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.numberOfPublishedBooks = numberOfPublishedBooks;
    }

    public long getId() {
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getNumberOfPublishedBooks() {
        return numberOfPublishedBooks;
    }

    public void setNumberOfPublishedBooks(int numberOfPublishedBooks) {
        this.numberOfPublishedBooks = numberOfPublishedBooks;
    }
}
