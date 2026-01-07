package com.kh.chap02_String.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

import javax.lang.model.type.ArrayType;

public class C_StringTokenizer {
	
	public void method() {
		String str= "fdf,fsdf,dsdf,sSt,ring";

		//구분자를 제시해서 문자열을 구분자 기준으로 분리 시크는 방법
		//반법 1. 문자열.split (구분자) : String []
		//- 분리된 문자열드을 Sreing []담아서 관리해주는 메서드 
		String [] arr= str.split(",");//[fdf, fsdf, dsdf, sSt, ring]로 바꿔줌 

		
		System.out.println(Arrays.toString(arr));
		
		//방법2. 분리된 각각의 문자열들을 토큰으로 관리하는 방법
		//		StringTokenizer stn= new StringTokenizer(문자열, 구분자);
		StringTokenizer stn= new StringTokenizer(str,",");
		
		
		System.out.println("분리된 문자열의 개숫 : "+ stn.countTokens());
//		
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
		//현재 남아있는 토큰의 개수를 넘어가면 에러가 발생한다. 
		//-->>이렇게 하나하나는 하지 않음 
		
		//sysoutg하는 방법
		//방법 1
		while(stn.countTokens()>0) {
			System.out.println(stn.nextToken());
		}
		//방법 2
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
	
}
