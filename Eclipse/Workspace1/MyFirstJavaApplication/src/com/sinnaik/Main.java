package com.sinnaik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();
e1.printDetails();

Scanner s1=new Scanner(System.in);
System.out.println("Enter age,age,id");
int age1=s1.nextInt();
String name1=s1.next();
int eid1=s1.nextInt();
Employee e3=new Employee(age1,name1,eid1);
e3.printDetails();
System.out.println(age1);
System.out.println(name1);
System.out.println(eid1);
Employee e2=new Employee(17,"Jagdish",168473);
e2.printDetails();
	}

}
