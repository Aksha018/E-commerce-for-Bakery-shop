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
    private Category categoryid;
	@Column(name="CATEGORY_NAME")
    private String categoryname;
	
    public Category getcategoryid() {
    	return categoryid;
    }
    public void setcategoryid(Category categoryid) {
    	this.categoryid = categoryid;
    }
    
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

}