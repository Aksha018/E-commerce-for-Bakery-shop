package com.chainsys.bakeryshop.DTO;

import com.chainsys.bakeryshop.model.Category;

public class ProductDTO {
	
	private long productid;
	private String productname;
	private Category categoryid;
	private int stockinhand;
	private double price;
	private String description;
	private String image;
	
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Category getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Category categoryid) {
		this.categoryid = categoryid;
	}
	public int getStockinhand() {
		return stockinhand;
	}
	public void setStockinhand(int stockinhand) {
		this.stockinhand = stockinhand;
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