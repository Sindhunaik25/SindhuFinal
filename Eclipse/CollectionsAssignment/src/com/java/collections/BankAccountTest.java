package com.java.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountTest implements Comparator <BankAccount>{
	public static void main(String [] args)
	{
		Set <BankAccount>t1= new TreeSet(new BankAccountTest());
		t1.add(new BankAccount("Sindhu",40200,100));
		t1.add(new BankAccount("Sreeja",46855,105));
		t1.add(new BankAccount("Madhushree",68845,102));
		t1.add(new BankAccount("Vaishnavi",5645,101));
		t1.add(new BankAccount("Megha",  55845,  97));
		
 for (BankAccount b: t1)
 {
	 System.out.println(b);
 }
	}

	@Override
	public int compare(BankAccount b1, BankAccount b2)
	{
		if(b1.getId()==b2.getId())
			return 0;
		else if(b1.getId()>b2.getId())
		{
		return 1;
	}
		else 
			return -1;
	}
}
