package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Payment;

@Repository 
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	Payment findById(int id);

	Payment save(Payment cat); 
	
	void deleteById(int id);

	List<Payment> findAll();

}
