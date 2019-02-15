package com.sin;

import java.util.Scanner;

public class Print {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int num[]=new int[5];
	
	for(int i=0;i<5;i++)
	{
	
    num[i]=sc.nextInt();
   
	}
	for(int i=0;i<5;i++)
	{
		 System.out.println(num[i]);
	}
}

}
