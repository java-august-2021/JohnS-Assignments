package com.jy.products_and_categories.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.products_and_categories.models.Category;
import com.jy.products_and_categories.models.Product;
import com.jy.products_and_categories.repositories.CategoryRepository;
import com.jy.products_and_categories.repositories.ProductRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository cRepo;
	@Autowired
	private ProductRepository pRepo;
	
	//return all categories
	public List<Category> allCategories(){
		return cRepo.findAll();
	}
	
	//create new category
	public Category createCategory(Category c) {
		return cRepo.save(c);
	}
	
	//return a category
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = cRepo.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		}else {
			return null;
		}
	
	}

	public List<Category> findNotInCategories(Product product) {
		return cRepo.findByProductsNotContains(product);
	}

	// return list of products
	public List<Product> getProducts(Category c){
		return pRepo.findAllByCategories(c);
	}

	
	// add a product
	public void addProduct(Product p, Category c) {
		c.getProducts().add(p);
		cRepo.save(c);
	}
	
}
