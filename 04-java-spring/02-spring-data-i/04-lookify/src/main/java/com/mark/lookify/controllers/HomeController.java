package com.mark.lookify.controllers;

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

import com.mark.lookify.models.Lookify;
import com.mark.lookify.services.LookifyService;

@Controller
public class HomeController {
	@Autowired
	private LookifyService lService;
	
	@GetMapping("/")
	public String splash() {
		return "splash.jsp";
	}
	
	@GetMapping("/dashboard")
	public String index(@ModelAttribute("lookify")Lookify lookify,Model viewModel) {
		List<Lookify> allLookify = this.lService.getAllSongs();
		viewModel.addAttribute("allLookify", allLookify);
		return "dashboard.jsp";
	}
	
	@GetMapping("songs/{id}")
	public String getOne(Model viewModel, @PathVariable("id")Long id) {
		Lookify lookify = this.lService.getOneSong(id);
		viewModel.addAttribute("lookify", lookify);
		return "one.jsp";
	}
	
	@GetMapping("/songs/search")
	public String Search(@RequestParam("artist") String artist, Model viewModel) {
		viewModel.addAttribute("lookify", lService.songsContainingArtist(artist));
		viewModel.addAttribute("artist", artist);
		return "searched.jsp";
	}
	
	@GetMapping("/songs/topTen")
	public String TopTen(Model model) {
		model.addAttribute("lookify", lService.topTenByRating());
		return "topTen.jsp";
	}
	
	@GetMapping("/songs/add")
	public String create(@ModelAttribute("lookify")Lookify lookify) {
		return "new.jsp";
	}
	
	@PostMapping("/songs/add") 
	public String createSong(@Valid @ModelAttribute("lookify")Lookify lookify, BindingResult result) {
		if (result.hasErrors()) {
            return "new.jsp";
        } else {
        	this.lService.createSong(lookify);
            return "redirect:/dashboard";
        }
	}
	
	@GetMapping("songs/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		lService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/songs/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model viewModel) {
		Lookify lookify = this.lService.getOneSong(id);
		viewModel.addAttribute("lookify", lookify);
		return "edit.jsp";
	}
	
	@PostMapping("/songs/edit/{id}")
	public String editSong(@ModelAttribute("lookify")Lookify lookify, BindingResult result, Model viewModel, @PathVariable("id")Long id) {
			this.lService.updateSong(id, lookify);
			return "redirect:/songs/{id}";
	}
}
