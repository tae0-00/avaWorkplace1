package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * switch문과 if문의 차이점
	 * if(조건식) => 조건식을 복잡하게 기술할 수 있음. 
	 * switch는 조건식이 없으며, 확실한 값의 변수만 기술한다.
	 * 
	 * 
	 * [표현법]
	 * switch(동등 비교 수행 대상) {
	 * case 값1 : 실행할 코드 ;
	 * 				break;
	 * 
	 * case 값2 : 실행할 코드 ;
	 *				break;
	 *
	 * default : 실행할 코드 ;
	 *} 		
	 *
	 *switch문의 장정
	 *-case를 통해 내가 실행하기 원하는 코드로 프리패스하기 때문에 if-else문보다 훨씬 빠름.
	 *
	 *switch문 
	 *-자주 사용되지는 않지만, 정밀한 연산결과가 "동일한 속도"로 수행되어야 하는 경우 사용한다.
	 *ex) 키보드 입력, 마우스 입력
	 *	
	 */
Scanner sc = new Scanner(System.in);

public void method1() {
	/*1 -3 정수값을 입력받아
	 * 1인경우 빨
	 * 2인경우ㅜ 파
	 * 3인 경우 초
	 * 모두 아니면 잘못입력했습니다.
	 */
	System.out.print("1-3 사이의 정수를 입력하십시오 : ");
	int num = sc.nextInt();
	
	if (num ==1) {
		System.out.println(" 빨간불");
		
	}
	else if (num ==2) {
		System.out.println(" 파판불");
	}
	else if	(num ==3) {
		System.out.println(" 초록불");
	}
	else {
		System.out.println("잘못 입력했습니다.");
	}
	
		switch(num) {
		case 1 :
			System.out.println(" 빨간불");
			break;
		case 2 :
			System.out.println(" 파란불");
			break;
		case 3 :
			System.out.println(" 초록불 ");
			break;
		default : 
			System.out.println("잘못 입력했습니다.");
			//가독성확보, 시스템성능 이유로 사용함
	}}
		
public void method2() {
			//사용자에게 구매할 과일을 입력받아
			//각 과일마다의 가겨을 출력
			//사과(1000),바나나(2000),복숭아(5000)
		System.out.print("구매할 과일 :");
		String fruit =sc.next();
		System.out.println("구매할 수 있는 과일 :");
		
		String fruit1 =sc.next();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		/*case "망고" :
			price = 5000;
			break;	*/
		case "복숭아" :
			price = 5000;
			break;
			
		//==동등성 비교, equals.는 동일성?
		
		}
		}
	
	
	
	
	
	
	
}

