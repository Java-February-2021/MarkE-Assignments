package com.mark.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mark.driverslicense.models.Driver;
import com.mark.driverslicense.models.License;
import com.mark.driverslicense.services.DriversLicenseService;

@Controller
public class MainController {
	@Autowired
	private DriversLicenseService dService;
	
	
	@GetMapping("/")
	public String index(@ModelAttribute("driver")Driver driver, Model viewModel) {
		List<Driver> allDrivers = this.dService.getAll();
		viewModel.addAttribute("alldrivers", allDrivers);
		return "index.jsp";
	}
	
	@GetMapping("/driver/new")
	public String create(@ModelAttribute("driver")Driver driver) {
		return "driver.jsp";
	}
	
	@PostMapping("/driver/add") 
	public String createSong(@Valid @ModelAttribute("driver")Driver driver, BindingResult result) {
		if (result.hasErrors()) {
            return "driver.jsp";
        } else {
        	this.dService.createDriver(driver);
            return "redirect:/license/new";
        }
	}
	
	@GetMapping("/license/new")
	public String createLicense(@ModelAttribute("license")License license, Model viewModel) {
		List<Driver> driver = this.dService.getAll();
		viewModel.addAttribute("driver", driver);
		return "license.jsp";
	}
	
	@PostMapping("/license/add") 
	public String createLicense(@Valid @ModelAttribute("license")License license, BindingResult result) {
		if (result.hasErrors()) {
            return "license.jsp";
        } else {
        	this.dService.createLicense(license);
            return "redirect:/";
        }
	}
}
