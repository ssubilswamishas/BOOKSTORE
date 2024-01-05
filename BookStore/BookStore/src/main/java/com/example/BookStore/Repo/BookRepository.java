package com.example.BookStore.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStore.model.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long>{
	
	List<Book> findByTitleContainingIgnoreCase(String title);
    Book findByIsbn(String isbn);

}
