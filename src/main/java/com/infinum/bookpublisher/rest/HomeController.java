package com.infinum.bookpublisher.rest;

import com.infinum.bookpublisher.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

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

    @GetMapping("/auth_search")
    public String authSearch(){
        return "authSearch";
    }

    @GetMapping("/publish_book")
    public String publishBook(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "publishBook";
    }

}
