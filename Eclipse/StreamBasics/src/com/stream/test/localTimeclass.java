package com.stream.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class localTimeclass {

	public static void main(String[] args) {
//		LocalDate date=LocalDate.now();
//		int dd=date.getDayOfMonth();
//		int mm=date.getMonthValue();
//		int yyyy=date.getYear();
//		System.out.println(dd);
//		System.out.println(mm);
//		System.out.println(yyyy);
//		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		//System.out.println(date);
		
		//LocalTime localTime=LocalTime.now();
		//System.out.println(localTime);
		
		//LocalDateTime dateTime=LocalDateTime.now();
//		System.out.println(dateTime);
//		int dd=dateTime.getDayOfMonth();
//		int mm=dateTime.getMonthValue();
//		int yyyy=dateTime.getYear();
//		System.out.printf("%d-%d-%d",dd,mm,yyyy);
//		int h=dateTime.getHour();
//		int m=dateTime.getMinute();
//		int s=dateTime.getSecond();
//		int n=dateTime.getNano();
//		System.out.printf("%d-%d-%d-%d",h,m,s,n);
		
//		LocalDateTime dateTime=LocalDateTime.of(1996,06,25,06,00,00,00);
//		System.out.println(dateTime);
//		
//		System.out.println("after 6 months:"+dateTime.plusMonths(6));

	
	LocalDate date=LocalDate.of(1996, 5, 3);
	LocalDate date1=LocalDate.of(2018, 11, 29);
	Period p=Period.between(date, date1);
	//System.out.printf("Age is %d years %d months & %d days",p.getYears(),p.getMonths(),p.getDays());
	LocalDate dday=LocalDate.of(1996+60, 6, 25);
	Period period=Period.between(date1, dday);
	int d=period.getYears()*365+p.getMonths()*30+period.getDays();
	System.out.printf("you will be on earth %d days",d);
	
	
	}

}
