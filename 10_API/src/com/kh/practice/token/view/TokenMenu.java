package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc =  new TokenController ();
	
	public TokenMenu() {
		
	}

	public void mainMenu() {
		while(true) {
		System.out.println("1. 지정문자열 ");
		System.out.println("2. 입력 문자열 ");
		System.out.println("3. 프로그램 끝내기");
		System.out.println("메뉴 입력");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : 
			tokenMenu();
			break;
		case 2: 
			inputMenu();
			break;
		case 3: 
			System.out.println("종료");
			return;
		default:
			System.out.println("잘못입력 다시 입력");
		}
	}
}
	public void tokenMenu() {
		String str =  "J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자 :"+ str);
		System.out.println("토큰 처리 전 개수" + str.length());
		
		String stn= tc.afterToken(str);
		
		System.out.println("큰 처리 후 글자" +stn);
		System.out.println("토큰 처리 후 개수" + stn.length());
		System.out.println("모두 대문자로" + str.toUpperCase());
		
		
		
	}
	public void inputMenu() {
	
		System.out.println("문자열을 입력");
		String input =sc.next();
		tc.firstCap(input);
		System.out.println(tc.firstCap(input));
		
		System.out.println("찾을 문자를 하나 입력하세요");
		char one =sc.next().charAt(0);
		tc.findChar(input, one);
		
		System.out.println(tc.findChar(input, one));
	}
}
