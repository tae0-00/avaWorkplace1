package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/* 
	 * 조건문 
	 * -조건식을 통해 참/거짓을 판단하여 그에 해당하는 코드를 실행
	 * -조건문은 보통 비교연산자, 논리연산자를  사용한다.
	 * -조건문은 IF /Switch문으로 나뉜다.
	 */
	
	Scanner sc = new Scanner(System.in);
		
	public void method() {
			/* 단독 IF문 
			 * [표현법}
			 *if(조건식) {
			 *	조건식이 true인 경우 실행할 코드
			 */
		
	System.out.print("정수를 입력하세요.");
		int num =sc.nextInt();
		
		if (num>0) {
			System.out.println("양수다");
		}
		
	    if (num<=0) {
	    	System.out.println("양수가 아니다. ");
	    }
			
		}
	 public void method2() {
	    	
	    	/* 
	    	 * if - else문\
	    	 * if 조건식{
	    	 * 조건식이 참일 경우 실행할 코드
	    	 * else {
	    	 * 조건식이 False인 경우 실행할 코드
	    	 * }
	    	 * 
	    	 */
	    	 
	    System.out.print("정수를 입력하세요.");
	    int num =sc.nextInt();
	    	
	    if(num> 0) {
	    	System.out.println("양수다");
	    	}
	    else {
	    	System.out.println("양수 아니다.");
	    	}}
	    	
	    public void method3() {
	    		
	    	/*
	    	 * if -else if 
	    	 * 같은 비교대상으로 "여러개의 조건을 " 제시해야 하는 경우 사용
	    	 * if (조건식1) {
	    	 * 조건식1이 true인 경우 실행할 경우
	    	 * else if (조건식 2) {
	    	 * 조건식2이 true인 경우 실행할 경우
	    	 * else if (조건식 3) {
	    	 * 조건식3이 true인 경우 실행할 경우
	    	 * 
	    	 *} else {
	    	 *위 조건들이 모두 거짓일 경우
	    	 */
	    		
	    System.out.print("정수 : ");
	    int num = sc.nextInt();
	    	
	    if (num >0) {
	    	System.out.println("양수다");
	    			
	    }else if(num == 0){
	    System.out.println("0이다.");
	    	
	    }else {
	    System.out.println("0이다.");
	    	}
	    }
	    public void method4() {
	    		
	    		/*사용자가 입력한 나이를 가지고 어린이 청소년 성인 어르신인지 출력
	    		 * 어린이 (13이하) 청소년 (13초과. 19세 이하 ), 성인(19초과 60이하)
	    		 * 어르신 (60초과)
	    		 * 
	    		 */
	    	System.out.print("나이를 입력하시오.");
	    	int age = sc.nextInt();
	    	
	    	if(age<=13) {
	    	    System.out.println("어린이 입니다.");
	    	
	    	}
	    	else if ( age<=19) {
	    		System.out.println("청소년 입니다.");
	    	}
	    	else if ( age<=60) {
	    		System.out.println("성인 입니다.");
	    	}
	    	else {
	    		System.out.println("어르신 입니다.");
	    	}
	    	}
	    	
	    public void method5 () {
	    	//성별과 이름을 입력 받아 이름과 성별을 출력
	    	//성별은 m/f로 입력받고 출력시레는 남자 여자로 출력
	    	
	    	System.out.print("이름 :" );
	    	String name = sc.next();
	    	
	    	System.out.print("성별 :" );
	    	char gender = sc.next().charAt(0);
	    	
	    	String result = " "; // 변수 선언만
	    	
	    	if (gender == 'm'|| gender =='M') {
	    		result = "남자";
	    	}
	    	else if (gender == 'f'|| gender =='F') {
		    		result = "여자";
	    	}
	    	//else { 
	    		//result ="중성";
	    	
	    		System.out.println(name + "님은"+ result + "입니다.");
	    		// result 값을 초기화하거나 else를 추가하기
	    		// 초기화를 추천 항상 초기화 하는거 읻지 않기
	    }
	    		
	    public void method6 () {
	    	
	    	//사용자에게 이름을 입력 받아 본인 이름과 일치하는지 비교하기
	    	String name = sc.next();
	    	
	    	/*if(name== "김태경") {
	    		System.out.println("김태경님 반갑습니다.");
	    	}
	    	else {
	    		System.out.println("누구?");
	    	}
	    	-기본자료형과 비교시 ==/!=는 사용가능함
	    	-단, 참조자료형은 동등비교시 정상ㄹ적인 비교가 안된다.
	    	-참조자료형은 서로 값이 동일한지 비교할때 .equals()를 사용.
	    	
	    	자료형= double int char 등
	    	참고자료형 = String
	    	*/
	    	if(name.equals("김태경")){
	    		System.out.println("김태경님 반갑습니다.");
	    	}
	    	
	    	else {
	    		System.out.println("누구?");
	    }
	    	
	    }
	    
	    
	    
	    }
