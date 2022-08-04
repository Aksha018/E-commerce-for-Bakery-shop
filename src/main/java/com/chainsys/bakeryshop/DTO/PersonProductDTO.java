package com.chainsys.bakeryshop.DTO;

import java.util.List;

import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.model.Product;

public class PersonProductDTO {

	private List<Product> pro;
	private Person person;
	public List<Product> getPro() {
		return pro;
	}
	public void setPro(List<Product> pro) {
		this.pro = pro;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}