package com.chainsys.bakeryshop.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chainsys.bakeryshop.model.Category;

@Repository 
public interface CategoryRepository extends JpaRepository<Category,Integer> {
	
     Category findByCategoryId(int id);
     
     Category save( Category category);
     
     void deleteById(int id);

 	 List<Category> findAll();

}	
	
	
	