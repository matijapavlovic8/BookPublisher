package com.infinum.bookpublisher.rest;

import com.infinum.bookpublisher.dto.BookDTO;
import com.infinum.bookpublisher.dto.MapperDTO;
import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.domain.Genre;
import com.infinum.bookpublisher.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    //@Autowired
    private BookService bookService;

    @PostMapping("/publish")
    public String bookPublish(@ModelAttribute("book") BookDTO book, Model model){
       bookService.addBook(MapperDTO.dtoToBook(book));
       return "home";
   }
    @RequestMapping("/search/title")
    public String titleSearch(Model model, String title){
        List<Book> books;
        System.out.println(title);
        books = this.bookService.findByTitle(title);
        model.addAttribute("books", books);
        return "bookSearch";
    }
    @RequestMapping("/search/genre")
    public String genreSearch(Model model, String strGenre){
        Genre genre = new Genre(strGenre);
        List<Book> books = bookService.findByGenre(genre);
        model.addAttribute("books", books);
        return "bookSearch";
    }
    @RequestMapping("/search/isbn")
    public String isbnSearch(Model model, String isbn){
        Optional<Book> book = this.bookService.findByISBN(isbn);
        List<Book> books = new ArrayList<>();
        book.ifPresent(books::add);
        model.addAttribute("books", books);
        return "bookSearch";
    }
}
