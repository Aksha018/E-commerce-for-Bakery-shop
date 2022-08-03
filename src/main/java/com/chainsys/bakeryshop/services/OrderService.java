package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Bill;
import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired 
	OrderRepository OrderRepository;
	
	public List<Orders> getOrder() {
		List<Orders> Orderlist = OrderRepository.findAll();
		return Orderlist;
	}
	public Orders save(Orders order) {
		return OrderRepository.save(order);
	}

	public Orders findByCategoryId(long id) {
		return OrderRepository.findById(id);
	}
	public void deleteOrderById(long id) {
		OrderRepository.deleteById(id);
	}

}
