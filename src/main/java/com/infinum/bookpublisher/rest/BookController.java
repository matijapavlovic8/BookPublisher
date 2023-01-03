package com.infinum.bookpublisher.rest;

import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.GenreType;
import com.infinum.bookpublisher.dto.BookDTO;
import com.infinum.bookpublisher.dto.MapperDTO;
import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.domain.Genre;
import com.infinum.bookpublisher.services.AuthorService;
import com.infinum.bookpublisher.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @PostMapping("/publish")
    public String bookPublish(@ModelAttribute("book") BookDTO bookDTO, Model model){
        Book book = MapperDTO.dtoToBook(bookDTO);
        List<Author> updatedAuths = new ArrayList<>();
        book.getAuthors().forEach(author -> {
            String fullname = author.getName() + " " + author.getLastName();
            if(authorService.findAuthor(fullname) != null){
                updatedAuths.add(authorService.findAuthor(fullname));
            } else {
                updatedAuths.add(author);
            }
        });
        book.setAuthors(updatedAuths);
        bookService.addBook(book);
        return "home";
   }
    @PostMapping("/search")
    public String bookSearch(Model model, @RequestParam("search") String search){
        List<Book> books;
        books = this.bookService.findByTitle(search);
        this.bookService.findByISBN(search).ifPresent(books::add);
        Genre genre = new Genre(search);
        if (genre.getGenre() != GenreType.OTHER)
            books.addAll(this.bookService.findByGenre(genre));
        model.addAttribute("books", books);
        model.addAttribute("pressed", true);
        return "bookSearch";
    }
}
