package com.sin;

import java.util.*;

public class AscDsc {
	void sort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}

	}

	void print(int array[]) {
		int n = array.length;
		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

		AscDsc ascDsc = new AscDsc();
		int array[] = { 700, 300, 400, 200, 100 };
		ascDsc.sort(array);
		System.out.println("After sorting");
		ascDsc.print(array);
	}
}
