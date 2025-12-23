package com.kh.chap02.loof;

public class B_While {

	
		/*
		 * while문
		 * 
		 * [표현법]
		 * 
		 * [초기식] 필수아님
		 * while(조건식){
		 *  반복적으로 수행할 코드
		 *  
		 * [증감식 or 분기문] 필수 아님 
		 * 
		 * 
		 */
		 
	public void method1() {
		//for을 while로 바꾸기
		
		int i =0;//초기식
		while (i<5){//조건식
			System.out.println("안녕");
			i++;
		}
	}
	public void method2() {
		//while 5회 반복
		//1 2 3 4 5 
		
		int i= 1;
		while (i<6) {
			System.out.println(i++ + " ");
		}
	}
	
	public void method3() {
		//1부터 랜덤값(1~10)까지의 총 합계를 While문으로 작성
		//출예시: 1부터 xxx합은 xxxㅇ비니다.
		
		int random =(int)(Math.random()*10 + 1);
		int sum = 0;
		int i=1;
		
		while (i<=random) {
			sum+=i++;
			
		}
		System.out.println("1부터"+random +"까지의 합값"+ sum);
	}
	/* 
	 * do-while 
	 * 
	 * [표현법]
	 * do{//반복 실행할 코드(단, 최초 1회는 반드시 실행)
	 * }
	 * while(조건식);
	 * -do-while문은 별도의 조건검사 없이 최초의 1회는 반드시 수행
	 * 
	 * 
	 */
	public void method4() {
		do {
			System.out.println("하이");
		}while (false);
	}
	public void method5() {
		//do-while 5회 반복
		//1 2 3 4 5
		int i= 1;
		do {
			
			System.out.println(i+ " ");
			i++;
		}
		while (i <6);
		
	}
}
