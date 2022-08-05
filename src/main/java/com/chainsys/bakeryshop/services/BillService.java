package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Bill;
import com.chainsys.bakeryshop.repository.BillRepository;

@Service
public class BillService {
	@Autowired
	BillRepository billRepository;

	public List<Bill> getBill() {
		List<Bill> billlist = billRepository.findAll();
		return billlist;
	}

	public Bill save(Bill bill) {
		return billRepository.save(bill);
	}

	public Bill findByBillId(long id) {
		return billRepository.findById(id);
	}

	public void deleteBillById(long id) {
		billRepository.deleteById(id);
	}

}
