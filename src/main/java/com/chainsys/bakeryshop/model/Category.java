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
@Table(name = "CATEGORY")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Size(min = 5, max = 6, message = "Please enter integer only")
	@Column(name = "CATEGORY_ID")
	private int categoryId;
	@NotEmpty
	@Size(min = 8, max = 15, message = "Please enter alphabets only")
	@Column(name = "CATEGORY_NAME")
	private String categoryName;

	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)

	private List<Product> products;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
