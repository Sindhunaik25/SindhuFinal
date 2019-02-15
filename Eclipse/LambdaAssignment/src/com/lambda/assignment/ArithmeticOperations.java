package com.lambda.assignment;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Arithmatic add = (a, b) -> a + b;
		System.out.println(add.show(3, 5));
		Arithmatic sub = (a, b) -> a - b;
		System.out.println(sub.show(5, 4));
		Arithmatic mul = (a, b) -> a * b;
		System.out.println(mul.show(5, 4));
		Arithmatic div = (a, b) -> a / b;
		System.out.println(div.show(8, 4));
	}

}
