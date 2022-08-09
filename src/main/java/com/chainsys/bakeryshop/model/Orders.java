package com.chainsys.bakeryshop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name = "ORDER_ID")
	private long orderId;
	@NotEmpty
	@Size(min = 5, max = 5, message = "Please enter valid date")
	@Column(name = "ORDER_DATE")
	private Date orderDate;
	@NotEmpty
	@Size(min = 5, max = 6, message = "Please enter integer only")
	@Column(name = "PERSON_ID")
	private int personId;
	@NotEmpty
	@Size(min = 5, max = 6, message = "Please enter integer only")
	@Column(name = "PRODUCT_ID")
	private int productId;
	@NotEmpty
	@Size(min = 5, max = 10, message = "Please enter integer only")
	@Column(name = "QUANTITY")
	private int quantity;
	@NotEmpty
	@Size(min = 9, max = 10, message = "Please enter integer only")
	@Column(name = "PRICE")
	private int price;
	@NotEmpty
	@Size(min = 9, max = 10, message = "Please enter integer only")
	@Column(name = "AMOUNT")
	private float amount;
	@NotEmpty
	@Size(min = 5, max = 5, message = "Please enter valid time")
	@Column(name = "DELIVERY_TIME")
	private String deliveryTime;
	@NotEmpty
	@Size(min = 5, max = 5, message = "Please enter valid date")
	@Column(name = "DELIVERY_DATE")
	private Date deliveryDate;
	@NotEmpty
	@Size(min = 10, max = 100, message = "Enter Alphabets only")
	@Column(name = "DELIVERY_ADDRESS")
	private String deliveryAddress;
	@NotEmpty
	@Size(min = 5, max = 5, message = "Enter characters only")
	@Column(name = "STATUS")
	private String status;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ManyToOne
	@JoinColumn(name = "PERSON_ID", insertable = false, nullable = false, updatable = false)
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}