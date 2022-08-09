package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Product;

@Repository 
public interface ProductRepository extends CrudRepository<Product,Long> {
	
	List<Product> findByCategoryId(int categoryId);

	  Product findByProductId(long id);
	  
	  List<Product> findAll();
	  
      Product save(Product product);
      
      void deleteByProductId(Product id);
	
   }