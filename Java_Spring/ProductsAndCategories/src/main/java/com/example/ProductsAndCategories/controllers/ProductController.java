package com.example.ProductsAndCategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ProductsAndCategories.models.Category;
import com.example.ProductsAndCategories.models.Product;
import com.example.ProductsAndCategories.services.ApiServices;

@Controller
public class ProductController {
	private final ApiServices api;
	
	
	
	public ProductController(ApiServices api) {
		
		this.api = api;
	}

	@RequestMapping("/")
	public String index(@ModelAttribute("products") Product p) {
		
		return "index.jsp";
	}
	
	@RequestMapping("/createP")
	public String createP(@ModelAttribute("products") Product p,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "index.jsp";
		}
		else {
			api.createproduct(p);
			return "redirect:/";
		}
		
		
	}
	
	@RequestMapping("/cat")
	public String index(@ModelAttribute("category") Category category) {
		
		
		return "newcat.jsp";
	}
	
	@RequestMapping("/createC")
	public String createCat(@ModelAttribute("category") Category category,BindingResult result) {
		
		if(result.hasErrors()) {
			return "newcat.jsp";
		}
		else {
			api.createcategory(category);
			return "redirect:/cat";
		}

	}

	@RequestMapping("/products/{id}")
	public String newContact (@PathVariable("id") long id,@ModelAttribute("category") Category category, Model model) {
		Product x = api.getPro(id).orElse(null);
		model.addAttribute("products", x);
		model.addAttribute("cat", api.allNullCategory());

		return "pro.jsp";
	}
	
	
	
	}
	

