package com.chainsys.bakeryshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chainsys.bakeryshop.model.Category;

@Repository 
public interface CategoryRepository extends JpaRepository<Category,Integer> {
//	List<Category> findAllByCategory_Id(int id);
//   Optional<Category> findById(int id);

	Category findById(int id);

	Category save(Category category); // used for adding a new category and modifying the category.

	void deleteById(int id);

	List<Category> findAll();
	
}