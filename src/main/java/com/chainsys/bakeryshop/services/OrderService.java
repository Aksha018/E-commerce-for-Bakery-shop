package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
@Autowired
ProductService productService;
	
	public List<Orders> getOrder() {
		return orderRepository.findAll();
		 
	}
	public Orders save(Orders theorder) {
    Product product=productService.findByProductId(theorder.getProductId());
	product.setStockInhand(product.getStockInhand()-theorder.getQuantity());
	productService.save(product);
		return orderRepository.save(theorder); 
		
		
	}

	public  Orders findByOrderId(long id) {
		return orderRepository.findByOrderId(id);
	}
	public void deleteOrderById(long id) {
		orderRepository.deleteById(id);
	}
}











	

