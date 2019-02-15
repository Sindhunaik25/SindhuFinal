package com.sindhu.corejava;

public class AbstractTest1 extends TesingAbstract {
	public void draw() {
		System.out.println("Drawing a circle");
	}

	public static void main(String[] args) {

		AbstractTest1 abstractTest1 = new AbstractTest1();
		abstractTest1.draw();
		abstractTest1.display();
	}

}
