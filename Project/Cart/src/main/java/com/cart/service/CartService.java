package com.cart.service;

import com.cart.dao.CartDAO;

public class CartService {
	
	CartDAO object;
	
	
	

	public void setObject(CartDAO object) {
		this.object = object;
	}

	public int removeProductFromCart(int productId) {
		return object.remove(productId);
	}
	
	public int addProductIntoCart(int productId, String productName, int quantity, int price) {
		return object.addProduct(productId, productName, price, price);
		
	}
	
	public int updateProductIntoCart(int productId, String productName) {
		return object.update(productId, productName);
	}
	
	public Object emptyCart() {
		return object.removeAll();
		
	}
	
	//public showCart(int productId)
	
	
}
