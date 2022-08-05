package com.chainsys.bakeryshop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {
	@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BILL_ID")
	private long billId;
	@Column(name = "BILL_DATE")
	private Date billDate;
	@Column(name = "ORDER_ID")
	private int orderId;

	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}
