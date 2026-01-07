package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public LeapController(){
		
	}
	public boolean isLeapYear(int year) {
		boolean isdup;
		 if((year%4==0&& year%100!=0) && (year%4==0 && year%400==0) ) {
			 isdup=true;
		 }else {
			 isdup=false;
		 }
		
		return isdup;
	}
	public long leapDate(Calendar c) {
		
		Calendar m1 =new GregorianCalendar(1,0,1);
		
		long num1=c.getTimeInMillis();
		long num2=m1.getTimeInMillis();
		
		long days=(num1-num2)/1000/60/60/24;
		
		long result=0;
		if(isLeapYear(2026)) {
			result=days+366;
		}
		else {
			result=days+365;
		}
		
		Calendar to2 =new GregorianCalendar(26,2,1);
		long num3=to2.getTimeInMillis();
		
		long date2=(num3-num2)/1000/60/60/24;
		if(isLeapYear(2026)){
			
		}
		
		
	}
	
	
}
