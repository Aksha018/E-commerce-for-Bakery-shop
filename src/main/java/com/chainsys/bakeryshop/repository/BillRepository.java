package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Bill;

@Repository 
public interface BillRepository extends JpaRepository<Bill,Integer> {
		
		Bill findById(int id);

		Bill save(Bill person); 
		
		void deleteById(int id);

		List<Bill> findAll();
}
