package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {

		//기본 생성자 객체 생성
		User u1 = new User();
		
		User u3 = new User("user03, ",30,'M');//여기서 값을 넣는건데,,?
		System.out.println(u3.getUserId());//이거 하나만 하면 아이디만 출력됨
		
		
	}

}
