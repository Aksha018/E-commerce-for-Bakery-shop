package com.chainsys.bakeryshop.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
private int BILL_ID;
private Date BILL_DATE;
private int ORDER_ID;
private int PREORDER_ID;

public int getBILL_ID() {
	return BILL_ID;
}
public void setBILL_ID(int bILL_ID) {
	BILL_ID = bILL_ID;
}
public Date getBILL_DATE() {
	return BILL_DATE;
}
public void setBILL_DATE(Date bILL_DATE) {
	BILL_DATE = bILL_DATE;
}
public int getORDER_ID() {
	return ORDER_ID;
}
public void setORDER_ID(int oRDER_ID) {
	ORDER_ID = oRDER_ID;
}
public int getPREORDER_ID() {
	return PREORDER_ID;
}
public void setPREORDER_ID(int pREORDER_ID) {
	PREORDER_ID = pREORDER_ID;
}

}
