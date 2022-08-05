package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Payment;

@Repository 
public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
	Payment findById(long id);

	Payment save(Payment payment); 
	
	void deleteById(long id);

	List<Payment> findAll();

}
