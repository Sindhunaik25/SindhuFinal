package com.lambda.basics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class PeopleLambda {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Sindhu", "Naik", 22),
				new Person("Sreeja", "Indla", 21),
				new Person("Soundarya", "Hebbar", 22),
				new Person("Aishwarya", "Hegde", 21));
		printAll(people);
//Sorting based on lastname
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1,Person p2) {
				
				return p1.getlName().compareTo(p2.lName);
			}
		});
		
		//create a method to print all elements
		printAll(people);
		//create a method that prints all people with lname beginning with h
		System.out.println("People beginning with h");
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person p) {
				
				return p.getlName().startsWith("H");
			}
		});
	}

	

	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p:people)
		{
			if(condition.test(p))
			{
			System.out.println(p);
			}
		}
		
		
	}

	private static void printAll(List<Person> people) {
		for(Person p:people)
		{
			System.out.println(p);
		}
		
	}

}
interface Condition
{
	boolean test(Person p);
}