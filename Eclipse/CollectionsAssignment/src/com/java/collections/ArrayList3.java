package com.java.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Sindhu");
		al.add("Pavan");
		al.add("Puneeth");
		al.add("Sachin");
		
		System.out.println(al);
		ListIterator iterator=al.listIterator();
		System.out.println("ArrayList before ");
		while(iterator.hasNext())
		System.out.println(iterator.next());
		System.out.println("ArrayList after ");
		while(iterator.hasPrevious())
			System.out.println(iterator.previous());

	}

}
