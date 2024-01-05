package com.example.BookStore.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookStore.Repo.AuthorRepository;
import com.example.BookStore.model.Author;
import com.example.BookStore.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	 @Autowired
	    private AuthorRepository authorRepository;

	    @Override
	    public Author getAuthorById(long id) {
	        return authorRepository.findById(id);
	    }

}
