package com.chainsys.bakeryshop.DTO;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Person;

public class PersonOrderDTO {
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
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	
	
}
