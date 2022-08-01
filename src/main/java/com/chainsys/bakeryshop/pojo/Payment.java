package com.chainsys.bakeryshop.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
private int payment_id;
private Date payment_date;
private int order_id;
private int preorder_id;
private float amount;
private String payment_mode;
private String payment_description;

public int getPayment_id() {
	return payment_id;
}
public void setPayment_id(int payment_id) {
	this.payment_id = payment_id;
}
public Date getPayment_date() {
	return payment_date;
}
public void setPayment_date(Date payment_date) {
	this.payment_date = payment_date;
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public int getPreorder_id() {
	return preorder_id;
}
public void setPreorder_id(int preorder_id) {
	this.preorder_id = preorder_id;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getPayment_mode() {
	return payment_mode;
}
public void setPayment_mode(String payment_mode) {
	this.payment_mode = payment_mode;
}
public String getPayment_description() {
	return payment_description;
}
public void setPayment_description(String payment_description) {
	this.payment_description = payment_description;
}




}