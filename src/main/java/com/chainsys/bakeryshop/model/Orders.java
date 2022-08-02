package com.chainsys.bakeryshop.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "ORDER_ID")
	private int orderId;
	@Column(name = "PREORDER_ID")
	private int preorderId;
	@Column(name = "PERSON_ID")
	private int personId;
	@Column(name = "PRODUCT_ID")
	private int productId;
	private int price;
	private float amount;
	@Column(name = "DELIVERY_TIME")
	private Time deliveryTime;
	@Column(name = "DELIVERY_DATE")
	private Date deliveyDate;
	private int status;

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

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Time getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Time deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Date getDeliveyDate() {
		return deliveyDate;
	}

	public void setDeliveyDate(Date deliveyDate) {
		this.deliveyDate = deliveyDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
