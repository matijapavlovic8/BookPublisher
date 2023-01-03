package com.infinum.bookpublisher.rest;

import com.infinum.bookpublisher.domain.Author;
import com.infinum.bookpublisher.domain.Book;
import com.infinum.bookpublisher.domain.Genre;
import com.infinum.bookpublisher.domain.GenreType;
import com.infinum.bookpublisher.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/searchauth")
    public String authSearch(Model model, @RequestParam("search") String search){
        boolean pressed = false;
        if(search.isEmpty()){
            pressed = true;
            return "authSearch";
        }
        Author auth = this.authorService.findAuthor(search);
        if(auth != null){
            pressed = true;
            model.addAttribute("auth_res", auth);
        }
        model.addAttribute("pressed", pressed);
        return "authSearch";
    }
}
