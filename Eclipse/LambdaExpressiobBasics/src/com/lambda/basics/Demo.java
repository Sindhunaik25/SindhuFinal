package com.lambda.basics;
interface Test
{
	public void add(int a,int b);
}
public class Demo {
public static void main(String[] args) {
	Test addition=(int a,int b)-> System.out.println(a+b);
	addition.add(10, 3);
}
}
