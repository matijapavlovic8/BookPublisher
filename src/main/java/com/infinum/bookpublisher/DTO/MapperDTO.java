package com.infinum.bookpublisher.DTO;

import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.domain.Genre;

public class MapperDTO {
    public static Book dtoToBook(BookDTO dto){
        return new Book(dto.getISBN(), dto.getTitle(), dto.getGenre(), dto.getAuthors());
    }

    public static BookDTO bookToDTO(Book book){
        return new BookDTO(book.getISBN(), book.getTitle(), book.getGenre(), book.getAuthors());
    }

    public static Author dtoToAuthor(AuthorDTO dto){
        return new Author(dto.getName(), dto.getLastname());
    }

    public static AuthorDTO authorToDTO(Author author){
        return new AuthorDTO(author.getId(), author.getName(), author.getLastName(), author.getNumberOfPublishedBooks());
    }
}
