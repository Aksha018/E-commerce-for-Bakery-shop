package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	public List<Orders> getOrder() {
		List<Orders> Orderlist = orderRepository.findAll();
		return Orderlist;
	}
	public Orders save(Orders theorder) {
		return orderRepository.save(theorder);
	}

	public  Orders findByOrderId(long id) {
		return orderRepository.findById(id);
	}
	public void deleteOrderById(long id) {
		orderRepository.deleteById(id);
	}
}
