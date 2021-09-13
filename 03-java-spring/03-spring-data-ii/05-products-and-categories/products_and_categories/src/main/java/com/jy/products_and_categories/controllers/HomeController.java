package com.jy.products_and_categories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jy.products_and_categories.models.Category;
import com.jy.products_and_categories.models.Product;
import com.jy.products_and_categories.services.CategoryService;
import com.jy.products_and_categories.services.ProductService;


@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;	
	@Autowired
	private ProductService productService;
	

	@GetMapping("category/new")
	public String newCategory(@ModelAttribute("category") Category category, Model model){
		List<Category> categories = categoryService.allCategories();
		model.addAttribute("categories", categories);
		return "NewCategory.jsp";
	}
	@PostMapping("category/new")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model model){
		List<Category> categories = categoryService.allCategories();
		model.addAttribute("categories", categories);
		if (result.hasErrors()) {
            return "NewCategory.jsp";
        } else {
        	categoryService.createCategory(category);
            return "redirect:/category/new";
        }

	}
	
	
	@GetMapping("category/{id}")
	public String showCategory(@PathVariable ("id") Long id, Model model){
		Category category = categoryService.findCategory(id);
		List<Product> notProducts = productService.findNotInProducts(category);
		model.addAttribute("notProducts", notProducts);
		model.addAttribute("category", category);
		return "ShowCategory.jsp";
	}
	
	@PostMapping("category/{id}/update")
	public String updateCategory(@PathVariable ("id") Long id, @RequestParam(value="product") Long product) {
		Product productToAdd = productService.findProduct(product);
		Category catToUpdate = categoryService.findCategory(id);
		categoryService.addProduct(productToAdd, catToUpdate);
		return "redirect:/category/{id}";
	}
	
	
	
	
	
	@GetMapping("product/new")
	public String newProduct(@ModelAttribute("product") Product product, Model model){
		List<Product> products = productService.allProducts();
		model.addAttribute("products", products);
		return "NewProduct.jsp";
	}
	@PostMapping("product/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model){
		List<Product> products = productService.allProducts();
		model.addAttribute("products", products);
		if (result.hasErrors()) {
			return "NewProduct.jsp";
		} else {
			productService.createProduct(product);
			return "redirect:/product/new";
		}
		
	}
	
	@GetMapping("product/{id}")
	public String showProduct(@PathVariable ("id") Long id, Model model){
		Product product = productService.findProduct(id);
		List<Category> notCategories = categoryService.findNotInCategories(product);
		model.addAttribute("notCategories", notCategories);
		model.addAttribute("product", product);
		return "ShowProduct.jsp";
	}
	
	@PostMapping("product/{id}/update")
	public String updateProduct(@PathVariable ("id") Long id, @RequestParam(value="category") Long category) {
		Category catToAdd = categoryService.findCategory(category);
		Product productToUpdate = productService.findProduct(id);
		productService.addCategory(catToAdd, productToUpdate);
		return "redirect:/product/{id}";
	}
}
