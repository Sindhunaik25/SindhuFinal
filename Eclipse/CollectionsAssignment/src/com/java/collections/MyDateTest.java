package com.java.collections;

import java.util.HashMap;
import java.util.Set;

public class MyDateTest {

	public static void main(String[] args) {
	HashMap<MyDate, String> map=new HashMap<MyDate, String>();
	MyDate date1=new MyDate(25,06,1996);
	MyDate date2=new MyDate(25,06,1997);
	MyDate date3=new MyDate(23,07,1986);
	map.put(date1, "Sindhu");
	map.put(date2, "Sahana");
	map.put(date3, "Savinaya");
	System.out.println(map);
	
	System.out.println("Name= "+get(date1,map));
	System.out.println("Name= "+get(date2,map));
	System.out.println("Name= "+get(date3,map));

	}

	private static String get(MyDate obj, HashMap<MyDate, String> map) {
		Set<MyDate> dates=map.keySet();
		MyDate[] md=(MyDate[]) dates.toArray(new MyDate[0]);
	for(MyDate i:md)
	{
		if(obj.getDd()==i.getDd() && obj.getMm()==i.getMm() && obj.getYyyy()!=i.getYyyy())
		{
			return "fail";
		}
	}
	return (String) map.get(obj);
	}

}
