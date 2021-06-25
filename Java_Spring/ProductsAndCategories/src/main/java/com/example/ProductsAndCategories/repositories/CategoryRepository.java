package com.example.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductsAndCategories.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository <Category,Long>{
	
	List<Category> findAll();
	List<Category> findByProductsIdIsNull();

}
