package com.chainsys.bakeryshop.DTO;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Product;

public class OrderProductDTO {

	private Product product;
	private List<Orders> order = new ArrayList<>();

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void addOrder(Orders order) {
		this.order.add(order);
	}
}
