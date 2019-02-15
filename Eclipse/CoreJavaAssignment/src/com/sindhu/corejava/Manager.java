package com.sindhu.corejava;

import java.util.Scanner;

public class Manager extends Employee {
	void calculateSalary() {
		double salary = super.msalary;
		double incentives = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Perfomance");
		String perfomance = sc.next();
		if (perfomance.equals("good")) {
			incentives = salary * (0.1);
		} else if (perfomance.equals("better")) {
			incentives = salary * (0.15);
		} else if (perfomance.equals("best")) {
			incentives = salary * (0.25);
		} else {
			System.out.println("You have to put an effort to get incentives");
		}

		double totalSalary = salary + incentives;
		System.out.println("Total salary= " + totalSalary);
	}
}
