package com.kh.chap04_feild.model.vo;

public class FieldTest1 {

	/*
	 * 필드== 인스턴스 변수== 멤버 변수
	 * 
	 * 변수의 구분
	 * -전역변수 : 클래스 영역 바로 아래 선언하는 변수를 의미한다. 
	 * 			클래스 내부라면 어디서든 사용가능하다.
	 * 
	 * -지역변수 : 클래스 영역 내에서 특정영역(){}에 선언한 변수를 의미. 
	 * 			선언한 영역 안에서만 사용가능하다. (if,메서드 for문 등..)
	 * 
	 * 
	 * 1. 전역변수
	 * 		-필드 == 인스턴스 변수 ==멤버 변수 (heap)
	 * 		 생성시점 : 객체가 메모리에 할당되면서 생성된다. 
	 * 		 소멸시점: 객체가 소멸할 떄 함께 소멸.
	 * 	
	 *      -클래스변수 == static 변수 
	 * 		 생성시점 : 프로그램 시작과 동시에 static영역에 메모리 할당(static)
	 * 		 소멸시점 : 프로그램 종료시 
	 * 
	 * 2. 지역변수
	 * 		생성시점 : 특정 영역(){}이 실행될 때 저장공간이 할당 (stack)
	 * 		소멸시점 : 특정영역이 끝날때 
	 * 
	 */
	private int global;//필드 
	{
		// 초기화 블럭
		//객채 생성 시 최초 1회 실행
		global =50;
	}
	
	public static int num;
	//static 초기화 블럭
	static {
		// static 변수를 초가화하는대 사용
		num=55; //프로그램 실행될떄  최초 1회 실행 
	}
	public void test(int num/*매개변수*/) {
		int local =0;//지역변수 초기화하지 않으면 에러 발생 
		
		if(true) {
			int a=0; 
		}
		
		System.out.println(local);//지역변수 초기화하지 않으면 에러 발생 
		System.out.println(global);//전역변수의 저장위치는 힙메모리 , 이 공간은 비어있을 수 없어 
									// jvm이 자료형의 기본값으로ㅓ 초기화 시킴
		
		//메서드 호출을 위해서는 반드시 매개변수를 전달해야 하므로 값이 초기화는 보장된 것.
		
		System.out.println(num);//
		//System.out.println(a);	//메서드 호출을 위해서는 반드시 매개변수를 전달해야 하므로 값이 초기화는 보장된 것.
		
		
		FieldTest2 f2= new FieldTest2();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
