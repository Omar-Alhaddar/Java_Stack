package com.example.ProductsAndCategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ProductsAndCategories.models.Category;
import com.example.ProductsAndCategories.models.CategoryProduct;
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
	public String createP(@Valid@ModelAttribute("products") Product p,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "index.jsp";
		}
		else {
			api.addProduct(p);
			return "redirect:/products/"+p.getId();
		}
		
		
	}
	
	@RequestMapping("/products/{id}")
	public String showProduct (@PathVariable("id") long id,@ModelAttribute("relation") CategoryProduct relation, Model model) {
		model.addAttribute("product", api.findProduct(id));
		model.addAttribute("categories", api.unAddedCategories(api.findProduct(id)));

		return "pro.jsp";
	}
	
	@PostMapping("/product/addCategory")
	public String productAddCategory(@Valid @ModelAttribute("relation") CategoryProduct relation,
			BindingResult result) {
		if (result.hasErrors()) {
			return "pro.jsp";
		}

		api.add(relation);
		return "redirect:/products/" + relation.getProduct().getId();

	}
	
	@RequestMapping("/categories/{id}")
	public String showCategories(Model model, @PathVariable("id") Long id,
			@ModelAttribute("relation") CategoryProduct relation) {
		model.addAttribute("category", api.findCategory(id));
		model.addAttribute("products", api.unAddedProducts(api.findCategory(id)));

		return "cat.jsp";
	}
	
	@PostMapping("/category/addProduct")
	public String categoryAddProduct(@Valid @ModelAttribute("relation") CategoryProduct relation,
			BindingResult result) {
		if (result.hasErrors()) {
			return "showProduct.jsp";
		}

		api.add(relation);
		return "redirect:/categories/" + relation.getCategory().getId();

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
			api.addCategory(category);
			return "redirect:/cat";
		}

	}

	}
	

