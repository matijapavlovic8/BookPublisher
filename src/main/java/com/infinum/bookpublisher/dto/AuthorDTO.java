package com.infinum.bookpublisher.dto;

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

    public String getName() {
        return name;
    }


    public String getLastname() {
        return lastname;
    }

    public int getNumberOfPublishedBooks() {
        return numberOfPublishedBooks;
    }


}
