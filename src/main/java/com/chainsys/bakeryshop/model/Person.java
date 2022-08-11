package com.chainsys.bakeryshop.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PERSON_ID")
	private int personId;
	@Column(name = "PERSON_NAME")
	private String personName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "MOBILE_Number")
	private long mobileNumber;
	@Column(name = "PERSON_TYPE")
	private String personType;
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getPersonId() {
		return personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	
	 @OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
	 
     private List<Orders> order;

	    public List<Orders>getOrder() 
	    {
		return order;
     	}
	    
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
    
}