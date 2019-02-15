package com.sin;

public class DacAsc {
	void sort(int array[]) 
	{
		int n = array.length;
		for (int i = 0; i < n - 1; i++) 
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				if (array[j] <array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}

	}

	void print(int array[]) {
		int n = array.length;
		for (int i = 0; i< 5; i++) {
			System.out.println(array[i]);
		}
	}


	public static void main(String[] args) {
		DacAsc ascdsc = new DacAsc();
		int array[] = { 700, 300, 400, 200, 100 };
		ascdsc.sort(array);
		System.out.println("After sorting");
		ascdsc.print(array);
	}

}
