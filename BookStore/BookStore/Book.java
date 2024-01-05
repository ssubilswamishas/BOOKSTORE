package com.example.BookStore.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String isbn;
	    private String title;
	    private String author;
	    private double price;
	    @ElementCollection
	    private List<String> reviews;
	    
	    public Book  () {
	    	
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public List<String> getReviews() {
			return reviews;
		}
		public void setReviews(List<String> reviews) {
			this.reviews = reviews;
		}
		public Book(Long id, String isbn, String title, String author, double price, List<String> reviews) {
			super();
			this.id = id;
			this.isbn = isbn;
			this.title = title;
			this.author = author;
			this.price = price;
			this.reviews = reviews;
		}

}
