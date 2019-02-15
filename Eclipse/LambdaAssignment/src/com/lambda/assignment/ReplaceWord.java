package com.lambda.assignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ReplaceWord {

	public static void main(String[] args) {
		ArrayList<String> first = new ArrayList<String>();

		first.add("Sindhu");
		first.add("Indu");
		first.add("Megha");
		first.add("Pavan");
		first.add("Lakshmi");
		first.add("Eliana");
		System.out.println("The names are:" + first);

		first.stream().forEach(words -> System.out.print(words.charAt(0)));

	}

}
