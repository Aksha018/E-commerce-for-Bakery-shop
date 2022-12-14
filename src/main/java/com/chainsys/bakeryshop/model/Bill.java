package com.chainsys.bakeryshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "BILL_ID")
    @SequenceGenerator(name = "BILL_ID", sequenceName = "BILL_ID", allocationSize = 1)	
	@Column(name = "BILL_ID")
	private long billId;

	@Column(name = "BILL_DATE")
	private String billDate;

	@Column(name = "ORDER_ID")
	private int orderId;

	@Column(name = "BILL_AMOUNT")
	private float billAmount;

	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

    @ManyToOne
	@JoinColumn(name = "ORDER_ID", insertable = false, nullable = false, updatable = false)
	private Orders orders;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

}
