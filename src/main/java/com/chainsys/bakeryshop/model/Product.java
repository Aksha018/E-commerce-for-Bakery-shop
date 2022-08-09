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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name = "PRODUCT_ID")
	private long productId;
	@NotEmpty
	@Size(min = 5, max = 30, message = "Please enter alphabets only")
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@NotEmpty
	@Size(min = 2, max = 5, message = "Please enter integer only")
	@Column(name = "CATEGORY_ID")
	private int categoryId;
	@NotEmpty
	@Size(min = 5, max = 10, message = "Please enter valid data")
	@Column(name = "STOCK_IN_HAND")
	private int stockInhand;
	@NotEmpty
	@Size(min = 9, max = 10, message = "Please enter valid data")
	@Column(name = "PRICE")
	private double price;
	@NotEmpty
	@Size(min = 50, max = 300, message = "Please enter valid data")
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID", insertable = false, updatable = false, nullable = false)
	private Category category;

    public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product() {
		super();
		this.categoryId = categoryId;
	}
	}
