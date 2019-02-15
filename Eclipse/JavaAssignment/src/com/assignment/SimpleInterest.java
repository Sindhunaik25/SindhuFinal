package com.assignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float p,t,r;
		System.out.println("Enter principle");
		p=sc.nextFloat();
		System.out.println("Enter time");
		t=sc.nextFloat();
		System.out.println("Enter rate of interset");
		r=sc.nextFloat();
        double SInterest=(p*t*r)/100;
        System.out.println(SInterest+" =Simple Interest");
        double CompoundInterest=(double)p*(Math.pow((1+r/100),t));
        System.out.println(CompoundInterest+" =Compound Interest");
	}

}
