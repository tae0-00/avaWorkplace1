package com.kh.chap05_constructor.model.vo;

public class User {

	//필드부
	private String userId;
	private int age; 
	private char gender;
	
	//생성자부 == 객체를 생성
	/* 객체를 생성하는 기능을 담당 
	 * 
	 * 생성자
	 * [표현법]
	 * public 클래스명([매개변수]){
	 * 생성자를 통해 객체를 생성 시 실행 할 코드 
	 * 
	 *  생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위함
	 * 2. 객체생성과 동시에 매개변수로 전달된 값을 통해 필드를 초기화할 목저긍로 사용
	 * 
	 * 생성자 작성 시 주의 사항
	 * 1. 클래스명과 동일해야한다(대/소문자 포함)
	 * 2. 반환형이 존재하지 않는다.
	 * 3. 여러개의 생성이 가능하지만 매개변수가 중복되면 안도니다.(메서드 오버로딩과 동일한 개념)
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 만들어주지 않는다.
	 */
	
	//기본생성자
	//생성자 미 작성시 자동으로 작성해주는 생성자  
	//-되도록 항상 기본 생성자를 만드는 습관을 가질것 
	public User() {
		System.out.println("기본생성자 호출");
	}
	 //매개변수가 있는 생성자
	//-전달받은 매개변수를 통해 필드를 초기화할 목적으로 사용하는 생성자
	public User(String userId) {
		this.userId=userId;
	}//매개변수를 만들면 기본 생성자가 사라지니까 기본 생성자를 만드는것ㅇ르 추천 
	
	//매개변수가 있는 생성자2
	public User(String userId,int age, char gender) {
		//다른 생성자에서 도일한필드값을 초기화하는 경우, 
		//현재 생성자에서 다른 셍성자를 호출하는 방법르려 코드를 줄일수 있ㅇㅁ
		this(userId);//디스생성자 호출 무조건 첫줄에 넣어줘야함 
		//==this.userId=userId;
		this.age=age;
		this.gender=gender;
	}
	
	//메서드부
	//엣터 겟터 생성
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserId() {
		return this.userId;
	}
}
