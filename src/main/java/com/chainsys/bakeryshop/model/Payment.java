package com.chainsys.bakeryshop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAYMENT_ID")
	private long paymentId;
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;
	@Column(name = "ORDER_ID")
	private int orderId;
	@Column(name = "PREORDER_ID")
	private int preorderId;
	@Column(name = "AMOUNT")
	private float amount;
	@Column(name = "PAYMENT_MODE")
	private String paymentMode;
	@Column(name = "PAYMENT_DESCRIPTION")
	private String paymentDescription;

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPreorderId() {
		return preorderId;
	}

	public void setPreorderId(int preorderId) {
		this.preorderId = preorderId;
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

	public String getPaymentDescription() {
		return paymentDescription;
	}

	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

}