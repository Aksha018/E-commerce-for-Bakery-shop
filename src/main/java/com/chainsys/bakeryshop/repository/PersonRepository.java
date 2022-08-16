package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
	
	 Person findById(int id);

	Person save(Person person); 
	
	void deleteById(int id);

	List<Person> findAll();

	Person findByEmailAndPassword(String email,String password);

	Person findByEmailAndPasswordAndPersonType(String email, String password, String personType);
}
