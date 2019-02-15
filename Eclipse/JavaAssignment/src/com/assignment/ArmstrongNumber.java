package com.assignment;
import java.util.*;

public class ArmstrongNumber {
	public static void armstrong(int num)
	{
		int temp,count=0,a;
		temp=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			count=count+(a*a*a);
		}
		if(temp==count)
		{
			System.out.println(count+"Armstrong Number");
		
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=sc.nextInt();
		ArmstrongNumber.armstrong(number);
}
}