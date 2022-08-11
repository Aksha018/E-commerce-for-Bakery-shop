package com.chainsys.bakeryshop.services;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.DTO.BillOrderDTO;
import com.chainsys.bakeryshop.model.Bill;
import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.repository.BillRepository;
import com.chainsys.bakeryshop.repository.OrderRepository;

@Service
public class BillService {
	@Autowired
	BillRepository billRepository;
	@Autowired
	OrderRepository orderRepository;

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

	public BillOrderDTO getBillorder(int id) {
		Orders order = orderRepository.findByOrderId(id);
		BillOrderDTO dto = new BillOrderDTO();
		dto.setOrders(order);
		List<Bill> bill = billRepository.findAll();
		Iterator<Bill> itr = bill.iterator();
		while (itr.hasNext()) {
			dto.addBill(itr.next());
		}
		return dto;
	}
}
