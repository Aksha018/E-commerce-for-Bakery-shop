package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.pojo.Category;
import com.chainsys.bakeryshop.pojo.Product;

@Repository 
public class CategoryRepository extends JpaRepository<Category,Integer>{
   List<Product> findAllByCategory_Id(int id);
   }