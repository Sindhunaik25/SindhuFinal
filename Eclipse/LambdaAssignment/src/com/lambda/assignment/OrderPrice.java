package com.lambda.assignment;

public class OrderPrice {

	public static void main(String[] args) {
		PriceCheck check = (a) -> {
			if (a > 10000) {
				System.out.println("Order is accepted");
			} else {
				System.out.println("Order is rejected");
			}
		};
		check.checkPrice(2000);
	}

}
