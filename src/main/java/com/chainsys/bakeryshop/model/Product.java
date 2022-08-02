package com.chainsys.bakeryshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
//    @Id
//   @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
//    @ManyToOne(fetch = FetchType.LAZY)
//   @JoinColumn(name = "category_id", referencedColumnName = "category_id")
	@Column(name = "CATEGORY_ID")
	private Category categoryId;
	@Column(name = "STOCK_IN_HAND")
	private int stockInhand;
	private double price;
	private String description;
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
	
	
}
