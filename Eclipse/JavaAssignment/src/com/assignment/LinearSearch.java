package com.assignment;

public class LinearSearch {
	void linearSearch(int key, int array[]) {
		int i;
		boolean flag = false;

		for (i = 0; i < array.length; i++) {
			if (key == array[i]) {
				flag = true;
				break;
			}

		}
		if (flag == true) {
			System.out.println("Element found at the position " + i);

		} else {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {

		LinearSearch search = new LinearSearch();
		int key = 19;
		int array[] = new int[] { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7,
				52, 86, 47 };
		search.linearSearch(key, array);
	}

}
