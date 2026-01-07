package com.kh.chap02_String.controller;

public class D_StringMethod {
	
	public void method() {
		String str1 ="Hello World";
		
		//1. 문자열.chartAt(int index) : char 
		//'w'
		char ch= str1.charAt(6);
		System.out.println(ch);
		
		//문자열의 길이를 반환하는 메소드
		//		문자열.length() : int
		System.out.println(str1.length());
		
		//3. 문자열.concat (String str1) : String
		// 	->문자열과 전달된 또다른 문자열을 하나로 이어주는 메서드
		
		String str2 = str1.concat("!");
		//문자열.substring
		//4. 문자열의 시작 인덱스 위치부터 끝까지 문자열을 추출하여 리턴
		//  ->문자열.substring (intbeginIndex, endIndex): String 
		// "World"
		System.out.println(str1.substring(6));
		//Hello
		System.out.println(str1.substring(0,5));
		
		//5.문자열.replace(char old, char new) : String
		//	->문자열에서 old문자를 new 문자로 변환한 문자열 반환
		String str3= str1.replace('l','c');//l을 c로 변환 
		System.out.println(str3);
		
		//6. 문자열. trim() : String 
		// ->>문자열을 앞뒤 공백을 제거한 문자열을 리턴
		String str4= "    b d d f   ";
		System.out.println(str4.trim());//b d d f 앞 뒤 공백 다 사라짐 
		
		//7.문자열. toUopperCase(): 대문자로 변경
		 // 문자열. toLowerCase(): 소문자로 변경
		System.out.println(str1.toLowerCase());
		
		//8. 문자열.toCharArray() : char[]
		 char [] arr = str1.toCharArray();
		 
		 //9. static valueOf(다양한 자료형) : String 
		 //  - 전달된 자료형의 값을 문자열로 반환해주는 메서드 
		 //  - 1 >> "1"
		 String str = " "+1; 
		 System.out.println(String.valueOf(arr));
	}

}
