package com.java.collections;


import java.util.TreeSet;

public class Person  {
	double height;
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double weight;
	String name;

	public Person(double height, double weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", name="
				+ name + "]";
	}

	
}
