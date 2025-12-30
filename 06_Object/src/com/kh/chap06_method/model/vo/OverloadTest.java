package com.kh.chap06_method.model.vo;

public class OverloadTest {

	/*시험에 나온뎅
	 * 
	 * 메서드 오버로딩 
	 * -한 클래스 내에 "같은 이름의 메서드를 여러개" 정의 할수 있는 방법.
	 * -단, 매개변수의 자료형, 개수 순서를 다르게 작성해줘야한다.
	 * -그 외 매개변수의 이름이나 접근제한자 , 반환형은 다르더라도 메서드 오버로딩에 영향을 주지 않는다.
	 */
	
	public void test() {
		
	}
	public void test(int a) {
		
	}
	//이름은 같아도 자요형이 같으면 똑같은 메서드로 취급
	//public void test(int b) {//이름만 바꾸는건 아ㅜ무런 의미가 없음
		
	//}
	//매개변수의 개수는 같지만 자료형이 다르면 다른 메서드로 취급
	public void test(String a) {
		
	}
	public void test(int a,String b) {
		
	}
	//자료형의 순서가 다르게 때문에 메서드 오버로딩이 적용 
	public void test(String b,int a) {
		
	}
	/*
	private void test(String b,int a) {
		
	}
	접근제한자 오버로딩 영향을 주지 않음 앞에 붙여도 의미 없음*/
	
	//반환형으로 바꿔도 메서드 오버로딩과 상관이 없음 
	/*public void test(String b,int a) {
	 * 
		return 1;} */
	
}
