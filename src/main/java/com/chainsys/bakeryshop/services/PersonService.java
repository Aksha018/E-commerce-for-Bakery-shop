package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.repository.PersonRepository;

	@Service
	public class PersonService {
		@Autowired 
		PersonRepository PersonRepository;
		
		public List<Person> getPerson() {
			List<Person> productlist = PersonRepository.findAll();
			return Personlist;
		}
		public Person save(Person per) {
			return PersonRepository.save(per);
		}

		public Person findByCategoryId(long id) {
			return PersonRepository.findById(id);
		}
		public void deletePersonById(long id) {
			PersonRepository.deleteById(id);
		}

}
