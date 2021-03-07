package com.mark.thecode.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class MainController {
	private Boolean webCode(String code) {
		return code.equals("bushido");
	}
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/attempt", method=RequestMethod.POST)
	public String attempt(@RequestParam(value="code") String code, Model model, RedirectAttributes rAttributes) {
		if(webCode(code)) {
			return "redirect:/code";
		}
		rAttributes.addFlashAttribute("error", "You do not know the way");
		return "redirect:/";
	}
	@RequestMapping("/code")
	public String code() {
		return "correct.jsp";
	}

}
