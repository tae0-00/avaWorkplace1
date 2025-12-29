package com.kh.chap01.abstraction.model.vo;

public class Student {
	
	//학생관리 프로그램을 만든다고 가정. 
	//학생과 관련된 속성: 번호, 이름, 전화번호, 성별, 나이 ...
	// 이름 나이 키 3가지 정보만 관리
	public String name;
	public int age;
	public double height;
	
	//클래스 바로 아래 있는 변수들을 필드라고 말함
	
	//학생객체가 가지는 기능.
	public void study() {
		System.out.println("공부중..");
	}
	
	
		
}
