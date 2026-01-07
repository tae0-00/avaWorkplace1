package com.kh.chap02_String.controller;

public class B_StringBuilderAndBuffer {
	/*
	 * StringBuilder StringBuffer 
	 * -문자열 기반 가변클래스
	 * -문자열의 메모리 부족 ㅇㅣ슈를 해결하기 뤼해 만든 클래스
	 * -두 클래스의 사용	법은 동일
	 * -차이점은 "동기화여부"
	 * 
	 * -StringBuilder는 동기화를 지원하지 않음
	 * "멀티테스팅환경"에서 좋은 성능을 보오임
	 * -StringBuffer는 동기회를 지원하기 때문에 
	 * '멀티테스팅환경'에서 스레드 환경에서 안전성을 보장하나 성능은 나쁨
	 * 
	 */
	public void method1() {
		String str ="Hello";
		str+="World";
		
		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append("World");// 같은 저장공간에서 이어쓰기 가능
		sb1.append("!!!");//주소갑 한개만 사용
		
		StringBuffer sb2= new StringBuffer();
		sb2.append("World");
		
		System.out.println(sb1);
		System.out.println(sb2.toString());
		
		System.out.println("문자열의 길이는"+ sb1.length());
		System.out.println("문자열 o의 마지막 위치는"+ sb1.lastIndexOf("o"));
		
		//0번 인덱스부터 문자를 삭재
		System.out.println("모든 글자 삭제 :"+ sb1.delete(0, sb1.length()));
		
		//특정 위치의 문자를 삭제
		System.out.println("마지막 위치의 문자 삭제하기 : "+ sb1.deleteCharAt(sb1.length()-1));
		
	}

	
	
	

}
