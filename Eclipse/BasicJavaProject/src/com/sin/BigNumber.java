package com.sin;

import java.util.*;

public class BigNumber {
	public static void findBig(int array[]) {
		int i, size, large;

		large = array[0];

		for (i = 0; i < array.length; i++) {
			if (array[i] > large) {
				large = array[i];

			}

		}
		System.out.println(large);
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

		findBig(array);
	}

}
