package com.kh.chap01.before.run;

import com.kh.chap01.afer.model.vo.DeskTop;

import com.kh.chap01.before.model.vo.SmartPhone;

public class BeforeRun {

	public static void main(String[] args) {

		//desk 객체
		
		DeskTop d =new DeskTop("삼성", "s-01", "데탑",20000,true);
		
		
		SmartPhone sp =new SmartPhone("애플","s-d","폰",1000,"fds");
				
				/*
				 * 매 클래스마다 중복된 코드들을 일ㅇ리히 기술해주두게 되면
				 * 수정과 유지보수에서 번거로움이 생김
				 * 
				 * 상속이라는 개념을 적용시캬ㅕ서
				 * 매 클래스에 존재하는 중복된 필드 및 메서드를 하나의 클래스에 정해두고 이 클래스를 
				 * 상속시켜주는 방식으로 작업한다. 
				 */
	}

}
