package com.chainsys.bakeryshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
//	@Autowired
//     CategoryRepository categoryRepository;
//    public List<Category> getAllCategory() {
//
//         return categoryRepository.findAll();
//    }
//
//     public void addCategory(Category category) {
//     
//       categoryRepository.save(category);
//    }
//   
//    public void deleteCategoryById(int id) {
//       categoryRepository.deleteById(id);
//    }
//
//	public void  updateCategoryById(Category categoryId) {
//	 categoryRepository.findAllByCategory_Id(categoryId);
//	}
	public List<Category> getCategory() {
		List<Category> categorylist = categoryRepository.findAll();
		return categorylist;
	}

	@Transactional
	public Category save(Category cat) {
		//System.out.println("values to insert");
		return categoryRepository.save(cat);
	}

	public Category findById(int id) {
		return categoryRepository.findById(id);
	}

	@Transactional
	public void deleteCategoryById(int id) {
		categoryRepository.deleteById(id);
	}

	}
