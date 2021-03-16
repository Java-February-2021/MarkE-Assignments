package com.mark.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mark.languages.models.Language;
import com.mark.languages.services.LanguageService;

@Controller
public class MainController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/languages")
	public String index(@ModelAttribute("language")Language language,Model viewModel) {
		List<Language> allLanguages = this.lService.getAllLanguage();
		viewModel.addAttribute("allLanguages", allLanguages);
		return "index.jsp";
	}
	
	@GetMapping("languages/{id}")
	public String getOne(Model viewModel, @PathVariable("id")Long id) {
		Language language = this.lService.getOneLanguage(id);
		viewModel.addAttribute("language", language);
		return "showLang.jsp";
	}
	
	@PostMapping("/languages/add") 
	public String createLanguage(@Valid @ModelAttribute("language")Language language, BindingResult result) {
		if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	this.lService.createLanguage(language);
            return "redirect:/languages";
        }
	}
	
	@GetMapping("languages/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		lService.deleteLanguage(id);
		return "redirect:/languages";
	}
	
	@GetMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model viewModel) {
		Language language = this.lService.getOneLanguage(id);
		viewModel.addAttribute("language", language);
		return "editLang.jsp";
	}
	
	@PostMapping("/languages/edit/{id}")
	public String editLanguage(@ModelAttribute("language")Language language, BindingResult result, Model viewModel, @PathVariable("id")Long id) {
			this.lService.updateLanguage(id, language);
			return "redirect:/languagess/{id}";
	}
}
