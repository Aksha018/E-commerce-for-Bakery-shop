package com.chainsys.bakeryshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
     CategoryRepository categoryRepository;
    public List<Category> getAllCategory() {

         return categoryRepository.findAll();
    }

     public void addCategory(Category category) {
     
       categoryRepository.save(category);
    }
   
    public void removeCategoryById(int id) {
       categoryRepository.deleteById(id);
    }

//    public Optional<Category> updateCategoryById(Category category) {
//         return categoryRepository.findAllById(category);
//    }

	public Optional<Category> updateCategoryById(int id) {
	
		return categoryRepository.findAllById(category));
	}

	
}