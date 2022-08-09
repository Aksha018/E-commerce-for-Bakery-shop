package com.chainsys.bakeryshop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "bill")
public class Bill {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name = "BILL_ID")
	private long billId;
	@NotEmpty
    @Size(min = 5, max = 5, message = "Please enter valid date")
	@Column(name = "BILL_DATE")
	private Date billDate;
	@NotEmpty
    @Size(min = 5, max = 6, message = "Please enter integer only")
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
