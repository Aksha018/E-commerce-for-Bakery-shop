package com.chainsys.bakeryshop.DTO;

public class ProductDTO {
	
	private long product_id;
	private String product_name;
    private int category_id;
	private int stock_in_hand;
	private double price;
	private String description;
    private String image;

      public long getproduct_id() {
    	 return product_id;
     }
	public void setproduct_id(long product_id) {
      this.product_id = product_id;
    }

	public String getproduct_name() {
       return product_name;
       }

	public void setproduct_name(String product_name) {
      this.product_name = product_name;
      }

	public int getCategory_id() {
     return category_id;
    }
	
	public void setCategory_id(int category_id) {
      this.category_id = category_id;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}

