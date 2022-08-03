package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Bill;
import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.repository.BillRepository;

	@Service
	public class BillService {
		@Autowired 
		BillRepository BillRepository;
		
		public List<Bill> getBill() {
			List<Bill> productlist = BillRepository.findAll();
			return Billlist;
		}
		public Bill save(Bill b) {
			return BillRepository.save(b);
		}

		public Bill findByCategoryId(long id) {
			return BillRepository.findById(id);
		}
		public void deleteBillById(long id) {
			BillRepository.deleteById(id);
		}

}
