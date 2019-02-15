package com.java.collections;

public class MyListTest {

	public static void main(String[] args) {
		MyList<Integer> list=new MyList<Integer>();
		MyList<String> list1=new MyList<String>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.get());
		list1.add("Sindhu");
		list1.remove("Sindhu");
	}

}
