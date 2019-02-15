package com.lambda.basics;

public class Func {
	public static void main(String[] args) {
		FuncInterface fi=(a,b) ->a+b;
		System.out.println(fi.add(3,5));
	}

}
