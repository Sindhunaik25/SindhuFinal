package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		hashSet.add("B");
		hashSet.add("Z");
		hashSet.add("S");
		hashSet.add("m");
		hashSet.add(null);
		hashSet.add(10);
		System.out.println(hashSet);
		
		LinkedHashSet hashSet2=new LinkedHashSet();
		hashSet2.add("B");
		hashSet2.add("S");
		hashSet2.add("Z");
		hashSet2.add("m");
		hashSet2.add(null);
		hashSet2.add(10);
		System.out.println(hashSet2);
	}

}
