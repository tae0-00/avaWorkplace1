package com.kh.chap04_feild.model.vo;

public class FieldTest3 {
	
	/*
	 * 
	 * static : 정적인 , 고정된
	 * static키워드는 특정변수나 메서드를 static 메모리 영역에 "고정시켜둔다" 
	 * 따라서 자주 사용하는 변수, 메소드를 static으로 관리하여 static 메모리에 영역에 고정시켜두고
	 * 사용하면 효울이 좋으며, 가끔 사용하는 변수나 메서드를 static에 보관하면 효율이 좋지 않다. 
	 */
	
	//final : 상수를 정의하는 키워드
	//한번 저장된 값을 고정하기 위해서 사용하기 위해 대부분의 static 변수는 final예약어와 함께 사용
	public static String sta =" static 변수";//기울기글꼴로 변함 
	public static final double PI = 3.14;
	
	
	public static void test() {
		System.out.println("하이 ");
	}
//전에는 새로운 객체를 생성하고 불러 올수 있었음


}
