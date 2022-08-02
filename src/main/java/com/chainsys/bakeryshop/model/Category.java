package com.chainsys.bakeryshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CATEGORY_ID")
    private Category categoryId;
	@Column(name="CATEGORY_NAME")
    private String categoryName;
	
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
   
}