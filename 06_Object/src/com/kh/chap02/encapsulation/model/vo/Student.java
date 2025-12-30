package com.kh.chap02.encapsulation.model.vo;

public class Student {
	// 속성 ==필드== 멤버변수==인스턴스 변수== 전역변수 
	
	private String name; //얘네가 필드명
	private int age ;
	private double height;
	
	//메서드 작성방법
	/*[표현법]
	 * 접근제한자 [예약어] 반환형 메서드명 ([매개변수]) { }
	 * 
	 * 캡슐화된 필드에 접근하여 값을 조작할수 있는 메서드 
	 * setter/getter 메서드 
	 * 
	 */
	/*
	 * name 필드에 값을초기화화는 용도의 메서드
	 * 초기화 하기 위해선,값을 얻어야 하므로 매개변수 존재
	 * 초기화를 진행후 값을 반환할 필요는 업기에 반환형은 void
	 */
	public void setName(String name) {
 		//매개변수: 메서드 호출 시 전달되는 값을 받아주기 위한 변수 선언 방법//임시적으로 사용하여 값을 받아내고 버림
		//그래서 이게 굳이 필드랑 같을 필요는 없지만 관레적으로 같게 만든다ㅑ. 
		// 그러기 때믄에 디스를 사용함 
		this.name =name;
		//name=name; <- 필드명과 매개변수명이 동일한 경우 {}내에서 선언한 변수의 우선순위가
		//높기 때문에 name은 항상 매개변수 name을 가리킨다.
		//필드로서의 name을 가리고자 하면 this.name =name; 사용할 것.  
		
		//this 
		//-모든 메서드에 묵시적으로 존재하는 변수로, 생성된 객체의 주소값이 담겨있음.
	}
	/*
	 * 데이터 반환하기 위한 용도의 getter 메서드 
	 */
	public String getName() {
		//값을 반환하는 방법 :return;
		return this.name;//이 네임을 자료형 스트링에 집어느다?
	}
	public void setAge(int age) {//반환할게 없으면 void 사용
		this.age=age;
	}
	public int getAge() {//자료형(값)을 반황형으로 주는거임 
		return this.age;//this. 없어도 됨 
	}
	public void setHeight(double height) {
		this.height= height;
	}
	public double getHeight() {
		return height;
	}
}
