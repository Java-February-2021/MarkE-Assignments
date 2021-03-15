package com.mark.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mark.show.models.Book;
import com.mark.show.services.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bService;
	
	@GetMapping("/books")
	public String index(Model viewModel) {
		List<Book> allBooks = this.bService.getAllBooks();
		viewModel.addAttribute("allBooks", allBooks);
		return "index.jsp";
	}
	@GetMapping("/books/{id}")
	public String showBook(Model viewModel, @PathVariable("id")Long id) {
		Book book = this.bService.getOneBook(id);
		viewModel.addAttribute("book", book);
		return "showBook.jsp";
	}
}
