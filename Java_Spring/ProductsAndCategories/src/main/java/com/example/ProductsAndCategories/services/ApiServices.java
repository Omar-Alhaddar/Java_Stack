package com.example.ProductsAndCategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ProductsAndCategories.models.Category;
import com.example.ProductsAndCategories.models.Product;
import com.example.ProductsAndCategories.repositories.CategoryRepository;
import com.example.ProductsAndCategories.repositories.ProductRepository;

@Service
public class ApiServices {
	private final ProductRepository productRepo;
	private final CategoryRepository categoryRepo;
	public ApiServices(ProductRepository productRepo, CategoryRepository categoryRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
	}
	
	public Product createproduct(Product p) {
		
		return productRepo.save(p);
	}
	
	public Category createcategory(Category c) {
		
		return categoryRepo.save(c);
	}
	
	public List<Category> allNullCategory() {
		return categoryRepo.findByProductsIdIsNull();
		}
	
	public List<Category> allCat() {
		return categoryRepo.findAll();
		}
	
	public Optional<Product> getPro(long id) {
		return productRepo.findById(id);
	}
	
	public List<Category> allNullCat() {
		return categoryRepo.findByProductsIdIsNull();
		}

	
	public List<Product> allNullPro() {
		return productRepo.findBycategoriesIdIsNull();
		}
}
