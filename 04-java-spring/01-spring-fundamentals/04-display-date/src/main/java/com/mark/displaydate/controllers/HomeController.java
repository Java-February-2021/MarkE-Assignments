package com.mark.displaydate.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat d = new SimpleDateFormat("EEEE, dd, MMMM, YYYY");
		model.addAttribute("newDate", d.format(new java.util.Date()));
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat t = new SimpleDateFormat("h:mm a");
		model.addAttribute("newTime", t.format(new java.util.Date()));
		return "time.jsp";
	}

}
