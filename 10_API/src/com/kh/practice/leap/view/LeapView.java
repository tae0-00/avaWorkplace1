package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		 Calendar today = Calendar.getInstance();
		 Calendar m1 =new GregorianCalendar(1,1,1);
		
		long num1=today.getTimeInMillis();
		long num2=m1.getTimeInMillis();
		
		long days=(num1-num2)/1000/60/60/24;
		
		System.out.println("총 날짜 수: "+days);
		
		
	}

	
}
