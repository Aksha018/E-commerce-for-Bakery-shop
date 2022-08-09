package com.chainsys.bakeryshop.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.repository.CategoryRepository;
import com.chainsys.bakeryshop.repository.ProductRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ProductRepository productRepository;
	
	public List<Category> getCategory() {
		List<Category> categorylist = categoryRepository.findAll();
		return categorylist;
	}	

	public Category save( Category category) {
		return categoryRepository.save(category);
	}

	public Category findById(int id) {
		return categoryRepository.findByCategoryId(id);
	}
	public Category findByCategoryId(int i) {
		return categoryRepository.findByCategoryId(i);
	}

	public void deleteById(int id) {
		categoryRepository.deleteById(id);
	
		
	}
}

