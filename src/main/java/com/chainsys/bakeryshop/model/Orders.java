package com.chainsys.bakeryshop.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "ORDER_ID")
	private long orderId;
	@Column(name = "PREORDER_ID")
	private int preorderId;
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@Column(name = "PERSON_ID")
	private int personId;
	@Column(name = "PRODUCT_ID")
	private int productId;
	@Column(name = "Price")
	private int price;
	@Column(name = "AMOUNT")
	private float amount;
	@Column(name = "DELIVERY_TIME")
	private String deliveryTime;
	@Column(name = "DELIVERY_DATE")
	private Date deliveryDate;
	@Column(name = "STATUS")
	private String status;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public int getPreorderId() {
		return preorderId;
	}
	public void setPreorderId(int preorderId) {
		this.preorderId = preorderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}