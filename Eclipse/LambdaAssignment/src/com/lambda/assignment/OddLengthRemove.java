package com.lambda.assignment;

import java.util.ArrayList;

public class OddLengthRemove {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Sindhu");
		list.add("Sachin");
		list.add("Pavan");
		list.add("Pavitra");
		list.removeIf(words->(words.length()%2)!=0);
		System.out.println(list);
	}

}
