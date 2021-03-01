package com.mark.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping(value="/random", method=RequestMethod.GET) 
	public String boot() {
		return "Spring Boot is great! So easy to just respond with strings";
	}

}
