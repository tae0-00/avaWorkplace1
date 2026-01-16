package com.kh.chap01_innerClass.prat01_instace;

public class OuterClass {

	private String str="외부클래스필드";
	private static String staticStr ="외부클래스 정적필드";
	private InnerClass inner;
	
	/*
	 * 인스턴스(객체)내부 클래스
	 * -필드(인스턴스변수)와 동일한 위치에 선언하는 내부클래스는 인스턴스 내부 클래스라고 부른다.
	 * -일반적으로 외부클래스에서만 사용하는고유한 객체를 선언할때 사용. 
	 * -외부클래스의 "보조적인 역할"의 클래스르 정의한다.
	 * ex)ha쉬맵,
	 * -인스턴스 내부 클래스는 반그시 "외부 클래스"에 의해 생성되어야 한다.
	 */
	
	public OuterClass() {
		inner =  new InnerClass();//기본생성자에서(꼭 여기일필요는 없지만 외부여야함) 초기화해주기 
	}
	
	
	/*public*/ private class InnerClass{// 프라이빗으로 선언 public으로 선언하는건 내부클래스의 목적과 맞지 않음 
		private int num;
		private static int sNum =100;
		
		public void method() {
			System.out.println(num);
			System.out.println(str);//외부클래스 필드 접근가능!
			System.out.println(staticStr);
			System.out.println(sNum);
			
			
		}
	}
	public void method() {
		inner.method();
	}
}
