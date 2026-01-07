package com.kh.exception;

import java.util.Scanner;

public class A_UncheckException {

	Scanner sc= new Scanner(System.in); 
	/*
	 * UncheckedException
	 *  -RuntimeException처럼 프로그램 실행시 발샐ㅇ되는 예외들이 대표적인 
	 *   UncheckedException계열의 ㅇ예외이다
	 *  -RuntimeException타입의 자식 클래스들
	 *   -1.Array인덱스
	 *   -2.널포인트인뎁션
	 *     -참조변수가 null인 상테에서 특정 메서드 밒 필드에 접근하려고ㅓ 할때
	 *     예시) null.get 등 
	 *   -3.클래스캐스트인젭션 
	 *   -허용할 수 없는 형변환이 진행될 경우 발생하느 ㄴ예와
	 *   예사ㅏ) p1이 child2객체로 생성된 참조변수 일떄,
	 *   (Child1) p1등을 수행하는 경우 자식클래스 부모클래스 다운클래스
	 *   -4.
	 *  ==>> 이러한 런타임에러는 충분히 예측가능한 상황이다. 
	 *  예외처라가 애초에 발생이 안되게 대부분 조건문으로 해결이 가능하다
	 *  즉, 굳이 예뢰처리(예외코드)를 할 필요가 업다 .
	 */
	public void method1() {
		//ArithmeticException 
		//-나누기 연산시 0으로 나눌때 발생
		
		System.out.println("1번정수 :");
		int num1 = sc.nextInt();
		System.out.println("2번 정수 :");
		int num2 = sc.nextInt();
		//예외처리 방법 1. 조건문으로 애초에 예외가 발생하지 않게끔 처리한다.
		//if(num2==0) {
			//System.out.println("0으로 나눌수 없음");
		//}
		//else {
		//System.out.println("나눗셈 결과는 "+ (num1/num2));
		//}
		//예외 처리 방법 2. try~catch문으로 해결하기
		/*
		 * try~catch문
		 * -예외가 발생했을 경우를 대비해서 실핼=ㅇ할 내용을 정의해 두는 문법
		 * [표현법]
		 * try{
		 *   예외가 발생 할수 있는 코드
		 * } catch(발생할 수 있는 예외 클래스){
		 *   해당예외가 발생시 실행할 구문 
		 * }
		 */
		try {
			System.out.println("나눗셈 결과 "+(num1/num2));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 럾음");
			e.printStackTrace();//오류를 로그로 출력하는 기능 
		}
		System.out.println("종료");
	}
}
