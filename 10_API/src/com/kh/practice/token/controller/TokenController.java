package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		
	}
	public String afterToken(String str) {
		System.out.println(str.replace(" ", ""));
		
		//split(" ")을 활용 
		String arr [] =str.split(" ");
		String re=" ";
		//토큰 사용
		StringTokenizer stn = new StringTokenizer(str, " ");
	
		while(stn.hasMoreTokens()) {
			re =stn.nextToken();
		}
		return re;
	}
	public String firstCap(String input) {
		String re= input.substring(0,1).toUpperCase();
		
		//방법 1. substring으로 문자를 하나뺴고 대문자로 변경 후 합쳐서 반환
		return re;
		
	}//다시 해봐야겟다 
	public int  findChar(String input, char one) {
	int count =0;
		char [] c = input.toCharArray();
		for(char ss : c ) {
			if(ss==one) {
				count++;
			}
		}
		return count;
		
	}
}
