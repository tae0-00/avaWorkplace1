package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		 Calendar today = Calendar.getInstance();
		 Calendar m1 =new GregorianCalendar(1,1,1);
		 LeapController lc =new LeapController();
		
		 int year=today.get(Calendar.YEAR);
		if(lc.isLeapYear(year)) {
			System.out.println(year+"은 윤년입니다.");
		}
		else {
			System.out.println(year+"은 평년입니다. ");
		}
		
		System.out.println("총 날짜 수: "+lc.leapDate(today));
		
	}

	
}
