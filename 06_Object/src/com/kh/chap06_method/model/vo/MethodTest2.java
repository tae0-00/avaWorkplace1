package com.kh.chap06_method.model.vo;

public class MethodTest2 {

	/*
	 * sratic  메서드 
	 * 
	 * [표현법[
	 * 접근제한자 static 에약어 반환형 메서드명 (매개변수){
	 * 코드 
	 * return;
	 * }
	 * -메서드 호출 시 객체를 생성할 필요 없다. 
	 * -프로그램 시작시 정적메모리 역역에 메서드정보가 저장되어있기 때문에 
	 * -클래스명.메서드명 (전달값);으러 호출하면 된다. 
	 */
	
	static int count =1;
	int count2 =2;
	public static int method(int num1) {
		System.out.println(num1);
		/*
		 * static 메서드 안에서는 일반 필드는 접근이 불가능 
		 * -변수의 생성 시점이 다르기 때문레
		 * -static 메서드는 프로그램 시작과 동시에 정적메모리에 할당되는데, 
		 * 같은 시점에 static변수는 함께 할당되기 때문에 static변수는 사용가능
		 * -하지만 일반 변ㅅ는 객체 생성 시점에 메모리에 공간이 할당되므로, 
		 * static메서드 안에서는 사용이가 불가능하다. 
		 */
		//매개변수* 스태틱 변수
		return num1*count;
		//return num1* count2;//생성시점이다르면 불가능함 
		
	}
	
}
