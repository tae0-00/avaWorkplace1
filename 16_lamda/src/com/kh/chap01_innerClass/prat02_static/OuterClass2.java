package com.kh.chap01_innerClass.prat02_static;

public class OuterClass2 {
	private String str= "필드";
	private static String staticStr ="정적필드";
	
	/*
	 * 정적 내부 클래스
	 * -외부클래스가 로드되는 시점에서 정적 내부클래스도 함께 Static영역으로 저장된다.
	 * -외부클래스에 종속적이지 않ㄱ다//내부클래스의 일반 필드로 사용하지 못한다??
	 * -하나의 클ㄹ래스파일에 다양한 클래스를 설계할 때 주로 사용한다.(DTO)
	 * -외부클래스와 무관하게 다른 클래스에서도 이용할 목적ㅇ로 사용한다. 
	 */
	public static class staticInnerClass{
		private int num =100;
		private static int num2 =100; 
		
		public void test() {
			//System.out.println(str);//생성시점이 다르기 때문에 안된다
			System.out.println(staticStr);
			System.out.println(num);
			System.out.println(num2);
		}
	}

}
