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
public class ProductService {
	
	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryRepository cRepo;
	
	//return all products
	public List<Product> allProducts() {
		return pRepo.findAll();
	}
	
	// create new product
	public Product createProduct(Product p) {
		return pRepo.save(p);
	}
	
	// return a product
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = pRepo.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		}else {
			return null;
		}
	}
	
	// return list of categories
	public List<Category> getCategories(Product p){
		return cRepo.findAllByProducts(p);
	}

	
	// add a category
	public void addCategory(Category c, Product p) {
		p.getCategories().add(c);
		pRepo.save(p);
	}
	
	public List<Product> findNotInProducts(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
}
