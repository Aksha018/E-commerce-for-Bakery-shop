package com.chainsys.bakeryshop.DTO;

import com.chainsys.bakeryshop.model.Category;

public class CategoryDTO {

	private Category categoryId;
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