package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.DTO.PersonOrderDTO;
import com.chainsys.bakeryshop.DTO.PersonProductDTO;
import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.repository.OrderRepository;
import com.chainsys.bakeryshop.repository.PersonRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	PersonRepository personRepository;
	
	
	public List<Orders> getOrder() {
		List<Orders> Orderlist = orderRepository.findAll();
		return Orderlist;
	}
	public Orders save(Orders theorder) {
		return orderRepository.save(theorder);
	}

	public  Orders findByOrderId(long id) {
		return orderRepository.findByOrderId(id);
	}
	public void deleteOrderById(long id) {
		orderRepository.deleteById(id);
	}
}










	
//	public PersonOrderDTO getPersonOrderDTO(int id) {
//		PersonOrderDTO dto = new PersonOrderDTO();
//		
//		dto.setPerson(personRepository.findById(id));
//		dto.setOrder(orderRepository.findAll());
//		
//		return dto;
		
	

