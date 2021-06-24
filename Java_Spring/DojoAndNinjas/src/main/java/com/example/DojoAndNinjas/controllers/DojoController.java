package com.example.DojoAndNinjas.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DojoAndNinjas.models.Dojo;
import com.example.DojoAndNinjas.models.Ninja;
import com.example.DojoAndNinjas.services.ApiServices;

@Controller
public class DojoController {

	private final ApiServices ser;

	public DojoController(ApiServices ser) {
		this.ser = ser;
	}
	
	@RequestMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
		
		
		return "index.jsp";
	}
	
	@RequestMapping("/dojos/new")
	public String createdojo(@ModelAttribute("dojo") Dojo dojo,BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		else {
			ser.createDojo(dojo);
			return "redirect:/";
		}

	}
	
	
	@RequestMapping("/ninja")
	public String index2(@ModelAttribute("ninja") Ninja ninja,Model model) {
		model.addAttribute("dojos", ser.alldojos());
		
		
		return "index2.jsp";
	}
	
	@RequestMapping("/ninjas/new")
	public String createninja(@ModelAttribute("ninja") Ninja ninja,BindingResult result) {
		if(result.hasErrors()) {
			return "index2.jsp";
		}
		else {
			ser.createNinja(ninja);
			return "redirect:/";
		}
		
		
		
	}
	
	@RequestMapping("/dojo/{id}")
	public String index3( @PathVariable("id") Long id,@ModelAttribute("ninja") Ninja ninja,Model model) {
		Dojo x= ser.findbyid(id).orElse(null);
		model.addAttribute("dojos", x);
		
		
		return "show.jsp";
	}
	
	
}
