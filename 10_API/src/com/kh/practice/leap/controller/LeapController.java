package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public LeapController(){
		
	}
	public boolean isLeapYear(int year) {
		boolean isdup;
		 if((year%4==0&& year%100!=0) ||( year%400==0) ) {
			 isdup=true;
		 }else {
			 isdup=false;
		 }
		
		return isdup;
	}
	public long leapDate(Calendar c) {
		// 이 방식은 개똥망함 
		//윤달 날짜날짜 개수는 구할수는 있어도 문제 요구대로 윤달에 366 넣고 365 더하고 뭐 그런거 짤수 없음\
		//내가 한건 날짜개수에 365를 더한거임 
//		Calendar m1 =new GregorianCalendar(1,0,1);
//		
//		long num1=c.getTimeInMillis();
//		long num2=m1.getTimeInMillis();
//		
//		long days=(num1-num2)/1000/60/60/24;
//		
//		
//		
//		Calendar to2 =new GregorianCalendar(26,2,1);
//		long num3=to2.getTimeInMillis();
//		
//		long date2=(num3-num2)/1000/60/60/24;
//		if(isLeapYear(2026)){
//			
//		}
		int year = c.get(Calendar.YEAR);//이건 1년부터 지금년도까지 날짜를 세주기 위해 그 년도를 불러와줌
		int month = c.get(Calendar.MONTH);//  날짜를 세주기 위해 그 월을 불러와줌
		int dday =c.get(Calendar.DAY_OF_MONTH);//그 월의 날짜를 가져와줌
		
<<<<<<< HEAD
		Calendar m1 =new GregorianCalendar(1,0,1);
		
		long num1=c.getTimeInMillis();
		long num2=m1.getTimeInMillis();
		
		long days=(num1-num2)/1000/60/60/24;
		
		long result=0;
		if(isLeapYear(2026)) {
			result=days+366;
=======
		int result=0;
		for(int i=1; i<year;i++) {//여기도 똑같이 0으로 하면 1년부터 아니라 0년부터 검사함 이상함 i=1로 해야함
			if(isLeapYear(i)) {//여기에 year로 넣으면 배열 안돈다 헷갈리지말고 자동처리되는거 그냥 쓰지말아라
				result=result+366;
			}else {
				result+=365;
			}
>>>>>>> branch 'main' of https://github.com/tae0-00/avaWorkplace1.git
		}
		for(int i=1; i<month+1; i++) {
			//switch(month+1) {//월은 0부터 세니까 +1해줘야지 1월부터 가능한거 잊지 말자 도 틀림!!! 
			//이거는 포문을 돌리는 의미가 없게 달의 값에 1을 더할떄 케이스들을 실행시키는 거임 멍청함
			switch(i){//반복문은 무조건 그 i값일때로 해야하는거 잊지좀 말아라
			case 1 : case 3: case 5: case 7 :
				case 8 : case 10 : case 12:
				result+=31;
				break;
			case 2 : 
				if(isLeapYear(year)) {
					result+=29;
				}else {
					result+=28;
				}
				break;
			case 4 : case 6 : case 9:  case 11 :	
				result+=30;
				break;
			}
		}
		result+=dday;//오늘까지 날짜까지 더하는거 잊지 말자
		return result;
	}
	
	
}
