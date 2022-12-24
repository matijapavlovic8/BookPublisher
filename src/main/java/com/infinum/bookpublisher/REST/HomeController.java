package com.infinum.bookpublisher.REST;

import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/sign_in")
    public String signIn() {
        return "signInPage";
    }

    @GetMapping("/book_search")
    public String search() {
        return "bookSearch";
    }

    @GetMapping("/search_result")
    public String result(){
        return "searchResult";
    }

    @GetMapping("/auth_search")
    public String authSearch(){
        return "authSearch";
    }

    @GetMapping("/auth_result")
    public String authResult(){
        return "authSearchResult";
    }

    @GetMapping("publish")
    public String publishBook(){
        return "publishBook";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        return "";
    }

}
