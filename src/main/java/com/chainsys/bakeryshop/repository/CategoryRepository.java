package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Category;

@Repository 
public interface CategoryRepository extends JpaRepository<Category,Integer> {
	List<Category> findAllByCategory_Id(int id);
	
   }