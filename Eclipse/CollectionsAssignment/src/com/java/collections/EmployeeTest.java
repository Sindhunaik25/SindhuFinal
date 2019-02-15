package com.java.collections;

import java.util.Hashtable;

public class EmployeeTest {

	public static void main(String[] args) {
		Hashtable<Employee, String> ht = new Hashtable<Employee, String>();
		Employee employee = new Employee("Sindhu", 22);
		Employee employee2 = new Employee("Sachin", 19);
		Employee employee3 = new Employee("Nitin", 12);
		ht.put(employee, "Savinaya");
		ht.put(employee2, "Lakshmi");
		ht.put(employee3, "Soumya");
		
		System.out.println();
		System.out.println(employee.hashCode());
		System.out.println(employee.equals(employee2));
		
		System.out.println(employee2.hashCode());
		System.out.println(employee2.equals(employee3));
		
		System.out.println(employee3.hashCode());
		System.out.println(employee3.equals(employee));

	}

}
