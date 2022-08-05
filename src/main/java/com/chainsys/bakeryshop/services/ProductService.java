package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.DTO.CategoryProductDTO;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.repository.CategoryRepository;
import com.chainsys.bakeryshop.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired 
	ProductRepository productRepository;
	@Autowired
	CategoryRepository categoryRepository;
	public List<Product> getProduct() {
		List<Product> productlist = productRepository.findAll();
		return productlist;
	}
	public Product save(Product product) {
		return productRepository.save(product);
	}

	public Product findByCategoryId(long id) {
		return productRepository.findById(id);
	}
	public void deleteProductById(long id) {
		productRepository.deleteById(id);
	}

	
	public CategoryProductDTO getCategoryProductDTO(int id) {
		CategoryProductDTO dto = new CategoryProductDTO();
		dto.setCategory(categoryRepository.findById(id));
		dto.setProduct(productRepository.findAll());
		return dto;
	}
}