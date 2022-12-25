package com.infinum.bookpublisher.rest;

import com.infinum.bookpublisher.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorController {
    //@Autowired
    private AuthorService authorService;

    @RequestMapping("/search/author")
    public String authorSearch(@RequestParam(value = "fullname", required = false) String fullname, Model model){
        model.addAttribute("search", authorService.findAuthor(fullname));
        return "authSearch";

    }
}
