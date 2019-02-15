package com.lambda.assignment;

import java.util.ArrayList;

public class UpperCaseReplace {

	public static void main(String[] args) {

		ArrayList<String> upperCase = new ArrayList<String>();
		upperCase.add("naik");
		upperCase.add("gowda");
		upperCase.add("indla");
		upperCase.add("kundargi");
		upperCase.add("hebbar");
		upperCase.add("bhat");
		upperCase.stream().forEach(
				words -> System.out.println(words.replaceAll(words,
						words.toUpperCase())));
	}

}







