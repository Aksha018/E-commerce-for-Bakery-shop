package com.chainsys.bakeryshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PAYMENT_ID")
    @SequenceGenerator(name = "PAYMENT_ID", sequenceName = "PAYMENT_ID", allocationSize = 1)	
	@Column(name = "PAYMENT_ID")
	private long paymentId;
	
	@Column(name = "PAYMENT_DATE")
	private String paymentDate;

	@Column(name = "ORDER_ID")
	private long orderId;
	
	@Column(name = "AMOUNT")
	private float amount;
	
	@Column(name = "PAYMENT_MODE")
	private String paymentMode;
	
	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}


	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

}