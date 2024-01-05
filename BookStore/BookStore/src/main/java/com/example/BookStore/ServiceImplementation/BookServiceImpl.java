package com.example.BookStore.ServiceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookStore.Repo.BookRepository;
import com.example.BookStore.model.Book;
import com.example.BookStore.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> searchBooks(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(String isbn, Book updatedBook) {
        Book existingBook = getBookByIsbn(isbn);
        if (existingBook != null) {
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setPrice(updatedBook.getPrice());
            return bookRepository.save(existingBook);
        }
        return null; 
    }

    @Override
    public void deleteBook(String isbn) {
        Book existingBook = getBookByIsbn(isbn);
        if (existingBook != null) {
            bookRepository.delete(existingBook);
        }
    }

    @Override
    public void addReview(String isbn, String review) {
        Book existingBook = getBookByIsbn(isbn);
        if (existingBook != null) {
            List<String> reviews = existingBook.getReviews();
            
            if (reviews == null) {
                reviews = new ArrayList<>();
            }

            reviews.add(review);
            existingBook.setReviews(reviews);
            bookRepository.save(existingBook);
        }
 
    }

}
