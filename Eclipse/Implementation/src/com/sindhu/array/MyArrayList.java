package com.sindhu.array;

import java.util.Scanner;

public class MyArrayList implements MyList {
	public static int arr[];
	int element;

	MyArrayList(int array[]) {
		this.arr = array;
	}

	@Override
	public void add() {

	}

	@Override
	public void get(int ele) {
		for(int index=0;index<arr.length;index++){
			if(ele==arr[index]){
				System.out.println("Element is found at "+index);
			}
		}

	}

	@Override
	public void getAll() {
		 System.out.println("length=>"+arr.length);
		 for(int index=0;index<arr.length;index++){
			 System.out.println(arr[index]);
		 }
	}

	@Override
	public void update() {

	}

	@Override
	public void remove(int delete) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == delete) {
				for (int j = i; j < (arr.length - 1); j++) {
					arr[j] = arr[j + 1];
				}
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("Element Not Found..!!");
		} else {
			System.out.print("Element Deleted Successfully..!!");
			System.out.print("\nNow the New Array is :\n");
			for (int i = 0; i < (arr.length - 1); i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	public static void main(String args[]) {
		MyArrayList myarraylist = new MyArrayList(new int[] { 10, 20, 30, 40,
				50 });
		System.out.println(arr.length);
		 myarraylist.getAll();
		// myarraylist.get(30);
		myarraylist.remove(40);
		// myarraylist.add(2,3);
	}
}
