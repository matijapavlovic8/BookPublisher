package com.infinum.bookpublisher.dto;

import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.Book;

import java.util.ArrayList;
import java.util.Collection;

public class MapperDTO {
    public static Book dtoToBook(BookDTO dto){
        String[] authors = dto.getAuthors().split(",");
        Collection<Author> authorsList = new ArrayList<>();
        for(String author: authors){
            author = author.trim();
            String[] splits = author.split("\\s+");
            authorsList.add(new Author(splits[0], splits[1]));
        }

        return new Book(dto.getISBN(), dto.getTitle(), dto.getGenre(), authorsList);
    }


    public static Author dtoToAuthor(AuthorDTO dto){
        return new Author(dto.getName(), dto.getLastname());
    }

    public static AuthorDTO authorToDTO(Author author){
        return new AuthorDTO(author.getId(), author.getName(), author.getLastName(), author.getNumberOfPublishedBooks());
    }
}
