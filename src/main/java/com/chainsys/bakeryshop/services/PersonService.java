package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.DTO.PersonProductDTO;
import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.repository.PersonRepository;
import com.chainsys.bakeryshop.repository.ProductRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	@Autowired
	ProductRepository productRepository;

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
	
	
	
	
	
	
	
//	public PersonProductDTO getPersonProductDTO(int id) {
//		PersonProductDTO dto = new PersonProductDTO();
//		Person product = new Person();
//		dto.setPerson(personRepository.findById(id));
//		dto.setPro(productRepository.findAll());
//
//		return dto;
//
//	}
}
