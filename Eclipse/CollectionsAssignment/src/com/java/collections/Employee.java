package com.java.collections;

public class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object object) {
		if (object == this || object != this)
			return true;
		Employee employee = (Employee) object;
		return employee.getAge() == this.getAge();
	}

	@Override
	public int hashCode() {

		return age;
	}

}
