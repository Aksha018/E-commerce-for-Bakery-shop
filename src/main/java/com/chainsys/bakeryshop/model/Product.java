package com.chainsys.bakeryshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
	private Category categoryId;
	@Column(name = "STOCK_IN_HAND")
	private int stockInhand;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "IMAGE")
	private String image;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	public int getStockInhand() {
		return stockInhand;
	}
	public void setStockInhand(int stockInhand) {
		this.stockInhand = stockInhand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	private Person person;
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	//Constructor
	public Product(long productId, String productName, Category categoryId, int stockInhand, double price,
			String description, String image, Person person) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.categoryId = categoryId;
		this.stockInhand = stockInhand;
		this.price = price;
		this.description = description;
		this.image = image;
		this.person = person;
	}
	
	public Product() {
		
	}
	
}
	