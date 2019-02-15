package com.sindhu.corejava;

import java.util.Scanner;

public class ShapeGenerator {

	public static void main(String[] args) {
		
		int count=0;
		
		while(count<3){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter ur choice");
			int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Line line = new Line();
			line.draw();
			break;
		case 2:
			Rectangle rectangle = new Rectangle();
			rectangle.draw();
			break;
		case 3:
			Cube cube = new Cube();
			cube.draw();
			break;
	    default:System.out.println("Wrong choice");
	        break;

		
		
		}
		count=count+1;
		}
		
	}

}
