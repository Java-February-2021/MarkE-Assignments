package com.mark.show.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mark.show.models.Book;
import com.mark.show.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bRepo;
	
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	public List<Book> getAllBooks() {
		return this.bRepo.findAll();
	}
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
	//with request params
	public Book createBookHTML(String title, String description, String language, int numberOfPages) {
		Book newBook = new Book(title, description, language, numberOfPages);
		return this.bRepo.save(newBook);
	}
	
	public void deleteBook(Long id) {
		this.bRepo.deleteById(id);
	}
	public Book updateBook(Long id, Book updateBook) {
		return this.bRepo.save(updateBook);
	}
}
