package com.mark.dojosurvey.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mark.dojosurvey.models.Survey;

@SpringBootApplication
@Controller
public class MainController {
	@RequestMapping("/")
	public String form() {
		return "index.jsp";
	}
	@RequestMapping(path="/results", method=RequestMethod.POST)
	public String submit(@RequestParam(value="name") String name, 
			@RequestParam(value="location") String location, 
			@RequestParam(value="language") String language, 
			@RequestParam(value="comment") String comment, 
			Model model ) {
		model.addAttribute("results", new Survey(name, location, language, comment));
		return "results.jsp";
	}
}
