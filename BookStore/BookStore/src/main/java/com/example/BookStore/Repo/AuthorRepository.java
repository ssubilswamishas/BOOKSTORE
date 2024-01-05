package com.example.BookStore.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStore.model.Author;

@Repository
public interface AuthorRepository extends  JpaRepository<Author, Long>{
	
	 Author findById(long id);

}
