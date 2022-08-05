package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Bill;

@Repository 
public interface BillRepository extends JpaRepository<Bill,Long> {
		
		Bill findById(long id);

		Bill save(Bill bill); 
		
		void deleteById(long id);

		List<Bill> findAll();
}
