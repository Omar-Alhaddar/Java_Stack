package com.example.ProductsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ProductsAndCategories.models.Category;
import com.example.ProductsAndCategories.models.CategoryProduct;
import com.example.ProductsAndCategories.models.Product;
import com.example.ProductsAndCategories.repositories.CategoryProductRepository;
import com.example.ProductsAndCategories.repositories.CategoryRepository;
import com.example.ProductsAndCategories.repositories.ProductRepository;

@Service
public class ApiServices {
	private final ProductRepository productRepo;
	private final CategoryRepository categoryRepo;
	private final CategoryProductRepository catProRepo;
	public ApiServices(ProductRepository productRepo, CategoryRepository categoryRepo, CategoryProductRepository catProRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
		this.catProRepo = catProRepo;
	}
	


public Product findProduct(Long id) {
	return productRepo.findById(id).orElse(null);
}

public Category findCategory(Long id) {
	return categoryRepo.findById(id).orElse(null);
}

public List<Product> unAddedProducts(Category c){
	
	return productRepo.findByCategoriesNotContains(c);
}

public List<Category> unAddedCategories(Product p){
	
	return categoryRepo.findByProductsNotContains(p);
}


public Product addProduct (Product p) {
	
	return productRepo.save(p);
}

public Category addCategory (Category c) {
	
	return categoryRepo.save(c);
}

public CategoryProduct add (CategoryProduct cP) {
	
	return catProRepo.save(cP);
}



}