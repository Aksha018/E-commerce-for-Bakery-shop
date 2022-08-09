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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name = "PAYMENT_ID")
	private long paymentId;
	@NotEmpty
    @Size(min = 5, max = 5, message = "Please enter valid date")
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;
	@NotEmpty
    @Size(min = 5, max = 6, message = "integer only")
	@Column(name = "ORDER_ID")
	private int orderId;
	@NotEmpty
    @Size(min = 9, max = 10, message = "integer only")
	@Column(name = "AMOUNT")
	private float amount;
	@NotEmpty
    @Size(min = 5, max = 15, message = "Please enter valid data")
	@Column(name = "PAYMENT_MODE")
	private String paymentMode;
	@NotEmpty
    @Size(min = 10, max = 40, message = "Please enter valid data  ")
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
}