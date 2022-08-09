package com.chainsys.bakeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.bakeryshop.model.Orders;

@Repository 
public interface OrderRepository extends JpaRepository<Orders,Long> {
		
	Orders findByOrderId(long list);

	Orders save(Orders order); 
		
		void deleteById(long id);

		List<Orders> findAll();

}
