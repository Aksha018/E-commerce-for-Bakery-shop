package com.chainsys.bakeryshop.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.dto.PersonOrderDto;
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
		return personRepository.findAll();
		
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
	public Person getEmailAndPasswordAndPersonType(String email, String password, String personType) {
		return personRepository.findByEmailAndPasswordAndPersonType(email,password,personType);
	}

	
	public PersonOrderDto getPersonOrderDTO(int id) {
		Person person = personRepository.findById(id);
		PersonOrderDto dto = new PersonOrderDto();
		dto.setPerson(person);
		List<Orders> order = orderRepository.findByPersonId(id);
		Iterator<Orders> itr = order.iterator();
		while (itr.hasNext()) {
			dto.addOrder(itr.next());
		}
		return dto;
	}

	
}
