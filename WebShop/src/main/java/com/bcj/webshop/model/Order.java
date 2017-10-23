/**
 * 
 */
package com.bcj.webshop.model;

import java.io.Serializable;


public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	private String orderId;
	private String productName;
	private int quantity;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + ", quantity=" + quantity + "]";
	}

}
