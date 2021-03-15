package com.mark.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/books/add")
	public String create(@ModelAttribute("book")Book book) {
		return "newBook.jsp";
	}
	
	@PostMapping("/books/add") 
	public String addBook(@ModelAttribute("book")Book book,BindingResult result, @RequestParam("title") String title, @RequestParam("description") String description, @RequestParam("language") String language, @RequestParam("numberOfPages") int numberOfPages) {
		this.bService.createBookHTML(title, description, language, numberOfPages);
		return "redirect:/books/{id}";
	}
	@GetMapping("/books/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model viewModel) {
		Book book = this.bService.getOneBook(id);
		viewModel.addAttribute("book", book);
		return "editBook.jsp";
	}
	
	@PostMapping("/books/edit/{id}")
	public String editBook(@ModelAttribute("book")Book book, BindingResult result, Model viewModel, @PathVariable("id")Long id) {
			this.bService.updateBook(id, book);
			return "redirect:/books/{id}";
	}
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		bService.deleteBook(id);
		return "redirect:/books";
	}
}
