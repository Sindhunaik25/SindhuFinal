package com.sin;

import java.util.Scanner;

public class Small {
	public static void findSmall(int array[]) {
		int i, size, small;

		small = array[0];

		for (i = 0; i < array.length; i++) {
			if (array[i] < small) {
				small = array[i];

			}

		}
		System.out.println(small);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int ele;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number");
			ele = sc.nextInt();
			array[i] = ele;
		}

		findSmall(array);
	
		
	}

}
