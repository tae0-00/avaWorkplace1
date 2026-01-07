package com.kh.chap03_wrapper;

public class Run {

	public static void main(String[] args) {
		/*
		 * wrapper 클래스
		 * => 기본자료형을 객체로 포장해주는 클래스르 의미한다.
		 * 기본자료형 <--언박싱    박싱--> wrapper 클래스(형변환가능) 
		 * boolean      	 Boolean
		 * char          	 character
		 * byte          	 Byte
		 * short          	 Short
		 * int               Integer
		 * long          	 Long
		 * float         	 Float
		 * double        	 Double 
		 * 
		 */
		int num1 =10;
		int num2 =15;
		//기본자료향은 값만 저장하기때문에 특별한 기능이 존재하지 않는다
		
		//기본자료형을 wrraper클래스로 변환(박싱)
		Integer i1= num1;
		Integer i2= num2;
		
		System.out.println(i1.equals(i2));//두값이 같은지?
		System.out.println(i1.hashCode());//주소값
		System.out.println(i1.compareTo(i2));
		//대소비교 a.compareTo(B)
		//a가 b보다 작은 경우 -1
		//같은 경우 0
		//큰 경우 1
		
		//wrapper을 기본 자료형으로 (언박싱)
		int num3 =i1;
		int num4= i2;
		
		//String형태로 이루어진 기본 자료형을 기본 자료형으로 변환하는 방법
		String str1="10";
		String str2="15.5";
		
		//String을 기본자료형으로 : 파싱하는 방법
		//wRAPPER.클래스.parsexxx(변환할 문자열);
		
		int i =Integer.parseInt(str1);//"10"-> 10
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
		//정확한 값을 알고 있어야함 값과 자료향이 다르면 오류남
		
		//기본자료형 --> String 
		//10-->"10"
		String strI= String.valueOf(i);
		String strI2= i+" ";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
