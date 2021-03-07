package com.mark.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HomeController {
	private int sessionCount(HttpSession s) {
		Object initCount = s.getAttribute("count");
		if(initCount == null) {
			setCount(s, 0);
			initCount = s.getAttribute("count");
		}
		return (Integer)initCount;
	}
	private void setCount(HttpSession s, int val) {
		s.setAttribute("count", val);
	}
	@RequestMapping("/")
	public String index(HttpSession c) {
		int currentCount = sessionCount(c);
		setCount(c, ++currentCount);
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession c, Model model) {
		model.addAttribute("count", sessionCount(c));
		return "counter.jsp";
	}
}
