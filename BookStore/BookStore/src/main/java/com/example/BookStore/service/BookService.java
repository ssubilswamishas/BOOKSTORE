package com.example.BookStore.service;

import java.util.List;

import com.example.BookStore.model.Book;

public interface BookService {
	
	 List<Book> getAllBooks();
	    List<Book> searchBooks(String title);
	    Book getBookByIsbn(String isbn);
	    Book addBook(Book book);
	    Book updateBook(String isbn, Book updatedBook);
	    void deleteBook(String isbn);
	    void addReview(String isbn, String review);

}
