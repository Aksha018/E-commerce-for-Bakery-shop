package com.chainsys.bakeryshop.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "product")
public class Product {
//    @Id
//   @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_id;
    private String product_name;
//    @ManyToOne(fetch = FetchType.LAZY)
//   @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category_id;
    private int stock_in_hand;
    private double price;
    private String description;
    private String imageName;
    
    public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
   
    public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getStock_in_hand() {
		return stock_in_hand;
	}
	public void setStock_in_hand(int stock_in_hand) {
		this.stock_in_hand = stock_in_hand;
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
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Category getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Category category_id) {
		this.category_id = category_id;
	}
	
    }

