package com.chainsys.bakeryshop.DTO;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.bakeryshop.model.Payment;
import com.chainsys.bakeryshop.model.Orders;

public class PaymentOrderDTO {
	private Payment Payment;
	 private List<Orders> Order = new ArrayList<>();
	public Payment getPayment() {
		return Payment;
	}
	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}
	public List<Orders> getOrdert() {
		return Order;
	}
	
	public void setProduct(List<Orders> Order) {
		this.Order = Order;
	}
	 
}
