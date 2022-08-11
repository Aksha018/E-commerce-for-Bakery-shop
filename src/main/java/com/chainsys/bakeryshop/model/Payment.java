package com.chainsys.bakeryshop.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "payment")
public class Payment {
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "PAYMENT_ID")
	private long paymentId;
	
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;

	@Column(name = "ORDER_ID")
	private int orderId;

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
	
	@ManyToOne
	@JoinColumn(name = "ORDER_ID", insertable = false, nullable = false, updatable = false)
	private Orders ord;

	public Orders getOrders() {
		return ord;
	}

	public void setOrders(Orders ord) {
		this.ord = ord;
	}
}