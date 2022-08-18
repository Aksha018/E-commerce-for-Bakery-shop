package com.chainsys.bakeryshop.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.dto.OrderProductDto;
import com.chainsys.bakeryshop.dto.PersonOrderDto;
import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.repository.CategoryRepository;
import com.chainsys.bakeryshop.repository.OrderRepository;
import com.chainsys.bakeryshop.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired 
	ProductRepository productRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	OrderRepository orderRepository;
	
	public List<Product> getProduct() {
		List<Product> productlist = productRepository.findAll();
		return productlist;
	}
	public List<Product> getProductsByCategoryId(int categoryId) {
		List<Product> productlist = productRepository.findByCategoryId(categoryId);
		if(productlist== null)
		{
		 System.out.println("debug:productlist is null");
		}
		return productlist;
	}
	public Product save(Product product) {
		return productRepository.save(product);
	}

	public Product findByProductId(long id) {
		Product product = productRepository.findByProductId(id);
		if (product==null) {
        	System.out.println("debug:product is null");
        	return null;
        }
		return product;
		
	}
	public void deleteProductById(long id) {
		productRepository.deleteById(id);
	}
	
	public OrderProductDto getOrderProductDTO(long id) {
		Product product = productRepository.findByProductId(id);
		OrderProductDto dto = new OrderProductDto();
		dto.setProduct(product);
		List<Orders> order = orderRepository.findByProductId(id);
		Iterator<Orders> itr = order.iterator();
		while (itr.hasNext()) {
			dto.addOrder((Orders) itr.next());
		}
		return dto;
}
	}
