package com.chainsys.bakeryshop.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.bakeryshop.model.Payment;
import com.chainsys.bakeryshop.model.Orders;

public class PaymentOrderDto {
	private Payment payment;
	 private List<Orders> order = new ArrayList<>();
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public List<Orders> getOrdert() {
		return order;
	}
	
	public void setProduct(List<Orders> order) {
		this.order = order;
	}
	 
}
