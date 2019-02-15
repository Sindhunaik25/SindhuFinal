package com.sindhu.corejava;

public class Singleton {
	private static Singleton bottle;

	private Singleton() {
		this.bottle = bottle;
	}

	public static Singleton getInstance() {
		if (bottle  ==  null) {
			bottle = new Singleton();
		}
		return bottle;
	}
}
