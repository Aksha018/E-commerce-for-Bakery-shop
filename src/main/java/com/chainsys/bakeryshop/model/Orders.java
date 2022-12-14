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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ORDER_ID")
    @SequenceGenerator(name = "ORDER_ID", sequenceName = "ORDER_ID", allocationSize = 1)	
	@Column(name = "ORDER_ID")
	private long orderId;
	
	@Column(name = "ORDER_DATE")
	private String orderDate;
	
	@Column(name = "PERSON_ID")
	private int personId;
	
	@Column(name = "PRODUCT_ID")
	private int productId;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "PRICE")
	private int price;
	
	@Column(name = "AMOUNT")
	private float amount;

	@Column(name = "DELIVERY_TIME")
	private String deliveryTime;
	
	@Column(name = "DELIVERY_DATE")
	private Date deliveryDate;
	
	@Column(name = "DELIVERY_ADDRESS")
	private String deliveryAddress;
	
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
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

	@ManyToOne
	@JoinColumn(name = "PERSON_ID", insertable = false, nullable = false, updatable = false)
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
		
	@OneToMany(mappedBy = "orders",fetch = FetchType.LAZY)	 
    private List<Bill> bill;

	    public List<Bill>  getBill() 
	    {
		return bill;
    	}
	    
	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}
	
}