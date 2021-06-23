package com.example.License.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.License.models.License;
import com.example.License.models.Person;
import com.example.License.services.ApiServices;

@Controller
public class MainController {
	
	private final ApiServices personService;
	private final ApiServices licenseService;
	
	
	
	public MainController(ApiServices personService, ApiServices licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}


	@RequestMapping("/")
	public String index() {
		
		return "redirect:/persons/new";
	}
	
	@RequestMapping("persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		
		return "newPerson.jsp";
	}
	
	@PostMapping("persons/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "newPerson.jsp";
		} 
		else {
			personService.createPerson(person);
			return "redirect:/persons/new";
		}
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> listPerson = personService.allNullPersons();
		model.addAttribute("persons", listPerson);
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "newLicense.jsp";
		}else {
			licenseService.createLicense(license);
			return "redirect:/licenses/new";
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String showProfile(@PathVariable("id") Long id, Model model) {
		Person findPerson = personService.findPerson(id);
		if (findPerson == null) {
			return "redirect:/";
		}else {
			model.addAttribute("person", findPerson);
			return "showPerson.jsp";
		}
	}
	
	
	
	
}