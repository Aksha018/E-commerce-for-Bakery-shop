package com.chainsys.bakeryshop.model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "orders")
public class Orders {
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
private int order_id;
private int preorder_name;
private int person_id;
private int product_id;
private int price;
private float amount;
private Time delivery_time;
private Date delivey_date;
private int status;

public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public int getPreorder_name() {
	return preorder_name;
}
public void setPreorder_name(int preorder_name) {
	this.preorder_name = preorder_name;
}
public int getPerson_id() {
	return person_id;
}
public void setPerson_id(int person_id) {
	this.person_id = person_id;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
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
public Time getDelivery_time() {
	return delivery_time;
}
public void setDelivery_time(Time delivery_time) {
	this.delivery_time = delivery_time;
}
public Date getDelivey_date() {
	return delivey_date;
}
public void setDelivey_date(Date delivey_date) {
	this.delivey_date = delivey_date;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
}
