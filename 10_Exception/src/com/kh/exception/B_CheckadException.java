package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckadException {
	/*
	 * 반드시 예외처리를 해줘야하는 예외들을 
	 * 주로 외부처리매체와 입출력시 발생 
	 * 
	 */

	public void method1() {
		try {
		method2();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void method2() throws IOException {
		/*
		 * Sanner와 비슷한 키보드로 값을 입력받응수 있는객체
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//예외처리 방법 1. try~catch을 총한 직접 예외 처리 
		try {
			System.out.println("아무 문자열 입력해 보세여 : ");
			//reabLine() 호출시 IOException이 발생할 수 있으므로 , 반드시 예외처리 해줘야한다. 
			String str =br.readLine();
			System.out.println("문자열 길이 :"+str.length());
		
		}catch(IOException e) {
			System.out.println("예외 발생");
		}
		//예외처리 방법2 . 
		//현재 메서드에서 예외를 처리하지 않고, 현재 메소드를 호출한 곳으로 위임하는 기능
		String str1= br.readLine();
		System.out.println(str1.length());
	}
	
	
}
