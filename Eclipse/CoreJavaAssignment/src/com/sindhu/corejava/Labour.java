package com.sindhu.corejava;

import java.util.Scanner;

public class Labour extends Employee {
	void calculateSalary() {

		double salary = super.lsalary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the extra time,the labour had worked");
		int overTime1 = sc.nextInt();
		switch (overTime1) {
		case 1:
			salary = salary + 500;
			System.out.println("Total salary= " + salary);
			break;
		case 2:
			salary = salary + 1000;
			System.out.println("Total salary= " + salary);
			break;
		case 3:
			salary = salary + 1500;
			System.out.println("Total salary= " + salary);
			break;
		default:
			salary = salary + 2000;
			System.out.println("Total salary= " + salary);
			break;
		}

	}

}
