package com.example.BookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookStore.model.Author;
import com.example.BookStore.service.AuthorService;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
	
	@Autowired
    private AuthorService authorService;

    @GetMapping("/{authorId}")
    public Author getAuthorById(@PathVariable long authorId) {
        return authorService.getAuthorById(authorId);
    }

}
