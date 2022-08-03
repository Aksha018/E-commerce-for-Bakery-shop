package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Orders;

@Repository 
public interface OrderRepository extends JpaRepository<Orders,Integer> {
		
	Orders findById(int id);

	Orders save(Orders person); 
		
		void deleteById(int id);

		List<Orders> findAll();

}
