package com.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest implements Comparator<Person>{

	public static void main(String[] args) {
		TreeSet<Person> t=new TreeSet<Person>(new TreeSetTest ());
		t.add(new Person(5.2,45.3,"Sindhu"));
		t.add(new Person(5.5,67.3,"Sachin"));
		t.add(new Person(5.3,67.3,"Pavitra"));
		t.add(new Person(5.1,57.3,"Pavan"));
		
		for(Person p:t)
		{
			System.out.println(p);
		}

	}

	@Override
	public int compare(Person p1,Person p2) {

		if (p1.weight> p2.weight) {
			return 1;
		} else if (p1.weight == p2.weight) {

			if(p1.height>p2.height)
			{
				return 1;
			}
		}
		return -1;

	}


}
