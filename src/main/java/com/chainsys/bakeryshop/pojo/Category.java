package com.chainsys.bakeryshop.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int category_id;
    private String category_name;
    
    public int getcategory_id() {
    	return category_id;
    }
    public void setcategory_id(int category_id) {
    	this.category_id = category_id;
    }
    
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

}