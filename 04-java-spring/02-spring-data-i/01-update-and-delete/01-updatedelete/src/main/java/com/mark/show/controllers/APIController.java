package com.mark.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.show.models.Book;
import com.mark.show.services.BookService;

@RestController
@RequestMapping("/api")
public class APIController {
	@Autowired
	private BookService bService;
	
	@GetMapping("books")
	public List<Book> index() {
		return this.bService.getAllBooks();
	}
	
	@GetMapping("books/{id}")
	public Book getBook(@PathVariable("id")Long id) {
		return this.bService.getOneBook(id);
	}
	
	@PostMapping("add")
	public Book createBook(Book newBook) {
		return this.bService.createBook(newBook);
	}
	
	@DeleteMapping("books/{id}")
	public String deleteBook(@PathVariable("id")Long id) {
		this.bService.deleteBook(id);
		return "Deleted" + id;
	}
}
