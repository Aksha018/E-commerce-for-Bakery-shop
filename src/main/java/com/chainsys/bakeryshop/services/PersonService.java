package com.chainsys.bakeryshop.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.DTO.PersonOrderDTO;
import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.repository.OrderRepository;
import com.chainsys.bakeryshop.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	@Autowired
	OrderRepository orderRepository;

	public List<Person> getPerson() {
		List<Person> productlist = personRepository.findAll();
		return productlist;
	}

	public Person save(Person per) {
		return personRepository.save(per);
	}

	public Person findByPersonId(int id) {
		return personRepository.findById(id);
	}

	public void deletePersonById(int id) {
		personRepository.deleteById(id);
	}
	public Person getEmailAndPassword(String email,String password) {
        return personRepository.findByEmailAndPassword(email, password);
	}
	
	public PersonOrderDTO getPersonOrderDTO(int id) {
		Person person = personRepository.findById(id);
		PersonOrderDTO dto = new PersonOrderDTO();
		dto.setPerson(person);
		List<Orders> order = orderRepository.findByPersonId(id);
		Iterator<Orders> itr = order.iterator();
		while (itr.hasNext()) {
			dto.addOrder((Orders) itr.next());
		}
		return dto;
	}

}
