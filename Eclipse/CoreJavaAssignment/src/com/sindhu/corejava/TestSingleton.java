package com.sindhu.corejava;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
		System.out.println("Bottle");
		System.out.println(singleton.hashCode());
		Singleton singleton2=Singleton.getInstance();
		System.out.println("Milton");
		System.out.println(singleton.hashCode());
	}

}
