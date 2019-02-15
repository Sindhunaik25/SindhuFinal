package com.sindhu.corejava;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.calculateSalary();
		Manager manager = new Manager();
		manager.calculateSalary();
		Labour labour = new Labour();
		labour.calculateSalary();

	}

}
