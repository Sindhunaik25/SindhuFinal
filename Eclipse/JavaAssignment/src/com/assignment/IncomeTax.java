package com.assignment;

import java.util.Scanner;

public class IncomeTax {
	public void calculateTax()
	{
		Scanner sc = new Scanner(System.in);
		double sal;
		System.out.println("Enter the salary");
		sal=sc.nextDouble();
		
		if(sal>0 && sal<180000)
		{
			double tax=0;
			System.out.println(tax);
		}
		else if((sal>181001) && (sal<300000))
		{
			double tax1=sal*0.10;
			System.out.println(tax1);
		}
		else if((sal>300001) && (sal<500000))
		{
			double tax2=sal*0.20;
			System.out.println(tax2);
		}
		else if((sal>500001) && (sal<=1000000))
		{
			double tax3=sal*0.30;
			System.out.println(tax3);
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {
	IncomeTax incomeTax=new IncomeTax();
	incomeTax.calculateTax();
	}

}
