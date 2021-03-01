package com.mark.gettingfamiliarwithrouting.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication	
@RestController
public class CodingController {
	@RequestMapping("/coding") 
	public String hello() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String java() {
		return "Java/Spring is better!";
	}
}