package com.chainsys.bakeryshop.dto;

import java.util.List;

import com.chainsys.bakeryshop.model.Bill;
import com.chainsys.bakeryshop.model.Orders;

public class BillOrderDto {

	private Orders orders;
	 private List<Bill> bill;
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public List<Bill> getBill() {
		return bill;
	}
	public void addBill(Bill bill) {
		this.bill.add(bill);
	}
	 
	 
}
