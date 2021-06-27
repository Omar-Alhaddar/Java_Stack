package com.example.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductsAndCategories.models.Category;
import com.example.ProductsAndCategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long>{

	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);

}
