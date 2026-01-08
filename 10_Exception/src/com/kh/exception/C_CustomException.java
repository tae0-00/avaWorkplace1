package com.kh.exception;

public class C_CustomException extends Exception{
	/*
	 * 특정상황에서 발생하는 예외를 직접 만드는 방법
	 * 1. 예외처리 클래스 생성 후 , Exception클래스를 상속시켜준다. 
	 * 
	 * 2. super키웓를 통해 부모생서자에 매개변수를 전달한다.
	 * 
	 * 3. 부모생성자에서 msg내용 호출하면서 예외처리 
	 * 
	 * 클래스의 이름에 어떤 에러의 유형을 할지 명확하게 설먕해놔애함
	 */
	 
	public C_CustomException(String msg) {
		super(msg);
	}

}
