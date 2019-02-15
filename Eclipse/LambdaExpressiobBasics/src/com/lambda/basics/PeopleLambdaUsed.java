package com.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PeopleLambdaUsed {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Sindhu", "Naik", 22),
				new Person("Sreeja", "Indla", 21),
				new Person("Soundarya", "Hebbar", 22),
				new Person("Aishwarya", "Hegde", 21));
		
		Collections.sort(people,(p1,p2)->p1.getlName().compareTo(p2.lName));
		System.out.println(people);
		System.out.println("Printing all ");
		printConditionally(people,p->true);
		System.out.println("Names with H");
		printConditionally(people, p->p.getlName().startsWith("H"));
		
}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p:people)
		{
			if(condition.test(p))
			{
			System.out.println(p);
			}
		}
	}
}