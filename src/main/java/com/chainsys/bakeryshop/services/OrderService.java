package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.repository.OrderRepository;
import com.chainsys.bakeryshop.repository.PersonRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	PersonRepository personRepository;
	private ProductService productService;
	
	public List<Orders> getOrder() {
		List<Orders> Orderlist = orderRepository.findAll();
		return Orderlist;
	}
	public Orders save(Orders theorder) {
		productService.findByProductId(theorder.getProductId());
		
		return orderRepository.save(theorder);
	}

	public  Orders findByOrderId(long id) {
		return orderRepository.findByOrderId(id);
	}
	public void deleteOrderById(long id) {
		orderRepository.deleteById(id);
	}
}











	

