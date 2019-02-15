package com.stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClassTest1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Sav");
		list1.add("gav");
		list1.add("gav");
		list1.add("mav");
		
		long count1=list1.stream().distinct().count();
		System.out.println(count1);
		
//		Stream<String> stream=list1.stream();
//		Stream<String> d=stream.distinct();
//		long count=d.count();
//		System.out.println(count);
		
		
		
		
	}

}
