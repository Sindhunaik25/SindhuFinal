package com.sinnaik;

public class Employee {
int age;
String name;
int eid;
Employee()
{
	age=22;
	name="Sindhu";
	eid=164158;
}
Employee(int age,String name,int eid)
{
	this.age=age;
	this.name=name;
	this.eid=eid;
}

public void printDetails()
{
	System.out.println(age);
	System.out.println(name);
	System.out.println(eid);
}
}
