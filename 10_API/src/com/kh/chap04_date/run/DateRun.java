package com.kh.chap04_date.run;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRun {

	public static void main(String[] args) {

		//test1();
		//test2();
		test3() ;
		test5();
	}

	/*
	 * calendar
	 * -날짜와 시간에 대한 데이터를 처리하는 "추상클래스"
	 * 
	 */
	public static void test1() {
		//현재 날짜와 시간정보 조회
		
		Calendar cal1= new GregorianCalendar();
		Calendar cal2 =Calendar.getInstance();
		
		System.out.println(cal1);
		
		//현재 년 /월/ 일 조회
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH)+1);//월은 0월 부터 센다
		System.out.println(cal1.get(Calendar.DATE));
		
		//시/ 분/초
		System.out.println(cal1.get(Calendar.HOUR));//2
		System.out.println(cal1.get(Calendar.HOUR_OF_DAY));//14
		System.out.println(cal1.get(Calendar.MINUTE));
		System.out.println(cal1.get(Calendar.SECOND));

		 printCalendar(cal1);
	}
	public static void printCalendar(Calendar c) {//시간정보를 출력해수즈는 메소드??
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",
                          c.get(Calendar.YEAR),
                          c.get(Calendar.MONTH) + 1,
                          c.get(Calendar.DATE),
                          c.get(Calendar.HOUR_OF_DAY),
                          c.get(Calendar.MINUTE),
                          c.get(Calendar.SECOND)
                );
    }
	public static void test2() {
		//특정일 특정시간으로 초기화된 Calendar 객체 생성 
		Calendar cal1= Calendar.getInstance();
		//2027년 1월 1일 0시0분0초로 초기화된 객체 만들기
		cal1.set(2027,0, 1, 0,0,0);
		printCalendar(cal1);
		
		Calendar cal2 =new GregorianCalendar(2027,1,1,0,0,0);
		printCalendar(cal2);
		
		//날짜 차이 계산하는 방법
		Calendar now = Calendar.getInstance();
		Calendar dday= new GregorianCalendar(2026,0,27);
		
		//각 캘린더 객체를 밀리초로 뱐환하여 차이를 구한다
		long num1= now.getTimeInMillis();//1970년 1월 1일부터_현재시간까지 흐른 시간
		long num2= dday.getTimeInMillis();//
		
		double diff=(num2-num1)/1000.0/60/60/24;//소수점날짜가 나옴
		long diff1=(num2-num1)/1000/60/60/24;//.0을 뺴고 그냥 값에 올림으로 처리하기 위해 1을 더함 
		System.out.println(diff);
		System.out.println("시험까지 d-day"+(diff+1)+ "일 남음");
		
	}
	public static void test3() {
		/*
		 * java.util.Date 클래스
		 * -날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * -자바 개발 초창기에 급하게 만들어진 클래스라 완성도가 높지 않음
		 * 
		 */
		//기본 생성자를 통해 Date객체 생성
		//- 현재 날짜 및 시간을 가지고 생성
		Date today = new Date();
		System.out.println("기본생성자 : "+ today);
		
		// 내가 원하는 날짜 2025년 5월 19일로 초기화
		//방법1 년월 일 생성자 이용방법
		
		Date date1= new Date(2025-1900, 5-1, 19,0,0);//년도 부분에 -1900을 해줘야함 개이상함 
		System.out.println("매개변수 생성자 : "+ date1);
		
		//방법2. 밀리세컨즈를 매개뱐수로 받는 생성자를 이용
		Calendar cal2=new GregorianCalendar(2025,05,19);
		long millis =cal2.getTimeInMillis();
		Date date2= new Date(millis);
		System.out.println("밀리세컨즈 생성자 :" +date2);
		
	}
	public  static void test4() {
		/*
		 * java.text.SimpleDateFormat 때문에 Date를 많이 사용 
		 * 
		 * 
		 * "xxxx년 xx월 xx일 xx시 xx분 xx초 만드는 방법 
		 * 
		 * SimpleDateFormat체 생성하기
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// sdf.format(Date 객체) : 문자열반환
		String formateDate = sdf.format(new Date());
		System.out.println(formateDate);
	}
	public  static void test5() {
		/*
		 * 번외) 숫자값 형식 지정
		 * DecimalFormat
		 * 
		 * #해당자리에 데이터가 없는 경우 생략시키는 형식
		 * 0 해당자리에 데이ㅋ터가 없는 경우 0으로 표시하는 형삭
		 * 
		 */
		double num = 1234567890.123;
		DecimalFormat df= new DecimalFormat("#,###");
		System.out.println(df.format(num));
		//위에서처럼 하면 뒤에 실수 자리는 없어지고 정수로만 표현됨 그래서
		df.applyPattern("#.00000");//실수 5번째까지 나오게 하겠다.
		
		//이거를 더해줘야함
		System.out.println(df.format(num));
	}
}
