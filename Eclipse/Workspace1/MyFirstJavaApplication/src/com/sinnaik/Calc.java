package com.sinnaik;

public class Calc {
	int n1,n2,res;
	void add(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		res=n1+n2;
		System.out.println(res+" =res");
	}
	void sub(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		res=n1-n2;
		System.out.println(res);
	}
	void mul(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		res=n1*n2;
		System.out.println(res);
	}
	void div(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		res=n1/n2;
		System.out.println(res);
	}
	

}
