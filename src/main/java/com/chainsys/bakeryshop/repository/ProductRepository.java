package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.model.Product;

@Repository 
public interface ProductRepository extends CrudRepository<Product,Long> {
//	List<Product> findAllByCategory_Id(int id);
//	
	Product findById(long id);
//
//	Product save(Product cat); // used for adding a new product and modifying the product.
//
//	void deleteById(int id);
//
	List<Product> findAll();
//	
   }