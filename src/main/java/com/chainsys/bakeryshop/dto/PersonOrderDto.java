package com.chainsys.bakeryshop.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Person;

public class PersonOrderDto {
	private Person person;
	private List<Orders> order = new ArrayList<>();
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void addOrder(Orders order) {
		this.order.add(order);
	}	
}
