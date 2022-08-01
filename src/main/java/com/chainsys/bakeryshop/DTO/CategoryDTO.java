package com.chainsys.bakeryshop.DTO;

import com.chainsys.bakeryshop.model.Category;

public class CategoryDTO {

  private Category categoryid;
  private String categoryname;
  
  public Category getCategoryid() {
	return categoryid;
}
public void setCategoryid(Category categoryid) {
	this.categoryid = categoryid;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}  
}