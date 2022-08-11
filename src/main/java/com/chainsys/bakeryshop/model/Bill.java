package com.chainsys.bakeryshop.model;

import java.sql.Date;
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
@Table(name = "bill")
public class Bill {
	@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BILL_ID")
	private long billId;
	@Column(name = "BILL_DATE")
	private Date billDate;
	@Column(name = "ORDER_ID")
	private int orderId;
	@Column(name = "BILL_AMOUNT")
	private int billAmount;

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
	
	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
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
